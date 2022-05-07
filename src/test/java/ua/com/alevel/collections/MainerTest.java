package ua.com.alevel.collections;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MainerTest {

    @Mock
    Book book = new Book();
    static Mainer.Lister lister = new Mainer.Lister();

    @Test
    @BeforeAll
    public static void generate() {
        for (long i = 0; i < 10; i++) {
            Book book = new Book(i, "kiril" + i, 200L + i, 400.0);
            lister.bookArrayList.add(book);
        }
        Assertions.assertEquals(10, lister.bookArrayList.size());
    }

    @Test
    @Order(1)
    public void add() {
        Book book = new Book(11L, "anton", 290L, 300.0);
        lister.bookArrayList.add(book);
        Assertions.assertEquals(11, lister.bookArrayList.size());
    }

    @Test
    @Order(2)
    public void delete() {
        lister.bookArrayList.remove(0);
        Assertions.assertEquals(10, lister.bookArrayList.size());
    }

    @Test
    @Order(3)
    public void addList() {
        List<Book> list = List.of(new Book(), new Book(), new Book());
        lister.bookArrayList.addAll(list);
        org.assertj.core.api.Assertions.assertThat(lister.bookArrayList.size())
                .isEqualTo(13).isNotEqualTo(12).returns(26, x -> x * 2);
    }

    @Test
    @Order(4)
    public void deleteAll() {
        lister.bookArrayList.clear();
        org.assertj.core.api.Assertions.assertThat(lister.bookArrayList.size()).isEqualTo(0);
    }
}

package ua.com.alevel.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Mainer {


    public static void main(String[] args) throws CloneNotSupportedException {
    }

    static class Collectioner {

    }

    static class Setter {

        Set<Book> bookHashSet = new HashSet<>();

        private void generate() {
            for (long i = 0; i < 50; i++) {
                add(1L + i, "java" + i, 240L + i, 450.0);
            }
        }


        private boolean add(Long id, String name, Long page, Double price) {
            int size = bookHashSet.size();
            Book book = new Book(id, name, page, price);
            bookHashSet.add(book);
            return bookHashSet.size() > size;
        }

        private Book delete(Long id) {
            Book book = bookHashSet.stream().filter(x -> Objects.equals(x.getId(), id)).findFirst().get();
            bookHashSet.remove(book);
            return book;
        }

        private Set<Book> sortAsc() {
            return bookHashSet.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        }

        private Set<Book> sortDesc() {
            return bookHashSet.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new));
        }
        private void iterator(){
            bookHashSet.iterator().forEachRemaining(System.out::println);
        }

    }
    static class Mapper {

        Map<Long, Book> bookHashMap = new HashMap<>();

        private void generate() {
            for (long i = 0; i < 50; i++) {
                add(i, i, "java" + i, 240L, 499.0);
            }
        }

        private void add(Long index, Long id, String name, Long page, Double price) {
            bookHashMap.put(index, new Book(id, name, page, price));
        }

        private void deleteAll() {
            bookHashMap.clear();
        }

        private void delete(Long index) {
            bookHashMap.remove(index);
        }
        private void entrySet() {
            System.out.println(bookHashMap.entrySet());
        }

    }



    static class Lister {

        List<Book> bookArrayList = new ArrayList<>();

        private void generate() {
            for (long i = 0; i < 50; i++) {
                add(1L + i, "java" + i, 240L + i, 450.0);
            }
        }

        private boolean add(Long id, String name, Long page, Double price) {
            int size = bookArrayList.size();
            Book book = new Book(id, name, page, price);
            bookArrayList.indexOf(book);
            bookArrayList.add(book);
            return bookArrayList.size() > size;
        }

        private boolean delete(int i) {
            int size = bookArrayList.size();
            bookArrayList.remove(i);
            return bookArrayList.size() < size;
        }

        private List<Book> sortAsc() {
            return bookArrayList.stream().sorted().collect(Collectors.toList());
        }

        private List<Book> sortDesc() {
//         return bookArrayList.stream().sorted((x,y) -> x.compareTo(y)).collect(Collectors.toList());
            return bookArrayList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        }
    }
}

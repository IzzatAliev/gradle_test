package ua.com.alevel.collections;

public class Book implements Comparable<Book>, Cloneable {

    private Long id;
    private String name;
    private Long page;
    private Double price;

    public Book() {
    }

    public Book(Long id, String name, Long page, Double price) {
        this.id = id;
        this.name = name;
        this.page = page;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", page=" + page +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
            Book clone = (Book) super.clone();
            return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != null ? !id.equals(book.id) : book.id != null) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (page != null ? !page.equals(book.page) : book.page != null) return false;
        return price != null ? price.equals(book.price) : book.price == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (page != null ? page.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}

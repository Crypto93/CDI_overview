package cdi.demos;

public class Book {

    private String title;
    private Float price;
    private String number;

    public Book() {
    }

    public Book(String title, Float price) {
        this.title = title;
        this.price = price;
    }

    public Book(String title, String number) {
        this.title = title;
        this.number = number;
    }

    public Book(String title, Float price, String number) {
        this.title = title;
        this.price = price;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
package oops_concept;

public class BookDemo {
    public static void main(String[] args) {
        MyAuthor author = new MyAuthor("Shaik Sufiyan", "sufiyan@example.com", 'M');
        MyBook book = new MyBook("Mastering Java", author, 450.0, 25);

        System.out.println("Book Name: " + book.getName());
        System.out.println("Price: ₹" + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Email: " + book.getAuthor().getEmail());
        System.out.println("Gender: " + book.getAuthor().getGender());
    }
}

class MyAuthor {
    private String name;
    private String email;
    private char gender;

    public MyAuthor(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class MyBook {
    private String name;
    private MyAuthor author;
    private double price;
    private int qtyInStock;

    public MyBook(String name, MyAuthor author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public MyAuthor getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(MyAuthor author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

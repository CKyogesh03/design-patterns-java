package behavioral.visitor.ecommerce;

import java.util.List;

// Step 1: Element Interface
interface Item {
    void accept(ItemVisitor visitor);
}

// Step 2: Concrete Elements
class Book implements Item {

    private double price;

    public Book(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}

class Electronics implements Item {

    private double price;

    public Electronics(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}

// Step 3: Visitor Interface
interface ItemVisitor {

    void visit(Book book);

    void visit(Electronics electronics);
}

// Step 4: Tax Visitor

class TaxVisitor implements ItemVisitor {

    @Override
    public void visit(Book book) {
        double tax = book.getPrice() * 0.05;
        System.out.println("Book Tax: " + tax);
    }

    @Override
    public void visit(Electronics electronics) {
        double tax = electronics.getPrice() * 0.18;
        System.out.println("Electronics Tax: " + tax);
    }
}

// Step 5: Discount Visitor
class DiscountVisitor implements ItemVisitor {

    @Override
    public void visit(Book book) {
        double discount = book.getPrice() * 0.10;
        System.out.println("Book Discount: " + discount);
    }

    @Override
    public void visit(Electronics electronics) {
        double discount = electronics.getPrice() * 0.15;
        System.out.println("Electronics Discount: " + discount);
    }
}

public class Main {

    public static void main(String[] args) {

        List<Item> items = List.of(
                new Book(500),
                new Electronics(10000)
        );

        ItemVisitor taxVisitor = new TaxVisitor();
        ItemVisitor discountVisitor = new DiscountVisitor();

        for (Item item : items) {
            item.accept(taxVisitor);
            item.accept(discountVisitor);
        }
    }
}

/*
OUTPUT:

Book Tax: 25.0
Book Discount: 50.0

Electronics Tax: 1800.0
Electronics Discount: 1500.0

 */
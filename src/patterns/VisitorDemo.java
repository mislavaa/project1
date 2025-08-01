package patterns;

interface Element {
    void accept(Visitor visitor);
}

class Book implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getTitle() {
        return "Книга";
    }
}

class DVD implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getTitle() {
        return "DVD диск";
    }
}

interface Visitor {
    void visit(Book book);
    void visit(DVD dvd);
}

class PriceVisitor implements Visitor {
    public void visit(Book book) {
        System.out.println(book.getTitle() + " стоит 500 руб.");
    }

    public void visit(DVD dvd) {
        System.out.println(dvd.getTitle() + " стоит 800 руб.");
    }
}

class VisitorDemo {
    public static void main(String[] args) {
        Element[] items = {new Book(), new DVD()};
        Visitor priceVisitor = new PriceVisitor();

        for (Element item : items) {
            item.accept(priceVisitor);
        }
    }
}


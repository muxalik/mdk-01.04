public class Main {
    public static void main(String[] args) {
        Printable array = [new Book(), new Magazine()];
        for (Printable element : array) {
            element.print();
        }
    }
}


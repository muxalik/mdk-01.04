public class Book implements Printable {
    String name = "book";
    public void print() {
        System.out.println();
    }

    public static void Books(Printable[] printable) {
        for (Printable element : printable) {
            if (element instanceof Book) {
                System.out.println(element.name);
            }
        }
    }
}

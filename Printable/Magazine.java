public class Magazine implements Printable {
    String name = "magazine";

    public void print() {
        System.out.println();
    }

    public static void Magazines(Printable[] printable) {
        for (Printable element : printable) {
            if (element instanceof Magazine) {
                System.out.println(element.name);
            }
        }
    }
}

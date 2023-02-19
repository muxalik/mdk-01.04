public class Main {
    public static void main(String[] args) {
        Shape figures = {new Circle(), new Rectangle()};

        for (Shape figure : figures) {
            figure.draw();
        }
    }
}


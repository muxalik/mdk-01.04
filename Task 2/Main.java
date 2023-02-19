public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("name", 10);

        phone1.move();
        phone2.talk();
    } 
}
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone1.model + "");
        System.out.println(phone1.weight + "");
        System.out.println(phone1.number + "");

        System.out.println(phone2.model + "");
        System.out.println(phone2.weight + "");
        System.out.println(phone2.number + "");

        System.out.println(phone3.model + "");
        System.out.println(phone3.weight + "");
        System.out.println(phone3.number + "");

        phone1.receiveCall("name");
        phone1.getNumber();
        
        phone2.receiveCall("name");
        phone2.getNumber();

        phone3.receiveCall("name");
        phone3.getNumber();

        phone1.receiveCall("name", "35793");
    } 
}

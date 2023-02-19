public class Phone {
    public String number = "13123";
    public String model = "afsd";
    public int weight = 132;

    public Phone(String number, String model, int weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
        new Phone("3457349", "model");
    }

    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }

    public Phone()
    {

    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {  }

    public String getNumber()
    {
        return this.number;
    }

    public void sendMessage(String ...phones)
    {
        for (String string : phones) {
            System.out.println(string);
        }
    }
}

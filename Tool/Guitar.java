public class Guitar implements Tool {
    int amount;
    public void play() {
        System.out.println("Играет гитара с количеством струн - " + this.amount);
    }
}

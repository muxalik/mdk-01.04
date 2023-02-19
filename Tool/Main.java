public class Main {
    public static void main(String[] args) {
        Tool tools = {new Drum(), new Guitar(), new Tube()}; 
        for (Tool tool : tools) {
            tool.play();
        }
    }
}


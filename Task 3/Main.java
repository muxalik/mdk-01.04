public class Main {
    public static void main(String[] args) {
        enum Season {
            Winter(-30), Spring(10), Autumn(15), Summer(30) {
                public String getDescription() {
                    return "Теплое время года";
                }
            };
            public int avgTemp;
            Season(int avgTemp){
                this.avgTemp = avgTemp;
            }
            public String getDescription() {
                return "Холодное время года";
            }
        }

        Season favourite = Season.Winter;
        System.out.println(favourite);
        for (Season season : season.values()){
            System.out.println(season);
            System.out.println(season.avgTemp);
            System.out.println(season.getDescription());
        }
    } 

    public void print(Season season)
    {
        switch(season) {
            case (Season.Winter):
                System.out.println("Я люблю зиму");
                break;

            case (Season.Spring):
                System.out.println("Я люблю весну");
                break;

            case (Season.Autumn):
                System.out.println("Я люблю осень");
                break;

            case (Season.Summer):
                System.out.println("Я люблю лето");
                break;
        }
    }
}
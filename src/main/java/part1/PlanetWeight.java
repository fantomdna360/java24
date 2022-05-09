package part1;

public class PlanetWeight {
    public static void main(String[] args) {

        System.out.println("Please enter your weight: ");
        int x = 60;
        System.out.println("Please enter the planet: ");
        String pl = "Earth";
        CalcWeight(x, pl);
        pl = "Mars";
        CalcWeight(x, pl);
    }

    public static void CalcWeight(int weight, String planet) {
        switch (planet) {
            case "Earth":
                System.out.println("Your weight: " + weight);
                break;
            case "Mars":
                System.out.println("Your weight: " + weight* .378);
                break;
        }
    }
}

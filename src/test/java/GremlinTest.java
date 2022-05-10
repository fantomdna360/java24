import part1.Gremlin;

public class GremlinTest {
    public static void main(String[] args) {
        int numGremlins = 200;
        if (numGremlins > 0) {
            Gremlin[] gremlins = new Gremlin[numGremlins];
            for (int i = 0; i < numGremlins; i++) {
                gremlins[i] = new Gremlin();
            }
            System.out.println("Здесь " + numGremlins + " гремлинов.");
        }
    }
}

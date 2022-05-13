package part2;

public class NumberDivider {
    public static void main(String[] args) {
        String[] lines  = {"2.0", "0.8"};
        if (lines.length == 2) {
            int result = 0;
            try {
                result = Integer.parseInt(lines[0])/Integer.parseInt(lines[1]);
                System.out.println(lines[0] + "/"
                        + lines[1] + " = "
                        + result);
            } catch (NumberFormatException e) {
                System.out.println("Оба аргумента должны быть целочисленные");
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль запрещено");
            }
        }
    }
}

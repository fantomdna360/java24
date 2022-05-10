package part1;

public class DataTypeCasting {
    public static void main(String[] args) {
        int a = 4;
        byte b = (byte)a;

        //objects
        int number = 100;
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        }
        System.out.println("Квадратный корень из "
                + number
                + " равен "
                + Math.sqrt(number)
        );
    }


}

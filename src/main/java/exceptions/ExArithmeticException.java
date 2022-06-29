package exceptions;

public class ExArithmeticException {
    //ArithmeticException
    //попытка деления на 0

    private static int i = 0;

    public static void main(String[] args) {
        try {
            i = 5/0;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }
}

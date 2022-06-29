package exceptions;

public class ExNegativeArraySizeException {
    //NegativeArraySizeException
    //попытка создать массив отрицательного размера

    private static int[] nNeg;

    public static void main(String[] args) {
        try {
            nNeg = new int[-5];
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

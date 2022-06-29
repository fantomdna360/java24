package exceptions;

public class ExArrayIndexOutOfBoundsException {
    //ArrayIndexOutOfBoundsException
    //программа пытается адресовать элементы за пределами массива

    private static int[] nArray;
    private static int i;

    public static void main(String[] args) {
        nArray = new int[5];
        while (true) {
            try {
                nArray[i] = i;
            } catch (Exception ex) {
                System.out.println("\n" + ex.toString());
                break;
            }
            System.out.print(i);
            i++;
        }
    }
}

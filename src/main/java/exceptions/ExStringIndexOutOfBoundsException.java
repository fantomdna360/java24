package exceptions;

public class ExStringIndexOutOfBoundsException {
    //StringIndexOutOfBoundsException
    //указать позицию, лежащую за границей строки

    private static String szSh = "123";

    public static void main(String[] args) {
        try {
            char ch = szSh.charAt(10);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

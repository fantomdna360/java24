package exceptions;

public class ExNullPointerException {
    //NullPointerException
    //попытка использовать ссылку, содержащую значение null

    private static int[] nNull;
    private static int i = 0;

    public static void main(String[] args) {
        try {
            i = nNull.length;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}

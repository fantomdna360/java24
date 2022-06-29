package exceptions;

public class ExClassCastException {
    //ClassCastException
    //выполнить преобразование классов, не связанных "узами" наследования,
    //или другим недопустимым способом

    private static Object ch = new Character('*');

    public static void main(String[] args) {
        try {
            System.out.println((Byte)ch);
        } catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

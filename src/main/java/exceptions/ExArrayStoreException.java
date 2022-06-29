package exceptions;

public class ExArrayStoreException {
    //ArrayStoreException
    //попытка записать в ячейку массива ссылку на объект неправильного типа
    private static Object szStr[] = new String[10];

    public static void main(String[] args) {
        try {
            szStr[0] = new Character('*');
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

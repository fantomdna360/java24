package part2;

import java.net.MalformedURLException;
import java.net.URL;

public class Exceptions {
    //try-catch
    public static void main(String[] args) {
        sumOfNum(5, 7);
        String line = "a";
        convertLineToFloat(line);

        line = "2";
        convertLineToFloat(line);

        //several catches
        String textValue = "35";
        int value;
        try {
            value = Integer.parseInt(textValue);
        } catch (NumberFormatException exc) {
            //do something
        } catch (ArithmeticException exc) {
            //do something
        }

        //several in one
        try {
            value = Integer.parseInt(textValue);
        } catch (NumberFormatException | ArithmeticException exc) {
            //do something
        }

        //finally
        System.out.println();
        try {
            System.out.println("Разделим 2 на 0");
            int x = 2/0;
        } catch (Exception e) {
            System.out.println("Упс! Что-то пошло не так");
        } finally {
            System.out.println("Я все равно это выведу на экран");
        }

        //throw
        System.out.println();
        try {
            System.out.println("Разделим 2 на 0");
            int x = 2/0;
        } catch (final Exception e) {
            System.out.println("Упс! Что-то пошло не так" + e.getMessage());
            throw e;
        } finally {
            System.out.println("Я все равно это выведу на экран");
        }

        try {
            loadURL("http:www");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    //throws - игнорирвоание исключения
    public static void loadURL(String address) throws MalformedURLException {
        URL page = new URL(address);
        //код, загружающий страницу
    }

    public static int sumOfNum(int x, int y) {
        return x + y;
    }

    public static Float convertLineToFloat(String str) {
        Float result = -1F;
        boolean flag = false;
        try {
            System.out.println("Пытаюсь конвертировать " + str + " в число");
            result = Float.parseFloat(str);
            flag = true;
        } catch (Exception e) {
            System.out.println("Ошибка! " + str + " не является числом");
        }
        if (flag) {
            System.out.println("Конвертация прошла успешно");
        }
        return result;
    }
}

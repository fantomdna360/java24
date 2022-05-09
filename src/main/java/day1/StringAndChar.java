package day1;

import java.util.Locale;

public class StringAndChar {
    public static void main(String[] args) {

        //сравнение
        String line1 = "Yohoo";
        String line2 = "Boooo";
        System.out.println(line1.equals(line2));

        line1 = "Boooo";
        System.out.println(line1.equals(line2));

        line1 = "boOOO";
        System.out.println(line1.equals(line2));
        System.out.println(line2.equalsIgnoreCase(line1));

        //длина
        int nameLength = line1.length();
        System.out.println(nameLength);

        //регистр
        System.out.println(line1.toLowerCase(Locale.ROOT));
        System.out.println(line2.toUpperCase(Locale.ROOT));

        //поиск подстрок
        line1 = "вертолет";
        line2 = "Нам нужен вертолет";
        System.out.println(line2.indexOf(line1));
        System.out.println(line1.indexOf("oo")); //-1 не найдена
        System.out.println(line2.contains(line1));
    }
}

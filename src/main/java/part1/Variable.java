package part1;

public class Variable {

    public static void main(String[] args) {
        //инициализация переменной
        int x;
        boolean flag;
        String line;
        char symb;

        //присвоение значения
        flag = true;
        line = "test line";
        symb = 'C';

        long salary = 100_000_000_000_000L;
        double pi = 3.14D;
        double pi2 = 3.14;

        float pi3 = 3.14F;

        //константы
        final int TOUCHDOWN = 5;

        //инкремент
        int y = 3;
        int answer1 = y++ * 10; //30

        int answer2 = ++y * 10; //40

        //двоичный формат
        int w = 0b0000_1101;
        System.out.println(w);

        int q = 0x33;
        System.out.println(q);

        //тернарный оператор
        int skilllevel = 0;
        int numberOfEnemies = 0;

        if (skilllevel > 5) {
            numberOfEnemies = 20;
        } else {
            numberOfEnemies = 10;
        }

        int numOfEnemies = (skilllevel > 5) ? 20 : 10;

    }


}

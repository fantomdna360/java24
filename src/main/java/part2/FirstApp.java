package part2;

import java.util.Scanner;

public class FirstApp {

    public static void main(String[] args) {
        boolean stop = false;
        int x = 0;
        int index = 0;
        byte b = 0b010;
        while (!stop) {
            index++;
            try {
                System.out.println("Введите число от 1 до 30. Введите 0, чтобы завершить выполнение");
                Scanner in = new Scanner(System.in);
                x = in.nextInt();
                if (x == 0) {
                    break;
                } else {
                    if (x >= 30) {
                        throw new Exception("Число х должно быть меньше 30");
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }
        System.out.println(b);
        System.out.println("Программа завершена");

    }
}

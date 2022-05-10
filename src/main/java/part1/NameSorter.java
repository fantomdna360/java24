package part1;

import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        String names[] = {
                "Иван",
                "Семен",
                "Дмитрий",
                "Наталья",
                "Ольга"
        };
        printArray(names);

        Arrays.sort(names);
        System.out.println("После сортировки:");
        printArray(names);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ":" + array[i]);
        }
    }
}

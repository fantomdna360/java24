package part2;

import java.util.ArrayList;

public class Arrays {
    //обобщенный тип
    ArrayList list1 = new ArrayList();

    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("line1");
        list2.add("line2");
        list2.add("line3");

        list2.add(0,"line0");
        list2.add(list2.size(), "lineN");
        list2.remove(2);

        for (String line : list2) {
            System.out.println(line);
        }
        System.out.println();
        System.out.println(list2.get(3));

        int hasLine = list2.indexOf("line3");
        System.out.println(hasLine);
        hasLine = list2.indexOf("line2");//-1 не существует
        System.out.println(hasLine);
    }


}

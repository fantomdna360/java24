package part1;

import java.util.ArrayList;
import java.util.Collections;

public class StringLister {
    String[] names = { "Andry", "Boris", "Ann", "Emili"};

    public StringLister(String[] moreNames) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < names.length; i++) {
            list.add(names[i]);
        }
        for (int i = 0; i < moreNames.length; i++) {
            list.add(moreNames[i]);
        }
        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
       String[] test = {"M", "N", "S"};
        StringLister lister = new StringLister(test);
    }

}

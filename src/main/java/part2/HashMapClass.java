package part2;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    HashMap phonebook = new HashMap(30, 0.7F);
    //30 - ёмкость, 07F - коэффициент нагрузки (при заполнении 70% емкость хранилища увеличится)
    //о умолчанию емкость 16, а к.н. 0.75F



    public static void main(String[] args) {
        HashMap<String, Long> phnbook = new HashMap<>();
        phnbook.put("First", 8002564187L);
        System.out.println("First: " + phnbook.get("First"));
        System.out.println("Second: " + phnbook.get("Second"));
        System.out.println("Second: " + phnbook.getOrDefault("Second",-1L));

        System.out.println("First key is contains?: " + phnbook.containsKey("First"));
        System.out.println("Second key is contains?: " + phnbook.containsKey("Second"));
        System.out.println("8002564187 value is contains?: " + phnbook.containsValue(8002564187L));

        System.out.println("phnbook has " + phnbook.size() + " element(s)");
        phnbook.put("Bookmark", 8000012547L);

        System.out.println(phnbook.entrySet());

        for (Map.Entry<String, Long> entry : phnbook.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}

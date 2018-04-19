package otherStuff;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ListSetMapDemo2 {

    public static void main(String... args) {

        Map<Integer, String> demoMap1 = new HashMap<>();
        Map<Integer, String> demoMap2 = new TreeMap<>();

        demoMap1.put(10, "Newcastle");
        demoMap1.put(2, "London");
        demoMap1.put(13, "Durham");
        demoMap1.put(4, "Birmingham");
        demoMap1.put(500, "Edinburgh");
        demoMap1.put(6, "Canterbury");

        demoMap2.putAll(demoMap1);
        System.out.println("HashMap demo".toUpperCase());
        for (Integer num : demoMap1.keySet()) {
            System.out.println(num);
        }

        for(String name : demoMap1.values()){
            System.out.println(name);
        }

        for (Map.Entry<Integer, String> entry : demoMap1.entrySet()){
            System.out.println(entry);
        }
        System.out.println("TreeMap demo".toUpperCase());
        for (Integer num : demoMap2.keySet()) {
            System.out.println(num);
        }


        for(String name : demoMap2.values()){
            System.out.println(name);
        }


    }

}





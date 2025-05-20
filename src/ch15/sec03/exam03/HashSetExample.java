package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("jbd");
        set.add("jsp");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("element = " + element);
            if (element.equals("jsp")) {
                iterator.remove();

            }
        }
        System.out.println();

        set.remove("jbd");

        for (String element : set) {
            System.out.println("element = " + element);
        }
    }
}

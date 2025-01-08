import java.util.*;

public class Trees {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        
        // hashset
        ts.add(1);
        ts.add(7);
        ts.add(3);
        ts.add(34);
        System.out.println("TreeSet:");
        // iteration; note that output is sorted
        for (Integer i : ts) {
            System.out.println(i);
        }
        // iteration; alternate version
        Integer value1 = ts.first();
        while (value1 != null) {
            System.out.println(value1);
            value1 = ts.higher(value1);
        }
        System.out.println();
        // finding
        for (int i = 1; i < 5; i++) {
            if (ts.contains(i)) {
                System.out.println("TreeSet contains " + i);
            }
            else {
                System.out.println("TreeSet does not contain " + i);
            }
        }
        System.out.println();
                
        // hashmap
        tm.put(1, "hello");
        tm.put(7, "world");
        tm.put(3, "lorem");
        tm.put(34, "ipsum");
        System.out.println("TreeMap:");
        // iteration; note that output is sorted
        for (Map.Entry<Integer, String> e : tm.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        // iteration; alternate version
        Map.Entry<Integer, String> entry1 = tm.firstEntry();
        while (entry1 != null) {
            System.out.println(entry1.getKey() + ": " + entry1.getValue());
            entry1 = tm.higherEntry(entry1.getKey());
        }
        System.out.println();
        // finding
        for (int i = 1; i < 5; i++) {
            if (tm.containsKey(i)) {
                System.out.println("TreeMap contains " + i + " with value " + tm.get(i));
            }
            else {
                System.out.println("TreeSet does not contain " + i);
            }
        }
    }
}
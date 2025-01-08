import java.util.*;

public class Heaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        // min heap
        pq1.add(1);
        pq1.add(7);
        pq1.add(3);
        pq1.add(34);
        pq1.add(42);
        System.out.println("Min Heap:");
        // iteration; note that output is not necessarily sorted
        for (Integer i : pq1) {
            System.out.println(i);
        }
        System.out.println();
        // polling
        while (!pq1.isEmpty()) {
            System.out.println(pq1.poll());
        }
        System.out.println();
                
        // max heap
        pq2.add(1);
        pq2.add(7);
        pq2.add(3);
        pq2.add(34);
        pq2.add(42);
        System.out.println("Max Heap:");
        // iteration; note that output is not necessarily sorted
        for (Integer i : pq2) {
            System.out.println(i);
        }
        System.out.println();
        // polling
        while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());
        }
    }
}
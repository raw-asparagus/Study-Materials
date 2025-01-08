import java.util.*;

public class Lists {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        LinkedList<Integer> llist = new LinkedList<Integer>();
        
        //Queue<Integer> queue2 = new Queue<Integer>(); // impossible operation; queue is an interface
        //Stack<Integer> stack2 = new LinkedList<Integer>(); // impossible operation; LinkedList does not extend Stack
        
        // stack operations
        stack.push(4);
        stack.push(1);
        stack.push(8);
        stack.push(6);
        llist.push(4);
        llist.push(1);
        llist.push(8);
        llist.push(6);
        System.out.println("Stack:");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Linked List:");
        while (!llist.isEmpty()) {
            System.out.println(llist.pop());
        }
        
        // queue operations
        queue.offer(4);
        queue.offer(1);
        queue.offer(8);
        queue.offer(6);
        llist.offer(4);
        llist.offer(1);
        llist.offer(8);
        llist.offer(6);
        System.out.println("Queue (via Linked List):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("Linked List:");
        while (!llist.isEmpty()) {
            System.out.println(llist.poll());
        }
    }
}
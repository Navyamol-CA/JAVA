import java.util.*;

public class Queue{
    public static void main(String[] args) {
        // Creating a PriorityQueue of Strings
        PriorityQueue<String> queue = new PriorityQueue<>();

        // 1. add()
        queue.add("A");
        queue.add("Q");
        queue.add("Z");
        queue.add("O");

        System.out.println("Initial Queue: " + queue);

        // 2. peek()
        System.out.println("Head element (peek): " + queue.peek());

        // 3. poll()
        System.out.println("Removed element (poll): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // 4. size()
        System.out.println("Queue size: " + queue.size());

        // 5. isEmpty()
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // 6. contains()
        System.out.println("Does queue contain 'O'? " + queue.contains(""));
        System.out.println("Does queue contain 'G'? " + queue.contains("G"));

        // 7. clear()
        queue.clear();
        System.out.println("Queue after clear(): " + queue);
        System.out.println("Is the queue empty now? " + queue.isEmpty());
    }
}

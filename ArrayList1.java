import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        // 1. add()
        list.add("Ravi");
        list.add("Vijay");
        list.add("Emi");
        list.add("Anu");
        System.out.println("Initial List: " + list);
        // 2. get()
        System.out.println("Element at index 2: " + list.get(2));

        // 3. set()
        list.set(2, "Jay");
        System.out.println("List after modification at index 2: " + list);

        // 4. remove()
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        // 5. contains()
        System.out.print("Enter element to search: ");
        String search = sc.nextLine();
        if (list.contains(search)) {
            System.out.println("List contains " + search);
        } else {
            System.out.println("List doesn't contain " + search);
        }

        // 6. Iterator
        System.out.println("Iterating through list using Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        sc.close();
    }
}

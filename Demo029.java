import java.util.ArrayList;

class ArrayListNames {
    void addFriendNames() {
        System.out.println("Names of my friends: ");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Anitha");
        arrayList.add("Charita");
        arrayList.add("Rina");
        arrayList.add("John");
        arrayList.add("Mike");
        arrayList.add("Sarah");
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("James");
        arrayList.add("Emma");
        
        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[0]);
        
        // Display the array
        for (String i : array) {
            System.out.println(i);
        }
    }
}

public class Demo029 {
    public static void main(String[] args) {
        ArrayListNames obj = new ArrayListNames();
        obj.addFriendNames();
    }
}

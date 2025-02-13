import java.util.*;

public class Demo081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leader elements: " + leaders);
    }

    public static List<Integer> findLeaders(int[] array) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = array[array.length - 1];
        leaders.add(maxFromRight);

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] > maxFromRight) {
                maxFromRight = array[i];
                leaders.add(maxFromRight);
            }
        }

        return leaders;

    }
}
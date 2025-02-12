class Demo073{
    public static void main(String[] aargs){
        int[] arr = {1,2,3,4,1,2,4,5};
        Duplicate obj = new Duplicate();
        obj.dup(arr);
    }
}
class Duplicate{
    void dup(int[] arr){
        System.out.print("Duplicate elements: ");
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        visited[j] = true;
                        break;
                    }
                }
            }
        }
    }
}
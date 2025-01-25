import java.util.HashSet;

public class CommonElements2 {
    public static void main(String[] args) {
        int arr1[] = { 4, 3, 7, 9, 2, 4 };
        int arr2[] = { 5, 1, 4, 8, 3, 5 };

        HashSet<Integer> hs = new HashSet<>();
        for (int no : arr1) {
            hs.add(no);
            
        }
        for (int no : arr2) {
            boolean b = hs.add(no);
            if (b == false) {
                System.out.print(no + " ");
            }
        }
    }
}

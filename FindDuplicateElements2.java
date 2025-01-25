import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements2 {
    public static void main(String[] args) {

        int a[] = { 3, 3,5, 4, 3, 2, 2, 1 };
        System.out.println("Duplicate Elements Are:");
        Set<Integer> s = new HashSet<>();
        for (int no : a) {
            boolean b = s.add(no);
            if (b == false) {
                System.out.print(no + " ");
            }
        }
    }
}

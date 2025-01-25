public class FindDuplicateElement1 {
    public static void main(String[] args) {
        int[] a = { 3, 5, 4, 3, 2, 2, 1 };
        System.out.println("Duplicate Values are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.print(a[j] + " ");
                }
            }
        }
    }
}

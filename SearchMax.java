public class SearchMax {

    public static void main(String[] args) {
        int a[] = { 4, 3, 5, 2, 1,6,8 };
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum element of given array is:" + max);
    }
}

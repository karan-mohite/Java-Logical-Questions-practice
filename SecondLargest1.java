public class SecondLargest1 {
    public static void main(String[] args) {
        int a[] = { 6, 8, 2, 4, 3, 1, 5, 9 };
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == 1) {
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("Second Smallest element is:" + a[1]);
    }
}

public class SecondLargest2 {
    public static void main(String[] args) {
        int a[] = { 6, 80, 2, 4, 3, 1, 5, 7, 9 };

        int largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                Second_largest = largest;
                largest = a[i];
            } else if (a[i] > Second_largest && a[i] != largest) {
                Second_largest = a[i];
            }
        }
        if (Second_largest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the list..!!");
        } else {
            System.out.println("Second largest value is" + Second_largest);
        }
    }
}

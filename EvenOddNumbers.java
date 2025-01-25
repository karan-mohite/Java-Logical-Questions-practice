import java.util.ArrayList;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int a[] = { 8, 5, 10, 12, 3, 1, 4 };

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                a1.add(a[i]);
            } else {
                a2.add(a[i]);
            }   
        }
        int total1 = 0;
        System.out.println("Even no's Are:");   
        for (int no : a1) {
            total1 = total1 + no;
            System.out.print(no + " ");
        }
        System.out.println("\nTotal No is even no's are :" + a1.size());
        System.out.println("Sum of all even no are:" + total1);
        System.out.println();
        int total2 = 0;
        System.out.println("Odd no's are:");
        for (int no : a2) {
            total2 = total2 + no;
            System.out.print(no + " ");
        }
        System.out.println("\nTotal No is odd no's are :" + a2.size());
        System.out.println("sum of all odd no are:" + total2);
    }
}

import java.util.*;

public class PrimeorNot {
    public static void main(String[] args) {
        System.out.println("Enter Any Number:");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int temp = 0;
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println(no + " is prime no");
        } else {
            System.out.println(no + " is not prime no");
        }
    }
}

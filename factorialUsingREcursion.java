import java.util.*;

public class factorialUsingREcursion {

    static int fact = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int no = sc.nextInt();
        factorialUsingREcursion ob = new factorialUsingREcursion();
        ob.calcfact(no);
        System.out.println("Factorial of " + no + " is " + fact);
    }

    void calcfact(int no) {
        if (no >= 1) {
            fact = fact * no;
            calcfact(no - 1);
        }

    }
}

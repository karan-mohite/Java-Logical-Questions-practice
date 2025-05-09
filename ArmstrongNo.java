import java.util.*;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = sc.nextInt();
        int t1 = no;
        int leng = 0;
        while (t1 != 0) {
            leng = leng + 1;
            t1 = t1 / 10;
        }
        int t2 = no;
        int arm = 0;
        while (t2 != 0) {
            int mul = 1;
            int rem = t2 % 10;
            for (int i = 1; i <= leng; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            t2 = t2 / 10;
        }
        if (arm == no) {
            System.out.println(no + " is Armstrong..!!!");
        } else {
            System.out.println(no + " is not Armstrong..!!!");
        }
    }
}

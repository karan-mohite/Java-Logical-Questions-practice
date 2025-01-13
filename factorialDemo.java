import java.util.Scanner;

public class factorialDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        int no=sc.nextInt();
        int fact=1;

        //First way(5=1*2*3*4*5)
        /*for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.err.println("Factorial of given number:"+fact);
        */
        //Second way (5=5*4*3*2*1)
        for(int i=no;i>=1;i--)
        {
            fact=fact*i;
        }
        System.err.println("Factorial of Given Number is:"+fact);
    }
}

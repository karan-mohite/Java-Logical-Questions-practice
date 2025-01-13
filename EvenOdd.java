import java.util.*;
public class EvenOdd {
    public static void main(String[] args) 
    {
        System.out.println("Enter Any Number:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if(no%2==0)
        {
            System.out.println("Given Number is Even No..!!");
        }
        else 
        {
            System.out.println("Given Number is Odd No..!!");
        }
    }
}

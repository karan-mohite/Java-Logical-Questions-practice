import java.util.*;
public class PrintTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want to :");
         int no=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(no+"*"+i+"="+no*i);
        }
    }
}

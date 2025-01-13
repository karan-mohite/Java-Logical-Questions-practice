import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number:");
            int a = sc.nextInt();
            System.out.println("Enter Second Number:");
            int b = sc.nextInt();
            System.out.println("Selct Symbol(+,_,*,/)");
            String sym = sc.next();
            int res;
            switch (sym) 
            {
                case "+":
                    res = a + b;
                    System.out.println("Addition is:" + res);
                    break;
                case "-":
                    res = a - b;
                    System.out.println("Substraction is:" + res);
                    break;
                case "*":
                    res = a * b;
                    System.out.println("Multiplication is:" + res);
                    break;
                default:
                    System.out.println("Invalid Symbol..!!!Thanks for using our software.!!");
                    break;
            }
            System.out.println("Do you want to continue(pass y for yes and n for no)");
            yn = sc.next();
        } while (yn.equals("y") || yn.equals("Y"));
    }
}

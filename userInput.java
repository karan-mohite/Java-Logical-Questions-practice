import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.next();

        System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        System.out.println("Enter your Gender:");
        char gender = sc.next().charAt(0);

        System.out.println("Enter Your Phone No:");
        long phoneno = sc.nextLong();

        System.out.println("------------------------------------");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.err.println("Phone No:" + phoneno);
    }
}

public class LeapYearDemo {
    public static void main(String[] args) {
        int year=2011;
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("leap year..!!");
                }
                else
                {
                    System.out.println("Not a leap year..!!");
                }
            }
            else
            {
                System.out.println("Leap Year..!!");
            }
        }
        else 
        {
            System.out.println("Not a leap year..!!");
        }
    }
}

public class LeapYear2 {
    public static void main(String[] args) {
        int year=2016;
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
             System.err.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}

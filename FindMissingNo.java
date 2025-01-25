public class FindMissingNo {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,9,10};

        int expected_no_elements=a.length+1;
        int total_sum=expected_no_elements*(expected_no_elements+1)/2;
        System.out.println("Total sum Including Mission No is :"+total_sum);
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Mission no is:"+(total_sum-sum));
    }
}

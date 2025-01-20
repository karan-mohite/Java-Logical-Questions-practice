public class LinearSeachInteger {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 1, 4, 2 };
        int item = 9;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.print("Item Present at" + i + "index postion");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.print("Item not found in list..!!");
        }
    }
}

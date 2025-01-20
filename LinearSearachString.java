public class LinearSearachString {
    public static void main(String[] args) {
        String arr[] = { "Karan", "Rohit", "vishal", "Abhinav", "Kajal" };
        String item = "vishal";
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                System.out.print("Item Present in " + i + "index position..!");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.print("Item is not present in the list..!!");
        }
    }
}

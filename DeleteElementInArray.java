public class DeleteElementInArray {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50 };
        int del_ele = 40;

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (del_ele == a[i]) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                count = count + 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Element Not Found..!!");
        } else {
            System.out.println("Element Deleted Successfully..!!");
            for (int i = 0; i < a.length - 1; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

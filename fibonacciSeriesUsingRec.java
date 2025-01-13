public class fibonacciSeriesUsingRec {
    static int a = 0, b = 1;

    public static void main(String[] args) {

        System.out.print(a + " " + b + " ");
        fibonacciSeriesUsingRec ob = new fibonacciSeriesUsingRec();
        ob.printfib(15);
    }

    void printfib(int i) {
        if (i >= 1) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            printfib(i - 1);
        }
    }
}

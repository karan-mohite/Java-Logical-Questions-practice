import java.util.HashSet;

public class LongSubSeq {
    public static void main(String[] args) {
        int a[] = { 3, 9, 1, 13, 10, 4, 20, 11, 12 };

        HashSet<Integer> hs = new HashSet<>();
        int long_leng = 0;
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (!hs.contains(a[i] - 1)) {
                int no = a[i];
                while (hs.contains(no)) {
                    no++;
                }
                if (long_leng < no - a[i]) {
                    long_leng = no - a[i];
                }
            }
        }
        System.out.println("Longest sub sequence length is :" + long_leng);
    }
}

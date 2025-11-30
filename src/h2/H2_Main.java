package h2;
import java.util.Arrays;
public class H2_Main {

    public static int[] change(int[] a, int[] b, int start, int end) {
        if (end <= start) {
            return new int[0];
        }

        boolean  identical = (Arrays.compare(a,b) == 0);

        if (!identical) {
            return Arrays.copyOf(a,a.length);
        }
        else {
            Arrays.sort(a);
            return Arrays.copyOfRange(a,start,end);
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(
                new int[] {2,7,1,9},
                new int[] {2,7,1,9},
                3,
                2
        )));
    }
}

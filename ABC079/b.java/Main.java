import java.util.*;

public class Main {
    public long[] arr;

    public long lucas(int n) {
        if(arr[n] != 0) return arr[n];
        if(n == 0) return 2;
        if(n == 1) return 1;
        else {
            arr[n] = lucas(n-1) + lucas(n-2);
            return arr[n];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main m = new Main();
        m.arr = new long[90];
        System.out.println(m.lucas(n));
    }
}

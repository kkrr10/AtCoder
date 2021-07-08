import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = 1, y = 1;
        for(long i=0; i<n; i++) {
            long t = sc.nextLong(), a = sc.nextLong();
            long mul = Math.max((x + t - 1) / t, (y + a - 1) / a);
            x = mul * t;
            y = mul * a;
        }
        System.out.println(x + y);
    }
}

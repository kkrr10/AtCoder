import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long len = 1, sum = 1, range=1;
        while(true) {
            if(sum <= n && n < sum + range*26) {
                n -= sum;
                for(int i=0; i<len; i++) {
                    System.out.print((char)(n / range+ 97));
                    n %= range;
                    range /= 26;
                }
                System.out.println();
                return;
            }
            range *= 26;
            sum += range;
            len++;
        }
    }
}

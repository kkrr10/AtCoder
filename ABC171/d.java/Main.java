import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        int[] table = new int[100010];
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            table[a]++;
            sum += a;
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            int b = sc.nextInt(), c = sc.nextInt();
            sum += table[b] * (c - b);
            table[c] += table[b];
            table[b] = 0;
            System.out.println(sum);
        }
    }
}

import java.util.*;

public class Main {
    // AC O(N)
    // fix end point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextInt();
        int mn = sc.nextInt(), diff = 0, ans = 0;
        for(int i=0; i<n-1; i++) {
            int a = sc.nextInt();
            if(a - mn < 0) mn = a;
            else if(a - mn > diff) {
                ans = 1;
                diff = a - mn;
            }
            else if(a - mn == diff) ans++;
        }
        System.out.println(ans);
    }

    // TLE O(NlogN)
    // fix start point
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     sc.nextInt();
    //     int[] as = new int[n];
    //     Queue<Integer> pq = new PriorityQueue<>();
    //     for(int i=0; i<n; i++) {
    //         as[i] = sc.nextInt();
    //         pq.add(-as[i]);
    //     }
    //     int ans = 0, diff = 0;
    //     for(int i=0; i<n-1; i++) {
    //         if(-pq.peek() - as[i] > diff) {
    //             ans = 1;
    //             diff = -pq.peek() - as[i];
    //         }
    //         else if(-pq.peek() - as[i] == diff) ans++;
    //         pq.remove(-as[i]);
    //     }
    //     System.out.println(ans);
    // }
}

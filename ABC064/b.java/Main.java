import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mx = -1, mn = 1001;
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            mx = Math.max(mx, a);
            mn = Math.min(mn, a);
        }
        System.out.println(mx - mn);
    }
}

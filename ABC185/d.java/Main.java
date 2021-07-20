import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        if(m == 0) {
            System.out.println(1);
            return;
        }

        ArrayList<Integer> as = new ArrayList<>();
        as.add(0);
        as.add(n+1);
        for(int i=0; i<m; i++) as.add(sc.nextInt());
        Collections.sort(as);

        int k = n;
        ArrayList<Integer> ds = new ArrayList<>();
        for(int i=0; i<as.size()-1; i++) {
            int dist = as.get(i+1) - as.get(i) - 1;
            if(dist == 0) continue;
            k = Math.min(k, dist);
            ds.add(dist);
        }

        if(ds.isEmpty()) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for(int d : ds) ans += (d + k - 1) / k;

        System.out.println(ans);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) arr.add(sc.nextInt());

        Collections.sort(arr);

        int ans = 0;
        for(int i=n-1; i>=n-k; i--) ans += arr.get(i);

        System.out.println(ans);
    }
}

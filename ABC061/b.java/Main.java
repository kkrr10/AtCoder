import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] counter = new int[n+1];
        for(int i=0; i<2*m; i++) counter[sc.nextInt()]++;
        for(int i=1; i<=n; i++) System.out.println(counter[i]);
    }
}

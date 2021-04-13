import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[100001];  // not int
        for(int i=0; i<n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            arr[a] += b;
        }
        long sum = 0;
        for(int i=1; i<=100000; i++){
            if(sum + arr[i] >= k){
                System.out.println(i);
                return;
            }
            sum += arr[i];
        }
    }
}

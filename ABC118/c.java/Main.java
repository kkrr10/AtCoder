import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), now = sc.nextInt();
        for(int i=0; i<(n-1); i++){
            int a = sc.nextInt();
            now = gcd(now, a);
        }
        System.out.println(now);
    }

    public static int gcd(int x, int y){
        if(y == 0) return x;
        else return gcd(y, x % y);
    }
}

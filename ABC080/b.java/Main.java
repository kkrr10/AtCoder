import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        int n = Integer.parseInt(tmp), f = 0;
        for(int i=0; i<tmp.length(); i++) f += tmp.charAt(i) - '0';
        if(n % f == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}

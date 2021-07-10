import java.util.*;

public class Main {
    public static int n;
    public static String s;

    public static boolean isValid(char first, char second) {
        ArrayList<Character> can = new ArrayList<>();
        can.add(first);
        can.add(second);
        for(int i=1; i<s.length(); i++) {
            int state = 0;
            if(can.get(i) == 'W') state++;
            if(can.get(i-1) == 'W') state++;
            if(s.charAt(i) == 'x') state++;
            if(state % 2 == 0) can.add('S');
            else can.add('W');
        }
        if(can.get(0) == can.get(n) && can.get(1) == can.get(n+1)) {
            for(int i=0; i<n; i++) System.out.print(can.get(i));
            System.out.println();
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.next();
        s += s.substring(0, 1);

        if(isValid('S', 'S') || isValid('S', 'W') || isValid('W', 'S') || isValid('W', 'W')) return;

        System.out.println(-1);
    }
}

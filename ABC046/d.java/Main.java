import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cntP = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p') cntP++;
        }
        System.out.println((s.length() - 2 * cntP) / 2);
    }
}

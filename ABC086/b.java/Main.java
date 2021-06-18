import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next() + sc.next());
        for(int i=4; i<=316; i++) {
            if(i*i == num) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}

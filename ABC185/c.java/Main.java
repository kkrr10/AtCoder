import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong(), ans = 1;
        for(long i=1; i<=11; i++) {
            ans *= l - i;
            ans /= i;
        }
        System.out.println(ans);
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     long l = sc.nextLong(), chi = 1, par = 1;
    //     for(long i=1; i<=11; i++) {
    //         chi *= l - i;
    //         par *= i;
    //     }
    //     System.out.println(chi / par);
    // }
}

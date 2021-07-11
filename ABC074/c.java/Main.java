import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
        Set<Integer> water = new HashSet<>(), sugar = new HashSet<>();

        // water
        for(int i=0; i<=f/(100*a); i++) {
            for(int j=0; j<=f/(100*b); j++) {
                if(i == 0 && j == 0) continue;
                water.add(100 * a * i + 100 * b * j);
            }
        }

        // sugar
        for(int i=0; i<=f/c; i++) {
            for(int j=0; j<=f/d; j++) {
                sugar.add(c * i + d * j);
            }
        }

        // all patterns
        int resWs = 100 * a, resS = 0;
        for(int w : water) {
            for(int s : sugar) {
                if(w + s <= f && e * (w + s) >= s * (100 + e) && s * resWs >= resS * (w + s)) {
                    resWs = w + s;
                    resS = s;
                }
            }
        }

        System.out.println(resWs + " " + resS);
    }
}

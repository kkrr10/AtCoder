import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((long)(Math.pow(2, (long)(Math.log(sc.nextLong()) / Math.log(2)) + 1) - 1));
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int a = inp.charAt(0) - '0';
        int[] nums = {inp.charAt(1) - '0', inp.charAt(2) - '0', inp.charAt(3) - '0'};
        for(int bit=0; bit<(1<<3); bit++) {
            int res = a;
            String ans = String.valueOf(a);
            for(int i=0; i<3; i++) {
                // if((bit & (1<<i)) == 1) {  // doesn't work
                if((bit >> i & 1) == 1) {
                    res += nums[i];
                    ans += "+" + String.valueOf(nums[i]);
                }
                else {
                    res -= nums[i];
                    ans += "-" + String.valueOf(nums[i]);
                }
            }
            if(res == 7) {
                System.out.println(ans + "=7");
                return;
            }
        }
    }
}

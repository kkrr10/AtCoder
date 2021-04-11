import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean isOK = true;
        for(int i=0; i<(n-1)/2; i++){
            if(s.charAt(i) != s.charAt((n-1)/2-1-i) || s.charAt(i) != s.charAt(n-1-i)){
                isOK = false;
                break;
            }
        }
        if(isOK) System.out.println("Yes");
        else System.out.println("No");
    }
}

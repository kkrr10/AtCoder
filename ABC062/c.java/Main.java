import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong(), w = sc.nextLong();
        ArrayList<Long> can = new ArrayList<>();

        if(h >= 3) {
            if(h % 3 == 0) can.add(0L);
            else can.add(w);
        }

        if(w >= 3) {
            if(w % 3 == 0) can.add(0L);
            else can.add(h);
        }

        long res = Long.MAX_VALUE;
        for(long i=1; i<h; i++) {
            ArrayList<Long> ss = new ArrayList<>();
            ss.add(w * i);
            ss.add((h - i) * (w / 2));
            ss.add((h - i) * ((w + 1) / 2));
            Collections.sort(ss);
            res = Math.min(res, ss.get(2) - ss.get(0));
        }
        can.add(res);

        res = Long.MAX_VALUE;
        for(long i=1; i<w; i++) {
            ArrayList<Long> ss = new ArrayList<>();
            ss.add(h * i);
            ss.add((w - i) * (h / 2));
            ss.add((w - i) * ((h + 1) / 2));
            Collections.sort(ss);
            res = Math.min(res, ss.get(2) - ss.get(0));
        }
        can.add(res);

        Collections.sort(can);
        System.out.println(can.get(0));
    }
}

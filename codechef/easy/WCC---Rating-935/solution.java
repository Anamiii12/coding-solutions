
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            String S = sc.next();

            int carlsen = 0;
            int chef = 0;

            for (int i = 0; i < 14; i++) {
                if (S.charAt(i) == 'C') {
                    carlsen += 2;
                } else if (S.charAt(i) == 'N') {
                    chef += 2;
                } else {
                    carlsen++;
                    chef++;
                }
            }

            if (carlsen >= chef) {
                if (carlsen == chef) {
                    System.out.println(55 * X);
                } else {
                    System.out.println(60 * X);
                }
            } else {
                System.out.println(40 * X);
            }
        }

        sc.close();
    }
}


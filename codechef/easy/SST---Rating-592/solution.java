
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (2 * A > B) {
                System.out.println("FIRST");
            } else if (2 * A < B) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }

        sc.close();
    }
}


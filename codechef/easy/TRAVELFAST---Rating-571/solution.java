import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int X = sc.nextInt(); 
            int Y = sc.nextInt(); 
            
            if (X < Y) {
                System.out.println("BIKE");
            } else if (X > Y) {
                System.out.println("CAR");
            } else {
                System.out.println("SAME");
            }
        }
        sc.close();
    }
}
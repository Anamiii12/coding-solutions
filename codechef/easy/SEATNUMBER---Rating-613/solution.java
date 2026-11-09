import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t>0){
            int N =sc.nextInt();

            if (N >= 1 && N <= 10) {
                System.out.println("lower double");
            }
            else if (N >= 11 && N <= 15) {
                System.out.println("lower single");
            }
            else if (N >= 16 && N <= 25) {
                System.out.println("upper double");
            }
            else {
                System.out.println("upper single");
            }

            t--;

	}
}
}
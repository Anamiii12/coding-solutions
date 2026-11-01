import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc = new Scanner(System.in);
int T =sc.nextInt();
while(T>0){
    int N =sc.nextInt();
    int X =sc.nextInt();
    int Y =sc.nextInt();
    
     if (Y % X == 0 && (Y / X) <= N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
    T--;
}
	}
}

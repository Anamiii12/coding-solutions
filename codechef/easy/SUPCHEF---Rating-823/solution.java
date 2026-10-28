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
		    int M =sc.nextInt();
		     int N =sc.nextInt();
		      int K =sc.nextInt();
		      if(M>N*K){
		          System.out.println("yes");
		      }
		    else{
		        System.out.println("no");
		    }
		    
		    T--;
		}

	}
}

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
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    if(A>=B && A>=C){
		        System.out.println(A);
		    }
		    else if(B>=A && B>=C){
		        System.out.println(B);
		    }
		    else{
		        System.out.println(C);
		    }
		    
		    
		    t--;
		}

	}
}

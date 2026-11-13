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
		    int X =sc.nextInt();
		    int Y = sc.nextInt();
		    int tot = Y*2;
		    if(X>=tot){
		        System.out.println(X/tot);
		    }
		    else{
		        System.out.println("0");
		    }
		    
		    t--;
		}

	}
}

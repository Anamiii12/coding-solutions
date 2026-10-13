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
		    int a [] = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        a[i] =sc.nextInt();
		    }
		    int first=a[0];
		    int brick =1;
		    for(int i=1;i<N;i++){
		    if(a[i]>first){
		        first=a[i];
		        brick=i+1;
		    }
		    }
		    System.out.println(brick);
		    T--;
		}

	}
}

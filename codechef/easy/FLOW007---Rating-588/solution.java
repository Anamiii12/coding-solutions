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
		    int num =N;
		    int original =num;
		    int reverse =0;
		    while(num>0){
		        int digit = num% 10;
		        reverse = reverse*10 + digit;
		        num=num/10;
		    }
		   
		        System.out.println(reverse);
		    
		    T--;
		}
		

	}
}

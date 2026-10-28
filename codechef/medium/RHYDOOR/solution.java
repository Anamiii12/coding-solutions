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
		    int l= sc.nextInt();
		String s =sc.next();
		
		int count =0;
		int streak =0;
		char prev=' ';
		for(int i=0;i<l;i++){
		   char ch =s.charAt(i);
		   if(ch==prev){
		       streak++;
		   }
		   else{
		       prev =ch;
		       streak =1;
		   }
		   if(streak ==3){
		       count++;
		       streak=0;
		       prev=' ';
		   }
		    }
		    System.out.println(count);
		    T--;
		}
	

	}
}

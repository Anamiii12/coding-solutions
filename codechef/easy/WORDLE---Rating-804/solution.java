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
		while(T>0)
{
    String S = sc.next();
    String t=sc.next();
    String ans ="";
    for(int i =0;i<5;i++){
        if(S.charAt(i)==t.charAt(i)){
            ans+="G";
        }
        else{
            ans+="B";
        }
    }
    System.out.println(ans);
    T--;
}

	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder ans = new StringBuilder();
		for(int i =0;i<s.length();i+=2){
		    ans.append(s.charAt(i));
		}
		System.out.println(ans.toString());

	}
}

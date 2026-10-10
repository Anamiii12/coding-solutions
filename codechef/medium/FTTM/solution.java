import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
 Scanner sc = new Scanner(System.in);
 String S =sc.nextLine();
 String T =sc.nextLine();

boolean found = false;

for (int i = 0; i <= S.length() - T.length(); i++) {
    int j = 0;

    while (j < T.length() &&
           S.charAt(i + j) == T.charAt(j)) {
        j++;
    }

    if (j == T.length()) {
        found = true;
        break;
    }
}

System.out.println(found ? "YES" : "NO");
	}
}

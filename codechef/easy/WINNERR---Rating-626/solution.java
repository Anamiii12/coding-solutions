import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =  new Scanner(System.in);
		int T =sc.nextInt();
		while(T>0){
		    int PA =sc.nextInt();
		    int PB =sc.nextInt();
		    int QA =sc.nextInt();
		    int QB =sc.nextInt();
		    int PEA;
		    int QEA;
		    if(PA>=PB)
		    {
		       PEA =PA;
		    }
		    else{
		        PEA =PB;
		    }
		    if(QA>=QB){
		         QEA =QA;
		        
		    }
		    else{
		        QEA =QB;
		    }
		    if(PEA >QEA){
		        System.out.println("Q");
		    }
		    else if(PEA==QEA)
		    {
		        System.out.println("TIE");
		    }
		    else{
		        System.out.println("P");
		    }
		    
		    T--;
		}

	}
}

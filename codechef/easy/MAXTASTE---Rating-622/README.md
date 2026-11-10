# MAXTASTE - Rating 622

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T13:10:51.234Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXTASTE)
# QUALIFY

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T18:25:52.720Z  

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
		int T =sc.nextInt();
		while(T>0){
		   int N = sc.nextInt();
		   if(N%4==0){
		       System.out.println("good");
		   }
		   else{
		       System.out.println("not good");
		   }
		    T--;
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUALIFY)
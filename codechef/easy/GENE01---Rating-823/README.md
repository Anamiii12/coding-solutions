# GENE01 - Rating 823

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T06:09:09.459Z  

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
		    int M =sc.nextInt();
		     int N =sc.nextInt();
		      int K =sc.nextInt();
		      if(M>N*K){
		          System.out.println("yes");
		      }
		    else{
		        System.out.println("no");
		    }
		    
		    T--;
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GENE01)
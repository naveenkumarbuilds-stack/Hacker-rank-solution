# Java If-Else

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In this challenge, we test your knowledge of using *if-else* conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

![Wikipedia if-else flow chart](https://s3.amazonaws.com/hr-challenge-images/13689/1446563087-4ec019a919-332px-If-Then-Else-diagram.svg.png)

<sub>Source: [Wikipedia](https://en.wikipedia.org/wiki/Conditional_(computer_programming))</sub>

**Task**		
Given an integer, $n$, perform the following conditional actions:

* If $n$ is odd, print `Weird`
* If $n$ is even and in the inclusive range of $2$ to $5$, print `Not Weird`
* If $n$ is even and in the inclusive range of $6$ to $20$, print `Weird`
* If $n$ is even and greater than $20$, print `Not Weird`

Complete the stub code provided in your editor to print whether or not $n$ is weird.

**Input Format**

A single line containing a positive integer, $n$.

**Constraints**

- $ 1 \le n \le 100$

**Output Format**

Print `Weird` if the number is weird; otherwise, print `Not Weird`.

**Sample Input 0**
	
    3
    
**Sample Output 0**
	
    Weird

**Sample Input 1**
	
    24
    
**Sample Output 1**
	
    Not Weird

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T06:04:34.718Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2==0){
            if(n>=2 && n<=5){
                System.out.println("Not Weird");
            }else if(n>=6 && n<=20){
                System.out.println("Weird");
            }else if(n>20){
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
        
        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-if-else/problem)
/*
CATALAN NUMBER
Given an integer N, generate the Nth Catalan Number.
Input Format: First and only line of input contains a non-negative integer N.
Output Format: Print the Nth Catalan Number.
Constraints: 0 <= N <= 10
Input 3
Output 5
Explanation:  3rd Catalan Number: 6C3 / 4 = 5

Where Catalan Numbers Are Used
Catalan Numbers appear in many problems like:
    1. Counting valid parentheses combinations
    2. Number of Binary Search Trees (BSTs)
    3. Ways to triangulate a polygon
    4. Counting mountain-valley paths
    5. Dynamic Programming problems
    6. Catalan Numbers count the number of valid structures or arrangements in many recursive problems.
*/
//SOURCE CODE:
import java.io.*;
import java.util.*;
public class Main {
    public static long factorial(int n)
      {
       long fact = 1;
        for( int i=1; i<=n; i++)
        {
            fact = fact * i;
        }
        return fact;
      }
      public static void main(String [] args)
      {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long catalan = factorial(2*n)/(factorial(n+1) * factorial(n));
        System.out.println(catalan);
      } }

//Solution 2
import java.util.Scanner;
public class Main {
    static long catalan(int n) {
        long dp[] = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(catalan(n));
    }
}

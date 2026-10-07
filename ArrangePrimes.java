/*
ARRANGE PRIMES
Given an integer N. Print the count of permutations for the numbers from 1 to N, considering that prime numbers should be placed at positions with prime indices (1 - based indexing). As the result might be a large number, print the output % 1e9 + 7.
Input Format The first and only line of input contains an integer N.
Output Format Print the count of permutations.
Constraints 1 ≤ N ≤ 100
Example
Input 8
Output 576
Explanation Self Explanatory
*/

//SOURCE CODE

import java.io.*;
import java.util.*;
public class Main {
    public static long factorial(int n)
    {
        long f = 1;
        for(int i=1; i<=n; i++)
            f = (f * i) % 1000000007;
        return f;
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
       int p = 0;
       for(int i : primes)
            if(i <= n) p++;
        long result = ( factorial(p) * factorial(n-p) ) % 1000000007;
        System.out.println(result);
        
    }
}

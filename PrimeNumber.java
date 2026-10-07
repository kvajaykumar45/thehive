/*
PRIME OR NOT
Given a positive integer - N, check whether the number is prime or not.
Input Format The first and only line of input contains an integer - N.
Output Format Print "Yes" if the number is prime, "No" otherwise.
Constraints 1 <= N <= 108
Example
Input 11
Output Yes
Explanation
Self Explanatory
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        if(n==0 || n==1)
        {
            System.out.println("No");
            return;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



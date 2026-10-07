/*
HALF DIAMOND WITH NUMBERS
Given a value N, print a half diamond pattern with numbers. See examples for more details.
Input Format First and only line of input contains an integer N.
Output Format Print the half diamond pattern using numbers.
Constraints 1 <= N <= 100
Example
Input 5 
Output
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
1 2 3 4 
1 2 3 
1 2 
1 
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
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    for(int i=n-1; i>=1; i--)
    {
        for(int j=1; j<=i; j++)
            System.out.print(j+" ");
        System.out.println();
    }
    }
}

/*
TRIANGLE PATTERN

Given a value N, print a right-angled triangle pattern. See examples for more details.
Input Format First and only line of input contains an integer N.
Output Format Print the right angled triangle pattern.
Constraints 1 <= N <= 100
Example
Input
5 
Output
* 
* * 
* * * 
* * * * 
* * * * * 
Explanation Self Explanatory
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
                System.out.print("* ");
        }
        System.out.println();
       }
    }
}

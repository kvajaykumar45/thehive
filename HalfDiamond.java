/*
HALF DIAMOND
Print half diamond pattern using '*'. See the example for more details.
Input Format The first and only line of input contains a single integer N.
Output Format For the given integer, print the half-diamond pattern.
Constraints 1 <= N <= 50
Example
Input 5
Output
*
**
***
****
*****
****
***
**
*
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
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }}

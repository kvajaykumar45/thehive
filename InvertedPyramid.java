/*
INVERTED PYRAMID
Print a hollow half-inverted pyramid pattern using '*'. See the example for more details.
Input Format The first and only line of input contains a single integer N.
Output Format For the given integer, print hollow half-inverted pyramid pattern.
Constraints 1 <= N <= 50
Example
Input 6
Output
* * * * * *
*       *
*     *
*   *
* *
*
Explanation Self Explanatory
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                if(i==n) System.out.print("* ");
                else
                {
                    if(j==1 || j==i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


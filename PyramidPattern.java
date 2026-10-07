/*

PYRAMID PATTERN
Print pyramid pattern using '*'. See the example for more details.
Input Format The first and only line of input contains a single integer N - the size of the pyramid.
Output Format For the given integer, print the pyramid pattern.
Constraints 1 <= N <= 50
Example
Input 5
Output    
    *
   ***
  *****
 *******
*********
Explanation Self Explanatory
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int spaces=n-1;
        for(int i=1; i<=n; i++)
        {
            for(int k=spaces; k>=1; k--)
                System.out.print(" ");
            spaces--;            
            for(int j=1; j<=2*i-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}


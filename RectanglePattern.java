/*
RECTANGLE PATTERN
Print rectangle pattern. See the example for more details.

Input Format The first and only line of input contains a single integer N.

Output Format For the given integer, print a rectangle pattern as shown in the example.

Constraints 1 <= N <= 50

Example
Input 5

Output
5432*
543*1
54*21
5*321
*4321

Explanation Self Explanatory
*/
//SOURCE CODE:
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=1; i<=n; i++)
       {
            for(int j=n; j>=1; j--)
            {
                if(j==i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}

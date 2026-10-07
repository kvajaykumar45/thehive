/*
FILLED RECTANGLE
Given N and M, print the following rectangle pattern of size N × M. See examples for more details.
Input Format The first line of input contains N and M.
Output Format Print the rectangle pattern.
Constraints
1 <= N <= 10
1 <= M <= 10
Example
Input 3 5
Output
*****
*****
*****
Explanation Self Explanatory
*/
//SOURCE CODE:
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

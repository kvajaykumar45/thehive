/*

SUM OF TWO MATRICES
Given two matrices A and B each of size N x M, print the sum of the matrices (A + B).
Note: Try solving it by declaring only a single matrix.  

Input Format The first line of input contains N, M - the size of the matrices. It's followed by 2*N lines, each containing M integers - elements of the matrices. The first N lines are for matrix A and the next N lines are for matrix B.

Output Format Print the sum of the 2 given matrices (A + B).

Constraints
1 <= N, M <= 100
-10^9 <= ar[i] <= 10^9

Example
Input
2 3
5 -1 3
19 8 4
4 5 -6
1 -2 12
Output
9 4 -3
20 6 16

Explanation Self Explanatory
*/
//Solution
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int a[][] = new int[n][m];
       for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                a[i][j] = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                int x = sc.nextInt();
                int y = a[i][j] + x;
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}

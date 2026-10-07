/*
MATRIX COLUMN SUM
Given a matrix of size N x M, print column-wise sum, separated by a newline.

Input Format The first line of input contains N, M - the size of the matrix, followed by N lines each containing M integers - elements of the matrix.

Output Format Print the column-wise sum of the matrix, separated by newline.

Constraints
1 <= N, M <= 100
-100 <= ar[i] <= 100

Example
Input
2 2
5 -1
19 8
Output
24
7

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
        {
            for(int j=0; j<m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++)
        {
            int sum = 0;
            for(int j=0; j<n; j++)
            {
                sum = sum + a[j][i];
            }
            System.out.println(sum);
        }
    }
}

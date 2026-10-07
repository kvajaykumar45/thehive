/*
Transpose Matrix

Given a matrix of size N x M, print the transpose of the matrix.

Input Format
The first line of input contains N, M - the size of the matrix. It is followed by N lines each containing M integers - elements of the matrix.

Output Format
Print the transpose of the given matrix.

Constraints
1 <= N, M <= 100
-10^9 <= ar[i] <= 10^9

Example
Input
2 2
5 -1
19 8

Output
5 19
-1 8

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
        for(int i=0; i<m; i++)
        {
        for(int j=0; j<n; j++)
            System.out.print(a[j][i] + " ");
        System.out.println();
        }        
    }
}

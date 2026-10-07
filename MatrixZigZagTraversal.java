/*
Matrix Zig-Zag Traversal

Given a matrix of size N x M, print the matrix in zig-zag order. Refer example for more details.

Input Format
The first line of input contains N, M - the size of the matrix. It is followed by N lines each containing M integers - elements of the matrix.

Output Format
Print the matrix elements in zig-zag order.

Constraints
1 <= N, M <= 100
-10^6 <= mat[i][j] <= 10^6

Example
Input
3 3
5 9 -2
-3 4 1
2 6 1

Output
5 9 -2 1 4 -3 2 6 1

Explanation

Self Explanatory
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
        if(i%2 == 0)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(a[i][j] + " ");
            }
        }
        else
        {
            for(int j=m-1; j>=0; j--)
            {
                System.out.print(a[i][j] + " ");
            }
        }
       }
    }
}

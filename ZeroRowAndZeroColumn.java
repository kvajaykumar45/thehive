/*
ZERO ROW AND ZERO COLUMN
Given a matrix A of size N x M. Elements of the matrix are either 0 or 1. If A[i][j] = 0, set all the elements in the ith row and jth column to 0. Print the resultant matrix.

Input Format
The first line of input contains N, M - the size of the matrix A. It is followed by N lines each containing M integers - elements of the matrix.

Output Format
Print the resultant matrix.

Constraints
1 <= N, M <= 100
A[i][j] ∈ {0,1}

Example
Input
4 5
0 1 1 0 1 
1 1 1 1 1 
1 1 0 1 1 
1 1 1 1 1 

Output
0 0 0 0 0 
0 1 0 0 1 
0 0 0 0 0 
0 1 0 0 1 

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
    int row[] = new int[n];
    int col[] = new int[m];
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            a[i][j] = sc.nextInt();
            if(a[i][j] == 0)
            {
                row[i] = 1;
                col[j] = 1;
            }
        }
    }
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            if(row[i] == 1 || col[j] == 1)
                a[i][j] = 0;
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
}

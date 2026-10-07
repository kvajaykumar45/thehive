/*
SPARSE MATRIX
Given a matrix of size N x M, print whether it is a sparse matrix or not.
Please note that if a matrix contains 0 in more than half of its cells, then it is called a sparse matrix.

Input Format
The first line of input contains N, M - the size of the matrix, followed by N lines each containing M integers - elements of the matrix.

Output Format
Print "Yes" if the given matrix is a sparse matrix, otherwise print "No".

Constraints
1 <= N, M <= 100
0 <= ar[i] <= 10^9

Example
Input
2 3
5 0 0
0 8 0
Output
Yes

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
    int count = 0;
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            if ( sc.nextInt() == 0 )
                count++;
        }
    }
    if(count > (n*m)/2)
        System.out.println("Yes");
    else
        System.out.println("No");
      }
}

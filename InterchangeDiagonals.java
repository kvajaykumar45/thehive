/*
INTERCHANGE DIAGONALS

Given a matrix A of size NxN, interchange the diagonal elements from top to bottom and print the resultant matrix.

Input Format
First line of input contains N - the size of the matrix. It is followed by N lines each containing N integers - elements of the matrix.

Output Format
Print the matrix after interchanging the diagonals.

Constraints
1 <= N <= 100
1 <= A[i][j] <= 10 4

Example
Input
4
5 6 7 8
13 14 15 16
1 2 3 4
9 10 11 12
Output
8 6 7 5
13 15 14 16
1 3 2 4
12 10 11 9

Explanation Self Explanatory
*/

//Solution

import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[][] = new int[n][n];
for(int i=0; i<n; i++)
for(int j=0; j<n; j++)
a[i][j] = sc.nextInt();
int row = 0;
int d1 = 0, d2 = n-1;
for(row = 0; row<n; row++)
{
int temp = a[row][d1];
a[row][d1] = a[row][d2];
a[row][d2] = temp;
d1++;
d2--;
}
for(int i=0; i<n; i++)
{
for(int j=0; j<n; j++)
System.out.print(a[i][j] + " ");
System.out.println();
}
}
}



/*
IMAGE FLIP
You are given an N x M binary matrix called "image". You need to perform the following operations on the matrix (in order) and return the resulting image: 
    1. Flip the image horizontally: This involves reversing the order of elements in each row of the matrix. For example, [1,0,1,0,0,0] becomes [0,0,0,1,0,1]
    2. Invert the image: This involves replacing 0s with 1s and 1s with 0s in the entire matrix. For example, [0,0,0,1,0,1] becomes [1,1,1,0,1,0]

Input Format
 Line of input contains N - number of rows and M - number of columns. The next N lines contains M integers each denoting the elements of the matrix image.

Output Format
You have to print the resultant matrix image.

Constraints
1 <= N <=100
1 <= M <=100

Example
Input
2 2
1 0
0 1
Output
1 0
0 1
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
      int i=0, j=0, k=0;
      for( i=0; i<n; i++)
      {
            for(j=0, k=m-1; j<k; j++, k--)
            {
                int t = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = t; 
            }
            
      }
      for(int p=0; p<n; p++)
      {
        for(int q=0; q<m; q++)
            System.out.print(1-a[p][q] + " ");
        System.out.println();
      }      
    }
}


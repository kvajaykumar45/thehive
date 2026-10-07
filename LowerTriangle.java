/*
LOWER TRIANGLE
Given a square matrix of size N × N, find the sum of its lower triangle elements. 

Input Format The first line of input contains N - the size of the matrix. It is followed by N lines each containing N integers - elements of the matrix.

Output Format Print the sum of the lower triangle of the matrix. 

Constraints
 1 <= N <= 100
 -10^5 <= ar[i] <= 10^5

Example
Input
 3
 5 9 -2 
 -3 4 1 
 2 6 1 
Output 15

Explanation The sum of the lower triangle matrix is 5 - 3 + 4 + 2 + 6 + 1 = 15.

*/
//Source code

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                int x = sc.nextInt();
                if(j<=i)
                    sum = sum + x;
            }
        }
        System.out.println(sum);
    }
}

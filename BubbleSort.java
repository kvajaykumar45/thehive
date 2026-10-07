/*
IMPLEMENT BUBBLE SORT
Given an array of size N, implement Bubble Sort.

Input Format
The first line of input contains an integer N - the size of an array. The second line contains the elements of the array.

Output Format
For each iteration of Bubble Sort, print the array elements.

Constraints
1 <= N <= 20
1 <= A[i] <= 10^3

Example
Input
6
5 8 10 15 3 6
Output
5 8 10 3 6 15
5 8 3 6 10 15
5 3 6 8 10 15
3 5 6 8 10 15
3 5 6 8 10 15

Explanation Self Explanatory
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = s.nextInt();
        for(int i=0; i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j] > a[j+1])
                {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                }
            }
            for(int k:a)
                System.out.print(k + " ");
                System.out.println();
        }
    }
}

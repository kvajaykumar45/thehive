/*
MERGE TWO SORTED ARRAYS
You are given two sorted integer arrays A and B of size N and M respectively. Print the entire data in sorted order.

Input Format First line of input contains N - the size of the array. The second line contains N integers - the elements of the first array. The third line contains M - the size of the second array. The fourth line contains M integers - the elements of the second array.

Output Format For each test case, print the entire data in sorted order with each element separated by a space, on a new line.

Constraints
1 <= N <= 10^3
1 <= M <= 10^3
-10^5 <= A[i], B[i] <= 10^5

Example
Input
7
1 1 5 8 10 12 15
5
-1 2 4 5 7

Output -1 1 1 2 4 5 5 7 8 10 12 15

Explanation Self Explanatory
*/
//Solution

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = s.nextInt();
        int m = s.nextInt();
        int b[] = new int[m];
        for(int i=0;i<m;i++)
            b[i] = s.nextInt();
        int c[] = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(a[i] < b[j])
            {
                c[k] = a[i];
                i++;
                k++;
            }
            else
            {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<n)
        {
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<m)
        {
            c[k] = b[j];
            k++;
            j++;
        }
    for( int h: c)
        System.out.print(h+" ");
    }
}


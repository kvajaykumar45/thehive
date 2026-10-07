/*
IMPLEMENT INSERTION SORT
Given an array of size N, implement Insertion Sort.

Input Format
The first line of input contains an integer N - the size of an array. The second line contains the elements of the array.

Output Format
For each iteration of Insertion Sort, print the array elements.

Constraints
1 <= N <= 20
1 <= A[i] <= 10^3

Example
Input
5
8 7 1 2 4
Output
7 8 1 2 4
1 7 8 2 4
1 2 7 8 4
1 2 4 7 8

Explanation Self Explanatory
*/
//Solution
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        for(int i=1; i<n; i++)
        {
            int key = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            for(int k=0; k < a.length; k++)
                System.out.print(a[k] + " ");
            System.out.println();

        }
    }
}

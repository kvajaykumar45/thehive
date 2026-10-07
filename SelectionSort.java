/*
IMPLEMENT SELECTION SORT
Given an array of size N having unique elements, implement Selection Sort.
Note: Implement Selection Sort by selecting smallest element at every step.

Input Format The first line of input contains an integer N - the size of an array. The second line contains the elements of the array.

Output Format
For each iteration of Selection Sort, print the array elements.

Constraints
1 <= N <= 20
1 <= A[i] <= 10^3

Example
Input
6
5 8 10 15 3 6
Output
3 8 10 15 5 6
3 5 10 15 8 6
3 5 6 15 8 10
3 5 6 8 15 10
3 5 6 8 10 15

Explanation Self Explanatory
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n; i++)
        a[i] = sc.nextInt();
    for(int i=0; i<(n-1); i++) {
        int minIndex = i;
        for(int j=i+1; j<n; j++) {
            if(a[j] < a[minIndex]) {
                minIndex = j;
            }
        }
        int temp = a[i];
        a[i] = a[minIndex];
        a[minIndex] = temp;
        for(int k: a)
            System.out.print(k);
        System.out.println();
    }
    }
}

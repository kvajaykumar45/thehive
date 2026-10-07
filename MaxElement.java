/*
MAX ELEMENT IN ARRAY
Find the maximum element from the given array of integers.
Input Format The first line of input contains N - the size of the array and the second line contains the elements of the array.
Output Format
Print the maximum element of the given array.
Constraints
1 <= N <= 10^3
-10^9 <= ar[i] <= 10^9
Example
Input
5
-2 -19 8 15 4
Output
15
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
        a[i] = s.nextInt();
    int max = a[0];
    for(int k=1;k<n;k++)
        if(a[k] > max)
            max = a[k];
    System.out.println(max);
    }
}


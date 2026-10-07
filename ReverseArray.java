/*
REVERSE ARRAY
Print the array in reverse order.
Note:   Try solving this using recursion. Do not use any inbuilt functions / libraries for your main logic.  
Input Format
The first line of input contains N - the size of the array and the second line contains the elements of the array.
Output Format
Print the given array in reverse order.
Constraints
1 <= N <= 100
0 <= ar[i] <= 1000
Example
Input 5
2 19 8 15 4
Output 4 15 8 19 2
Explanation Self Explanatory
*/
import java.io.*;
import java.util.*;
public class Main {
    static void reverse(int a[], int start, int end)
    {
        if(start>=end) return;
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        reverse(a, start+1 , end-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s. nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i] = s.nextInt();
        reverse(a,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
    }}

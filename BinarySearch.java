/*
IMPLEMENT BINARY SEARCH

Given a sorted array A of size N, along with an integer target K, implement Binary Search to find the target K in the given array.

Input Format The first line of input contains an integer N - the size of an array and target K. The second line contains the elements of the array.

Output Format For each iteration of Binary Search, print the values of low, high, and mid. At the end, if the target K is found in the array, print "True" otherwise, print "False".

Constraints
1 <= N <= 20
1 <= A[i] <= 10^3

Example
Input-1
9 12
1 4 6 7 10 11 12 20 23
Output-1
0 8 4
5 8 6
True

Input-2
10 21
3 5 8 11 15 17 19 23 26 30
Output-2
0 9 4
5 9 7
5 6 5
6 6 6
False

Explanation Self Explanatory
*/

//Solution
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)  a[i] = s.nextInt();
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low <= high){
            mid = (low + high)/2;
            System.out.println(low + " " + high + " " + mid);
            if(a[mid] == k){
                System.out.println("True");
                break;
            }
            else if(k > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if(low > high)
            System.out.println("False");
    }
}




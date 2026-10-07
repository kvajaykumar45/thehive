/*

FIRST AND LAST
You are given an array A of size N, containing integers. Your task is to find the first and last occurrences of a given element X in the array A and print them.
Input Format The input consists of three lines. The first line contains a single integer N - the size of the array. The second line contains N integers separated by a space, representing the elements of the array A. The third line contains a single integer X.
Output Format Print the indexes of the first and last occurrences separated by a space.
Note It is guaranteed that X is always present in the given array.
Constraints
1 <= N <= 103
1 <= A[i] <= 105
X ∈ A
Example
Input 10
1 3 5 7 9 11 3 13 15 3
3
Output 1 9
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
        int x = s.nextInt();
        int first=0, last=0;
        for(int i = 0; i<n; i++)
            if(a[i] == x) {
                first = i;
                break;
            }
        for(int i = n-1; i>=0; i--)
            if(a[i] == x)  {
                last = i;
                break;
            }
        System.out.print(first + " "+last);
     }
}

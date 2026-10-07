/*
INTERSECTION OF ARRAYS
Given two arrays of size N and M respectively, print the unique elements that appear in both arrays.
Note: The order of elements in the output must follow their first occurrence in the first array.

Input Format The first line of input contains N - the size of the first array, followed by the elements of the first array. The next line contains a single integer M - the size of the second array, followed by the elements of the second array.

Output Format Print the unique elements that appear in both arrays separated by a space.

Constraints
1 <= N, M <= 1000
-1000 <= ar[i] <= 1000

Example
Input
8
4 1 5 9 3 4 8 9
6
6 4 9 4 8 1
Output 4 1 9 8

Explanation The unique elements present in both the arrays are - 4, 1, 9, 8.
*/
//Solution
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n,m;
       n = sc.nextInt();
       int a[] = new int[n];
       for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
       m = sc.nextInt();
       int b[] = new int[m];
       HashSet<Integer> s1 = new HashSet<>();
       HashSet<Integer> s2 = new HashSet<>();
       for(int i=0; i<m; i++)
       {
            b[i] = sc.nextInt();
            s1.add(b[i]) ;
       }
       for(int i=0; i<n; i++)
       {
        if( s1.contains(a[i]) && !s2.contains(a[i]))
        {
          s2.add(a[i]);
          System.out.print(a[i]+" "); 
        }
       }
    }
}

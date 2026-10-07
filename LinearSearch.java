/*
IMPLEMENT LINEAR SEARCH
Given an array of integers, search a given key in the array using linear search.
Note:  Do not use any inbuilt functions / libraries for your main logic.  

Input Format The first line of input contains two integers N and K. N is the size of the array and K is the key. The second line contains the elements of the array.

Output Format If the key is found, print the index of the array, otherwise print -1.

Constraints 
1 <= N <= 10^2
0 <= arr[i] <= 10^9

Example
Input
5 15
-2 -19 8 15 4
Output
3

Explanation Self Explanatory
*/

//Solution

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        int i=0;
        for(i=0; i<n; i++)  a[i] = sc.nextInt();
        for(i=0; i<n; i++) {
            if( a[i] == k) {
                    System.out.println(i);
                    break;
                }
        }
        if(i==n)
            System.out.println(-1);
    }
}



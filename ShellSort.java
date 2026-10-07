/*
SHELL SORT
Given an array of size N, implement Shell Sort.
Note: Initially gap=N/2, for each iteration, gap reduces by half.

Input Format
The first line of input contains an integer N - the size of an array. The second line contains the elements of the array.

Output Format
For each iteration of Shell Sort, print the array elements.

Constraints
1 <= N <= 20
1 <= A[i] <= 10^3

Example
Input
8
4 3 12 1 13 9 5 6

Output
4 3 5 1 13 9 12 6
4 1 5 3 12 6 13 9
1 3 4 5 6 9 12 13

Explanation
    • Initially gap = 4, apply Insertion Sort for elements at distance 4, you will get [4 3 5 1 13 9 12 6]
    • For gap = 2, again apply Insertion Sort for elements at distance 2, you will get [4 1 5 3 12 6 13 9]
    • For gap = 1, apply Insertion Sort for elements at distance 1, you will get [1 3 4 5 6 9 12 13]
*/

//Solution
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        for(int gap=n/2; gap>=1; gap=gap/2){
            for(int i=gap; i<n; i++){
                int temp = a[i];
                int j = i;
                while(j>=gap && a[j-gap]>temp){
                    a[j] = a[j-gap];
                    j = j - gap;
                }
                a[j] = temp;
            }
            for(int k:a)
                System.out.print(k+" ");
            System.out.println();
        }
     }
}

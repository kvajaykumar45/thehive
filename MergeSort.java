/*

IMPLEMENT MERGE SORT
Given an array of size N, implement Merge sort.

Input Format The first line of input contains an integer N - the size of an array. The second line contains the elements of the array.

Output Format For each merge call of Merge Sort, print the array elements.

Constraints
1 <= N <= 20
1 <= A[i] <= 10^3

Example
Input
6
5 1 3 15 10 4
Output
1 5 3 15 10 4 
1 3 5 15 10 4 
1 3 5 10 15 4 
1 3 5 4 10 15 
1 3 4 5 10 15 

Explanation Self Explanatory
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void printarray(int a[]){
        for(int i:a)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void merge(int a[], int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[high - low + 1];
        while(i <= mid && j<=high) {
            if(a[i] <= a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        while(i<=mid)
            temp[k++] = a[i++];
        while(j<=high)
            temp[k++] = a[j++];
        for(int x=0; x<temp.length; x++)
            a[low+x] = temp[x];
        printarray(a);
    }
    public static  void mergesort(int a[], int low, int high){
        if(low<high) {
            int mid = (low + high)/2;
            mergesort(a, low, mid);
            mergesort(a, mid+1, high);
            merge(a, low, mid, high);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i=0; i<n; i++) a[i] = sc.nextInt();
        mergesort(a, 0, n-1);
    }
   }

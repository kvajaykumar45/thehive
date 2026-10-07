/*
MEAN MEDIAN MODE
Given a sorted array A, containing N integers. Calculate and print their Mean, Median and Mode.
1. For both the Mean and Median, display the values with precision up to two decimal places.
2. Print the first Mode that you encounter from the left hand side.
Input Format First line of input contains integer N - the size of the array. Second line of input contains N integers - elements of the array A. Output Format Print Mean, Median and Mode, separated by spaces.
Constraints
1 <= N <=10^4
0 <= A[i] <=100
Example
Input 8
1 2 3 4 5 5 6 6
Output 4.00 4.50 5
Explanation:
The Mean is 32 / 8 = 4.00 [rounded to 2 decimals]
The Median is (4+5) / 2 = 4.50
For the given example, {5, 6} represents the Mode of the array, we'll print 5 as it's the first Mode encountered.
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        int sum = 0;
        for(int i=0; i<n; i++)  {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        double mean = (double)sum/n;
        double median = 0;
        if(n%2 != 0)
            median = a[n/2];
        else
            median = (a[n/2] + a[(n/2)-1]) / 2.0;
        int mode = a[0];
        int count = 0, maxcount = 0;
        for(int i=0; i<n; i++) {
            count = 0;
            for(int j=0; j<n; j++) {
                if(a[i] == a[j])
                    count++;
            }
            if(maxcount < count) {
                maxcount = count;
                mode = a[i];
            }
        }
        System.out.printf("%.2f %.2f %d", mean, median, mode);
    } }

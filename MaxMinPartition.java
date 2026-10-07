/*

MAX MIN PARTITION
Given an array D of positive integers, your goal is to divide D into two separate arrays, E and F, under the following conditions: 
    • Each element in array D must belong to either array E or array F 
    • Both arrays E and F are non-empty 
    • The objective is to minimize the partition's value, calculated as the absolute difference between the maximum value of array E (denoted as max(E)) and the minimum value of array F (denoted as min(F))
Print the resulting integer that represents the value of this partition.

Input Format
The first line of input contains N. The second line of input contains an array of size N.

Output Format
Print the minimized partition value.

Constraints
2 ≤ N ≤ 10^4
1 ≤ Di ≤ 10^9

Example
Input
6
7 1 14 16 30 4
Output
2
Explanation
We can partition the array D into E = [7, 1, 14, 4] and F = [16, 30].The maximum element of the array E is equal to 14.The minimum element of the array F is equal to 16.The value of the partition is |14 - 16| = 2. It can be proven that 2 is the minimum value out of all the partitions.
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int  a[] = new int[n];
       for(int i=0; i<n; i++)
        a[i] = sc.nextInt();
       Arrays.sort(a);
       int min = 1000000000;
       for(int i=0; i<n-1; i++)
        {
            int d = a[i+1] - a[i];
            if( d < min)
                min = d;
        }
        System.out.println(min);

    }
}


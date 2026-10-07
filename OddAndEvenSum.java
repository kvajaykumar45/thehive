/*ODD AND EVEN SUM
Given an array of size N. Print the sum of odd and even numbers separated by a space.
Input Format The first line of input contains N - the size of the array and the second line contains elements of the array.
Output Format Print the sum of odd elements followed by sum of even elements.
Constraints
1 <= N <= 10^3
1 <= ar[i] <= 10^6
Example
Input 5
4 6 9 2 5
Output 14 12
Explanation Self Explanatory
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int odds=0, evens=0;
        for(int i=0; i<n; i++)
            if(a[i] % 2 == 0) evens += a[i];
            else odds += a[i];
        System.out.print(odds+" ");
        System.out.print(evens);
    }
}

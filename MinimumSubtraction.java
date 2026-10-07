/*

MINIMUM SUBTRACTION
Given a number N, find a number X. On subtracting X from N, N-X should be a power of 2. Find the minimum value of X.
Input Format: The first and only line of input contains an integer N.
Output Format: Print the value X.
Constraints: 2 <= N <= 109
Input 10
Output 2
Explanation
N = 10
If we subtract X = 2 from N = 10, N - X = 8 is a power of 2.
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = 1;
        while(p*2 <= n)
        {
            p = p * 2;
        }
        int x = n - p; 
        System.out.println(x);
    }
}
//Time: O(log n)


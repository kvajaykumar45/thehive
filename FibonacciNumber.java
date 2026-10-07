/*
FIBONACCI NUMBER
For a given positive integer - N, compute Nth Fibonacci number.
Input Format: The first and only line of input contains a positive number - N.
Output Format: Print the Nth fibonacci number.
Constraints: 0 <= N <= 20
Input 4
Output 3
Explanation
The fibonacci series: 0, 1, 1, 2, 3, 5, 8,......  At 4th position, we have 3.
*/

//SOURCE CODE:
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long a = 0;
        long b = 1;
        long c = 0;
        if(n == 0)
        {
            System.out.println(a);
            return;
        }
        if(n==1)
        {
            System.out.println(b);
            return;
        }
        for(int i = 1; i<n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}

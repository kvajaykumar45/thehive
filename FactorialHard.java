/**
FACTORIAL HARD
Given a non-negative number - N. Print N!
Input Format The first and only line of input contains a number - N.
Output Format Print factorial of N. Since the result can be very large, print result % 1000000007
Constraints 0 <= N <= 106
Examples
Input 1 3
Output 1 6
Input 2 165
Output 2 994387759
Explanation Self Explanatory
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long fact = 1;
        for(int i = 1; i<=n; i++)
            fact = (fact * i) % 1000000007;
       System.out.println(fact);
    }
}

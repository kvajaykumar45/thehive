/*
NUMBER REVERSE
Given a number N, reverse the number.
Input Format: The first and only line of input contains a integer N.
Output Format: Print the reversed number.
Constraints:  -109 <= N <= 109
Input 1: 1344
Output 1: 4431
Input 2: -3467
Output 2: -7643
*/

//SOURCE CODE:

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long n = S.nextLong();
        boolean sign = false;
        if(n<0) 
        {
            n = -n;
            sign = true;
        }            
        long r=0, s=0;
        while(n>0)
        {
            r = n%10;
            s = s * 10 + r;
            n = n/10;
        }
        if (sign) s = -s; 
        System.out.print(s);
    }
}

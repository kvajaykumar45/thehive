/*


NARCISSISTIC NUMBERS
Given an integer N, check whether it is a Narcissistic number or not.
Note that a Narcissistic number (also known as Armstrong number) is a number that is the sum of its own digits each raised to the power of the number of digits.

Input Format The first and only line of input contains an integer - N.
Output Format Print "Yes" if the number is Narcissistic number, "No" otherwise.
Constraints 0 <= N <= 106
Example
Input 8208
Output Yes
Explanation 84 + 24 + 04 + 84 = 8208
*/

//SOURCE CODE:

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n;
        int r;
        int count = 0;
        while(n!=0)
        {
            n = n/10;
            count++;
        }
        n = m;
        int sum = 0;
        while(n!=0)
        {
            r = n % 10;
            sum = sum + (int) Math.pow(r,count);
            n = n / 10;
        }
        if(sum == m)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
    
    

/*
HARSHAD NUMBERS
Given an integer N, check whether it is a Harshad number or not.
Note that a Harshad number is an integer, that is divisible by the sum of its digits.
Input The first and only line of input contains a integer - N.
Output Print "Yes" if the number is Harshad number, "No" otherwise.
Constraints 1 <= N <= 109
Example
Input 18
Output Yes
Explanation
18 / (1 + 8) = 2
As 18 is divisible by the sum of its digits, it is a Harshad number
*/
//SOURCE CODE:
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0, r = 0;
        int m = n;
        while(n!=0)
        {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        if(m % sum == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
            
    }
}

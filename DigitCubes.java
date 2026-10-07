/*

DIGIT CUBES
Given an integer N, check whether the number is equal to the sum of cubes of its digits.
Input Format The first and only line of input contains an integer - N.
Output Format Print "Yes" if the number satisfies the given condition, "No" otherwise.
Constraints 0 <= N <= 109
Example
Input 153
Output Yes
Explanation 13 + 53 + 33 = 153
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n;
        int sum = 0;
        int r = 0;
        while(n!=0)
        {
            r = n % 10;
            sum = sum + r*r*r ;
            n = n / 10;
        }
        if(m == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

/*
FACTORIAL
Given a non-negative number - N. Print N!
Input Format: The first and only line of input contains a number - N.
Output Format: Print factorial of N.
Constraints: 0 <= N <= 10
Input 5
Output 120
Explanation: Self Explanatory
*/

//SOURCE CODE:

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long f = 1;
        for(int i=1;i<=n;i++)
        {
            f = f * i;
        }
        System.out.println(f);
    }
}

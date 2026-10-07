/*
NUMBER OF MULTIPLES
Given a positive integer - N. Print the number of multiples of 3, 5 between [1, N].
Input Format
The first and only line of input contains a positive integer - N.
Output Format
Print the number of multiples of 3, 5 between [1, N].
Constraints
1 <= N <= 1018
Example
Input 12
Output  6
Explanation
Multiples of 3 and 5 in range of 1 to 12 are 3, 5, 6, 9, 10, 12.
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long count = (n/3) + (n/5) - (n/15);
       System.out.println(count);
    }
}



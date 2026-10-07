/*
NATURAL NUMBERS SUM
Given positive integer - N, print the sum of the first N natural numbers.
Input Format The first and only line of input contains a positive integer - N.
Output Format Print the sum of the first N natural numbers.
Constraints 1 <= N <= 104
Example
Input 4
Output 10
Explanation Self Explanatory
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
}

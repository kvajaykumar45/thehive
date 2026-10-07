
/*
BALANCED SPLITTING 
A balanced string is one that contains an equal quantity of 'L' and 'R' characters. Given a balanced string S, your task is to split it into some number of substrings such that each substring is also balanced. Output the maximum number of balanced strings you can obtain through this splitting process.

Input Format The first and only line of input contains string S.

Output Format Print the maximum number of balanced strings you can obtain with the splitting process.

Constraints 2 ≤ len(A) ≤ 1000

Example
Input LRRLLLLRRLRR

Output 3

Explanation The string 'LRRLLLLRRLRR' can be split into three substrings: "LR", "RL" and "LLLRRLRR," each containing the same number of 'L' and 'R' characters.
*/

//Java Solution:

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0, balStrings = 0;
    for(int i=0; i<s.length(); i++)
    {
        if(s.charAt(i) == 'L')
            count++;
        else
            count--;
        if(count == 0)
            balStrings++;
    }
    System.out.println(balStrings);
    }
}




/*

Time Complexity: O(N)

The for loop runs once for every character in the string. If the string length is N, there are N iterations.

Space Complexity: O(1)

You only use a few integer variables: count, balStrings, and i. 


*/

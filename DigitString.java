/*
DIGIT STRING 
Given a string, check if it contains only digits.

Input Format The input contains a string S, consisting of ASCII characters.
Output Format Print "Yes" if the string contains only digits, and "No" otherwise.
Constraints 1 <= len(S) <= 100

Example
Input 123456786543
Output Yes
*/

Java Solution:
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i;
        int n = s.length();
        for(i=0; i<n; i++) 
        {
            if( !Character.isDigit(s.charAt(i)))
            {
                System.out.println("No");
	    return;
            }
        }
            System.out.println("Yes");
    }
}

/*
Time: O(N) worst case
Space: O(1) extra space.
*/


/*
CHECK THE SQUARE STRING 
Given a string, you have to check whether it is a square string. A string is said to be square if it is some string written twice in a row. For example, the strings "cc", "zazazaza", and "papa" are square. But "abc", and "abaaaabb" are not square.
Input Format Input contains a string S.
Output Format  Print "Yes" if the string S is square. Otherwise print "No". 

Constraints
 1 <= |S| <= 103
 'a' <= S[i] <= 'z'

Example
Input aabaabaabaab
Output Yes

Explanation  The given string can be formed by adding the string "aabaab" 2 times.
*/

//Java Solution

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if(n%2 != 0)
            System.out.println("No");
        else if(s.substring(0, n/2).equals(s.substring(n/2)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

Time Complexity: O(N)
Because substring() and equals() together may examine up to N characters.

Space Complexity: O(N) in modern Java, since substring() creates new strings.
Here, N = s.length().



/*
PREFIX SUFFIX EQUALITY 
Given strings S and T. Print "Yes", if T is both a prefix and a suffix of S, otherwise "No". 

Input Format First and only line of input contains two strings separated by a space.

Output Format Print "Yes", if T is both a prefix and a suffix of S, otherwise "No".

Constraints
 1 <= len(S), len(T) <= 1000
 'a' <= S[i], T[i] <= 'z'

Example
Input
smartinterviewssmart smart

Output Yes
*/
//Java Solution
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.startsWith(t) && s.endsWith(t))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
/*
Time Complexity
	startsWith() and endsWith() may compare up to |T| characters.
	So:Time: O(|T|), which is O(N) in the worst case.

Space: O(1) extra space. No additional data structure is created.
*/



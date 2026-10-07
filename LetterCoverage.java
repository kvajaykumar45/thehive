
/*
LETTER COVERAGE 
Given a string, check if it contains all the letters from a to z, in a case-insensitive manner.

Input Format Input contains a string S, consisting of lowercase and uppercase characters.
Output Format Print "Yes" if the string contains all the letters of the alphabet, and "No" otherwise.
Constraints
1 <= len(S) <= 100
S[i] ∈ ('a' - 'z', 'A' - 'Z')

Example
Input askhtwsflkqwertYuioPasdfghjklZxcvbnm
Output Yes
*/

//Java Solution

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next().toLowerCase();
       HashSet<Character> h = new HashSet<>();
       for(int i=0; i<s.length(); i++) {
            h.add(s.charAt(i));
       }
       if(h.size() == 26)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

/*

Time Complexity
toLowerCase() → O(N)
Loop through all characters → O(N)
HashSet.add() → O(1) on average per character

So overall: Time Complexity: O(N)
where N = length of the string.

Space Complexity

The HashSet stores distinct characters.
Maximum lowercase English letters = 26
So practically, extra space is O(1) because 26 is a constant.

Space Complexity: O(1)

*/


/*
MIN DIGIT
Tom and Jerry are playing a game with an integer N that doesn't contain any zeros in its decimal representation. Tom starts first and, on his turn, he can swap any two digits of the integer that are in different positions. Jerry follows by always removing the last digit of the integer. The game continues in turns until there's only one digit left. Determine the smallest integer Tom can achieve at the end if he plays optimally.

Input Format The first and only line of input consists an integer N consisting of digits 1 - 9.

Output Format Print the smallest integer that Tom can achieve.

Constraints 10 < N < 10^9

Example
Input 132
Output 1
Explanation
Tom can swap 3 and 1, N becomes 312. After that Jerry deletes the last digit, N becomes 31. Then Tom swaps 3 and 1, N becomes 13 and Jerry deletes 3, so the answer is 1.
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       char mindigit = '9';
       for(int i=0; i<s.length(); i++)
       {
            if(mindigit > s.charAt(i))
                mindigit = s.charAt(i);
       }
       System.out.println(mindigit);
    }
}

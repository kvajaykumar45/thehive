/*
LONG PRESSED KEYS 
Observing your friend as they type their name on the keyboard, you notice that occasionally a key might be held down longer, causing a character to appear multiple times. After examining the sequence of typed characters, determine whether it's possible that the typed sequence corresponds to your friend's name. Print true if typed_name corresponds to your friend_name, otherwise print false.

Input Format The first and only line of input contains two strings separated by space.

Output Format Print true if typed_name corresponds to your friend_name, otherwise print false.

Constraints 1 ≤ len(friend_name), len(typed_name) ≤ 3000

Example 
Input
raju rrraaajjjjjjjjjjjjjjuuuu

Output true
*/
Java Solution:
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String friendName = sc.next();
    String typedName = sc.next();
    int i=0, j=0;
    while(j < typedName.length())
    {
        if( i < friendName.length() && friendName.charAt(i) == typedName.charAt(j))
        {
            i++;
            j++;
        }
        else if(j>0 && typedName.charAt(j) == typedName.charAt(j-1))
        {
            j++;
        }
        else
        {
            System.out.println("false");
            return;
        }
    }
    System.out.println(i == friendName.length()? "true" : "false");
    }
}

/*
For this solution:
while (j < typed.length()) {
    ...
    j++;
}
we scan the typed string only once.
Let:
    • n = friend.length()
    • m = typed.length()
Time Complexity: O(m)
Each character of typed is processed at most once.
Since m can be different from n, the precise complexity is:
O(m)
If we express it in terms of the total input size, it's O(n + m).
            ​ Space Complexity: O(1)
We only use a few variables:
int i = 0;
int j = 0;
So:
Complexity
Result
Time
O(n + m)
Space
O(1)

For this problem, this is essentially optimal, because we need to examine the input characters to determine whether the strings match.

    • Input space: O(n + m) 
    • Auxiliary space: O(1) 
    • Total space: O(n + m) 
In coding interviews, when we normally say space complexity, we usually mean auxiliary space, so the answer is O(1).
*/

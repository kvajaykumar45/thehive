
/*
ANAGRAM BASIC
Given two strings A and B consisting of lowercase characters, check if they are anagrams. An anagram is a rearrangement of the letters of one word to form another word. In other words, some permutations of string A must be the same as string B.

Input Format The first line of input contains string A. The second line of input contains string B.

Output Format Print "TRUE" if A and B are anagrams otherwise "FALSE".

Constraints 1 ≤ len(A), len(B) ≤ 104

Example
Input
smartinterviews
viewsintersmart

Output TRUE


Method		Time		Space
HashMap		O(n)		O(n)
Sorting		O(n log n)	O(n)
*/


//Java Solution
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int m = a.length();
        int n = b.length();
        if (m!=n)
        {
            System.out.println("FALSE");
            return;
        }
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        int x;
        char ch;
        for(int i=0; i<m; i++)
        {
            ch = a.charAt(i);
            if(h1.containsKey(ch))
            {
                x = h1.get(ch);
                h1.put(ch, x+1);
            }
            else
            {
                h1.put(ch, 1);
            }
        }

        for(int i=0; i<n; i++)
        {
            ch = b.charAt(i);
            if(h2.containsKey(ch))
            {
                x = h2.get(ch);
                h2.put(ch, x+1);
            }
            else
                h2.put(ch, 1);
        }
        
        for(char key: h1.keySet())
        {
            if(h2.containsKey(key))
            {
                if(!h1.get(key).equals(h2.get(key)))
                {
                    System.out.println("FALSE");
                    return;
                }
            }
            else
            {
                System.out.println("FALSE");
                return;
            }
        }

        for(char key: h2.keySet())
        {
            if(h1.containsKey(key))
            {
                if(!h1.get(key).equals(h2.get(key))) 
                {
                    System.out.println("FALSE");
                    return;
                }
            }
            else
            {
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");
    }
}


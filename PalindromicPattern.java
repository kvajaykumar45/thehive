/*
PALINDROMIC PATTERN
Print a palindromic right-angled triangle pattern using characters. See the example for more details.
Input Format The first and only line of input contains an integer N - the size of the pattern.
Output Format For the given integer N, print the palindromic right-angled triangle pattern.
Constraints
1 <= N <= 26
Example Input 4
Output
A
A B A
A B C B A
A B C D C B A
Explanation Self Explanatory
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<i; j++)
                System.out.print(s.charAt(j)+" ");
            for(int j=i-2; j>=0; j--)
                System.out.print(s.charAt(j)+" ");
            System.out.println();
       }
    }
}

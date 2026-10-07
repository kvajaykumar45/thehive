/*NUMBER OF RECTANGLES
Vikram has a collection of N squares with a side length of 1. Print the number of different rectangles that can be formed using these squares.

Input Format The first and only line of input consists an integer N.

Output Format Print the number of different rectangles that can be formed using these squares.
Constraints  1 ≤ N ≤ 100
Example
Input  6
Output  8
Explanation  We can create different rectangles of sizes 1×1, 1×2, 1×3, 1×4, 1×5, 1×6, 2×2, 2×3.
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int count = 0;
       for(int i = 1; i <= n; i++)
       {
        for(int j = i; i * j <= n; j++)
            count++;
       }
       System.out.println(count);
    }
}

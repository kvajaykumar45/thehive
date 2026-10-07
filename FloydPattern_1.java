/*

FLOYD PATTERN - 1
Print a right-angled triangle pattern using integers. See the example for more details.
Input Format The first and only line of input contains a single integer N - the size of the triangle.
Output Format For the given integer, print the right-angled triangle pattern.
Constraints 1 <= N <= 50
Example
Input 6
Output
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
Explanation Self Explanatory
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

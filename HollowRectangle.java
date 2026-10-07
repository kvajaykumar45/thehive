/*

HOLLOW RECTANGLE
Print a hollow rectangle pattern using '*'. See the example for more details.

Input Format The input contains two integers W - width of the rectangle and L - length of the rectangle.

Output Format For the given integers W and L, print the hollow rectangle pattern.

Constraints
2 <= W <= 50
2 <= L <= 50

Example
Input 5 4
Output
*****
*   *
*   *
*****
Explanation Self Explanatory
*/
//SOURCE CODE:
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(i==1 || i==l)
                    System.out.print("*");
                else
                {
                    if(j==1 || j==w)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
           }
            System.out.println();
        }
    }
}

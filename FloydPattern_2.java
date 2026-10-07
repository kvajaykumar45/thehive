/*
FLOYD PATTERN - 2
Print a right-angled triangle pattern. See the example for more details.
Input Format The first and only line of input contains a single integer N - the size of the triangle.
Output Format For the given integer, print the right-angled triangle pattern.
Constraints 1 <= N <= 50
Example
Input
5
Output
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
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
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                a[j][i] = num;
                num++;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<n; j++)
            {
                if(a[i][j]==0)
                    System.out.print(" ");
                else
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }       
    }
}

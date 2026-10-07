/*

SUPER ONE
Given a matrix of 0’s and 1’s, check if there exists a Super One. Please note that a Super One is a 1, which is surrounded by 0 on all 8 sides.

Input Format
The first line of input contains N, M - the size of the matrix. It's followed by N lines each containing M integers - elements of the matrix.

Output Format
Print "Yes" if the matrix contains Super One, otherwise print "No".

Constraints
1 <= N, M <= 100
0 <= ar[i] <= 1

Example
Input
4 4
1 0 0 0
0 0 0 1
0 1 0 0
0 0 0 0
Output
Yes

Explanation There's one occurrence of Super One in the matrix at [2,1]. Value 1 at index [0,0] and Value 1 at index [1,3] are not Super One's because they are not surrounded by eight 0's.
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int m = s.nextInt();
     int a[][] = new int[n][m];
     for(int i=0; i<n; i++)
     {
        for(int j=0; j<m; j++)
        {
            a[i][j] = s.nextInt();
        }
     }
     for(int i=1; i<=n-2; i++)
     {
        for(int j=1; j<=m-2; j++)
        {
            if(a[i][j] == 1)
            {
                if(a[i-1][j-1] == 0 && a[i-1][j] ==0 && a[i-1][j+1] ==0 && a[i][j+1] ==0 && a[i+1][j+1]==0 && a[i+1][j] ==0 && a[i+1][j-1] ==0 && a[i][j-1] ==0)
                    {
                        System.out.println("Yes");
                        return;
                    }
            }
        }
     }
    System.out.println("No");
   }
}


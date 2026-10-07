/*
ALTERNATE SEATING
You are given an integer N, denoting the number of people who need to be seated, and a list of M seats, where 0 represents a vacant seat and 1 represents an already occupied seat. Find whether all N people can find a seat, provided that no two people can sit next to each other.

Input Format
The first line of the input contains N denoting the number of people. The second line of input contains M denoting the number of seats. The third line of input contains the seats.

Output Format

If all N people can find seats, print YES otherwise NO.
Constraints
1 ≤ N ≤ 10^5
1 ≤ M ≤ 10^5
Ai ∈ {0, 1}

Example
Input
2
7
0 0 1 0 0 0 1
Output
YES

Explanation The two people can sit at index 0 and 4.
*/
//Solution
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        for(int i=0; i<m; i++)
        a[i] = sc.nextInt();
        int count = 0;
        boolean left = false;
        boolean right = false;
        for(int i = 0; i<m; i++) {
            if(a[i] == 0) {
                left = (i==0 || a[i-1]==0);
                right = (i==m-1 || a[i+1]==0);
            }
            if(left && right){
                    count++;
                    a[i] = 1;
                }
        }
        if(count >= n)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
}

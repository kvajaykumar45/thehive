


/*
TRIANGLE VALIDATOR
Given the length of 3 sides of a triangle, check whether the triangle is valid or not.

Input Format The first and only line of input contains three integers A, B, C - Sides of the triangle.

Output Format Print "Yes" if you can construct a triangle with the given three sides, "No" otherwise.

Constraints
1 <= A, B, C <= 10^9

Example
Input
4 3 5
Output
Yes

Explanation Self Explanatory
To form a valid triangle, the sum of any two sides must be greater than the third side.
a+b>c,  a+c>b,  b+c>a
*/
//Solution
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

/*
QUADRATIC EQUATION
Given a quadratic equation in the form ax2 + bx + c, (only the values of a, b and c are provided). Find the roots of the equation.
Note: Display the values with precision up to two decimal places, and for imaginary roots of the form (x + iy) or (x - iy), print "Imaginary Roots".
Input Format First and only line of input contains three integers a, b, c separated by spaces.
Output Format Print the roots of the quadratic equation separated by spaces.
Constraints -1000 <= a, b, c <= 1000

Examples
Input 1 1 -2  1
Output 1 1.00 1.00

Input 2 1 7 12
Output 2 -3.00 -4.00

Input 3 1 1 1
Output 3 Imaginary Roots

Explanation
Example 1: Roots are real and equal, which are (1,1)
Example 2: Roots are real and distinct, which are (-3,4)
Example 3: Roots are imaginary, which are (-0.5 + i0.866025, -0.5 - i0.866025)
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = (b*b) - (4*a*c);
        double r1, r2;
        if(d==0)
        {
            r1 = r2 = -b/(2.0*(a));
            System.out.printf("%.2f %.2f", r1, r2);
        }
        else if(d>0)
        {
            r1 = (-b + Math.sqrt(d))/(2.0*a);
            r2 = (-b - Math.sqrt(d))/(2.0*a);
            System.out.printf("%.2f %.2f", r1, r2);
        }
        else
        {
            System.out.println("Imaginary Roots");
        }
    }
}


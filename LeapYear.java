/*
LEAP YEAR
Given an year X, check if X is a leap year or not.
Input Format The first and only line of input contains a single integer X - the year.
Output Format Print 'Yes' if the X is a leap year, 'No' otherwise.
Constraints 1 <= X <= 104
Example
Input 2024
Output Yes 
Explanation Self Explanatory
*/
//SOURCE CODE:
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%400 == 0)
            System.out.println("Yes");
        else if(n%100 == 0)
            System.out.println("No");
        else if(n%4 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

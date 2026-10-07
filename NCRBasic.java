/*
NcR BASIC
Given two numbers N and R, find the value of NCR.
Input Format: The first and only line of input contains integers N and R.
Output Format: Print the value of NCR
Constraints: 1 <= N <= 10, 1 <= R <= 10
Input 5 3
Output 10
Explanation Self Explanatory
*/
//SOURCE CODE

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        long num=1, den=1; 
       for(int i=n; i>(n-r); i--)
        {
            num = num * i;
        }
        for(int i=1;i<=r;i++)
            den = den * i;
        System.out.println(num/den);
    }
}




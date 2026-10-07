/*
NUMBER OF DAYS

Given 2 unique dates, print the number of days between the 2 given dates.

Input Format The first and only line of input contains 2 dates separated by space.

Output Format Print the number of days.

Constraints
The given dates are valid dates between the years 1971 and 2100.

Example
Input
2000-01-16 1999-12-30
Output
17
Explanation Self Explanatory
*/
//SOURCE CODE:

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.next();
        String date2 = sc.next();
        LocalDate l1 = LocalDate.parse(date1);
        LocalDate l2 = LocalDate.parse(date2);
int days = (int) Math.abs(ChronoUnit.DAYS.between(l1,l2));
        System.out.println(days);

    }     
}


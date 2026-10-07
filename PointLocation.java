/*

POINT LOCATION
There is a line that goes through the points P1 = (x1,y1) and P2 = (x2,y2). 
There is also a point P3 = (x3,y3). Print whether P3 is located on the left or right side of the line or if it touches the line when we are looking from P1 to P2. 

Input Format The first and only line of input contains 6 integers x1, y1, x2, y2, x3, y3 separated by spaces.

Output Format For given input, print "LEFT", "RIGHT" or "TOUCH".

Constraints   -10^4 ≤ x1, y1, x2, y2, x3, y3 ≤ 10^4 and  x1 ≠ x2 or y1 ≠ y2

Examples
Input 1  1 1 5 3 2 3
Output 1  LEFT

Input 2 1 1 5 3 4 1
Output 2  RIGHT

Input 3  1 1 5 3 3 2
Output 3  TOUCH

Explanation 
Use the formula, let v = (x2​−x1​)(y3​−y1​)−(y2​−y1​)(x3​−x1​)
If v > 0, third point is on the left, if v < 0, then the third point is on the right, if v == 0, then it touches the line
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int x3 = s.nextInt();
        int y3 = s.nextInt();
        int v = (x2 - x1)*( y3 - y1) - (y2 - y1)*( x3 - x1);
        if(v > 0)
            System.out.println("LEFT");
        else if(v < 0)
            System.out.println("RIGHT");
        else    
            System.out.println("TOUCH");


            }
}

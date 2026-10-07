/*



GAUNTLETS

You have a collection of N gauntlets, each with a specific color represented by A[i]. Your goal is to maximize the number of pairs by repeatedly pairing up gauntlets of the same color. Determine the maximum number of pairs that can be formed.

Input Format The first line of input contains an integer N. The second line of input contains an array of size N.

Output Format For the given input, print a single line representing the answer.

Constraints
1 ≤ N ≤ 10^2
1 ≤ Ai ≤ 10^3

Example
Input 6
4 1 7 4 1 4
Output 2

Explanation You can do the operation twice as follows. 
    • Choose two gauntlets with the color 1 and pair them. 
    • Choose two gauntlets with the color 4 and pair them.
Then, you will be left with one gauntlet with the color 4 and another with the color 7, so you can no longer do the operation. There is no way to do the operation three or more times, so you should print 2
*/
//Solution

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      HashMap<Integer, Integer> map = new HashMap<>();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0; i<n; i++)
        a[i] = sc.nextInt();
      for(int i=0; i<n; i++)
      {
        if(map.containsKey(a[i]))
        {
            map.put(a[i], map.get(a[i]) + 1);
        }
        else
        {
            map.put(a[i], 1);
        }
    }
    int pairs = 0;
    for(int value: map.values())
    {
       if(value >= 2) pairs = pairs + (value/2);
     }
    System.out.println(pairs);
}
}

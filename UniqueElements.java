/*
UNIQUE ELEMENTS
Print unique elements of the array in the same order as they appear in the input.
Note: Do not use any inbuilt functions / libraries for your main logic.  
Input Format The first line of input contains the size of the array - N and the second line contains the elements of the array.
Output Format Print unique elements from the given array.
Constraints
1 <= N <= 100
0 <= ar[i] <= 10^9
Example
Input 7
5 4 10 9 21 4 10
Output 5 9 21
Explanation Self Explanatory
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<> ();
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i])+1);
            }
            else
            {
                map.put(a[i], 1); 
            }
        }
       for(int i=0;i<n;i++)
       {
            if(map.get(a[i]) == 1)
                System.out.print(a[i] + " " );
       }
    }
}

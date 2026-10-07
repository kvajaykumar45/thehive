/*
FIND DUPLICATE NUMBER IN ARRAY
Find a duplicate element in the given array of integers. There will be only a single duplicate element in the array.
Note: Do not use any inbuilt functions / libraries for your main logic  Input Format
The first line of input contains the size of the array - N and the second line contains the elements of the array, there will be only a single duplicate element in the array.
Output Format Print the duplicate element from the given array.
Constraints
2 <= N <= 100
0 <= ar[i] <= 10s
Example
Input 8
5 4 10 9 21 10 3 10
Output 10
Explanation Self Explanatory
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<n; i++){  
count = 0;
            for(int j=0; j<n; j++){
                if(a[i] == a[j])
                {
                    count++;
                    if(count>1)
                    {
                        System.out.println(a[i]);
                        return;
                    }
                }
            }
        }
    }
}

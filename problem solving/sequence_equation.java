/*
 you have given a sequence of n integers, p(1),p(2),...,p(n)
 where each element is distinct and satisfies 1<=p(x)<=n. 
For each x where 1<=x<=n, that is x increments from 1 to n, find any integer y such that p(p(y)) = x 
and keep a history of the values of y in a return array.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        BufferedReader s1=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(s1.readLine().trim());
        String str=s1.readLine().trim();
        String splt[]=str.split(" ");
        HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            int num=Integer.parseInt(splt[i].trim());
            h1.put(num,i+1);
        }
        for(int i=1;i<=n;i++)
        {
            int get1=h1.get(i);
            int get2=h1.get(get1);
            System.out.println(get2);
        }
    }
}

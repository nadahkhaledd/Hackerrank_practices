/*
There is a large pile of socks that must be paired by color. 
Given an array of integers representing the color of each sock, 
determine how many pairs of socks with matching colors there are.
*/

import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int[] colors;
        int res=0;
        int n=in.nextInt();
        colors = new int[101];
        for(int i=0;i<n;i++)
        {
            int t=in.nextInt();
            colors[t]++;
            if(colors[t]%2 == 0)
            {
                res++;
                colors[t] = 0;
            }
        }
        System.out.println(res);
    }
}

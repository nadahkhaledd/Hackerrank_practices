/*
Given five positive integers, find the minimum and maximum values
 that can be calculated by summing exactly four of the five integers.
 Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++){
            arr[i] =  in.nextLong();
        }
        for (int i = 0; i < 5; i++){
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        
        }
        max = sum - max;
        min = sum - min;
        System.out.println(max + " " + min);
    }
}

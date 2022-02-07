/*
Given an array of integers and a positive integer k, 
determine the number of (i,j) pairs where i < j and ar[i]+ar[j] is divisible by k.
*/

import java.io.*;
import java.math.*;
import java.util.*;

class Result {

    /*
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int c = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int d = (ar.get(i)+ar.get(j))%k;
                if( d == 0)
                    c++;
            }
        }
        return c;

    }

}
/*
There is a string,s , of lowercase English letters that is repeated infinitely many times. 
Given an integer,n , find and print the number of letter a's in the first n letters of the infinite string.
*/

import java.io.*;
import java.util.*;

class Result {

    public static long repeatedString(String s, long n) {
        long rep = n/s.length();
        long add = n%s.length();
        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a') {
                res += rep;
                if (i < add)
                    res++;
            }
        }
        return res;

    }

}
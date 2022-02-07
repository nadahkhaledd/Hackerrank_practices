/*
Maria plays college basketball and wants to go pro. 
Each season she maintains a record of her play. 
She tabulates the number of times she breaks her season record for most points and least points in a game.
 Points scored in the first game establish her record for the season, and she begins counting from there.
Given the scores for a season, 
determine the number of times Maria breaks her records
 for most and least points scored during the season.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static ArrayList<Integer> breakingRecords(ArrayList<Integer> scores) {
        int mx = scores.get(0), mn = scores.get(0), mxc =0, mnc=0;
        ArrayList <Integer> res = new ArrayList<Integer>();
        for(int i : scores)
        {
            if(i > mx)
            {
                mx =i;
                mxc++;
            }
            else if(i < mn)
            {
                mn =i;
                mnc++;
            }
        }
        res.add(mxc);
        res.add(mnc);
        return res;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
       ArrayList <Integer> val = new ArrayList<Integer>();
       ArrayList <Integer> res = new ArrayList<Integer>();
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       for(int i=0; i<num; i++)
            val.add(in.nextInt());
        
        res = Result.breakingRecords(val);
        
        for(int i : res)
            System.out.print(i + " ");

        
    }
}
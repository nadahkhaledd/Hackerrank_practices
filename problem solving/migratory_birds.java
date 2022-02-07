/*
Given an array of bird sightings where every element represents a bird type id,
 determine the id of the most frequently sighted type.
 If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
Note: there are only 5 types (1,2,3,4,5)
*/

import java.io.*;
import java.math.*;
import java.util.*;

class Result {

    public static int migratoryBirds(int[] arr) {
        int mx=0, type =1;
        for(int i=1; i<6; i++)
        {
            if(arr[i] > mx)
            {
                    mx = arr[i];
                    type = i;
            }
        }
        return type;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[6];
        for(int i=0; i < n; i++){
            arr[in.nextInt()]++;
        }
        
        System.out.println(Result.migratoryBirds(arr));
    }
}

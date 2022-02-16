/*
HackerLand Enterprise is adopting a new viral advertising strategy.
 When they launch a new product, they advertise it to exactly 5 people on social media.
Each day, floor(recipients/2) of the recipients like the advertisement and will share it with 3 friends on the following day.
 Assuming nobody receives the advertisement twice, 
determine how many people have liked the ad by the end of a given day, beginning with launch day as day 1.
*/

import java.io.*;
import java.math.*;
import java.util.*;

class Result {

    public static int viralAdvertising(int n) {
        int[] shared = new int[n+1];
        int[] liked = new int[n+1];
        int[] total = new int[n+1];
        shared[1] = 5;
        liked[1] = 2;
        total[1] = 2;
        for(int i=2; i<=n; i++)
        {
            shared[i] = liked[i-1]*3;
            liked[i] = (int)Math.floor(shared[i] / 2.0);
            total[i] = total[i-1] + liked[i];
        }
        
        return total[n];

    }

}
/*
A video player plays a game in which the character competes in a hurdle race. 
Hurdles are of varying heights, and the characters have a maximum height they can jump.
 There is a magic potion they can take that will increase their maximum jump height by 1 unit for each dose.
 How many doses of the potion must the character take to be able to jump all of the hurdles.
 If the character can already clear all of the hurdles, return 0.
*/

import java.io.*;
import java.math.*;
import java.util.*;

class Result {

    public static int hurdleRace(int k, List<Integer> height) {
        Collections.sort(height);
        int test = height.get(height.size()-1) - k;
        if(test >= 0) return test;
        else return 0;

    }

}

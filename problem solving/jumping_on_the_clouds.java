/*
There is a new mobile game that starts with consecutively numbered clouds. 
Some of the clouds are thunderheads and others are cumulus. 
The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2. 
The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

For each game, you will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided.
*/

import java.io.*;
import java.util.*;

class Result {

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0, x = 0;
        while(true) {
            if(x + 2 < c.size() && c.get(x+2) == 0) {
                x += 2;
            } else if(x + 1 < c.size()) {
                x++;
            } else {
                break;
            }
            jumps++;
        }
        
        return jumps;
    }

}
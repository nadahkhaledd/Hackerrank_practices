/*
Two cats and a mouse are at various positions on a line. 
You will be given their starting positions. 
Your task is to determine which cat will reach the mouse first, 
assuming the mouse does not move and the cats travel at equal speed. 
If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
*/

import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

    static String catAndMouse(int x, int y, int z) {
        int xd = Math.abs(x-z);
        int yd = Math.abs(y-z);
        
        if(xd < yd)
            return "Cat A";
        else if(yd < xd)
            return "Cat B";
        else if(xd == yd)
            return "Mouse C";
        
        return "";
    }
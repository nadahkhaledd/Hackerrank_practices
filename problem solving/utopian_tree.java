/*
The Utopian Tree goes through 2 cycles of growth every year. Each spring, 
it doubles in height. Each summer, its height increases by 1 meter.
A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring.
 How tall will the tree be after n growth cycles?
*/

import java.io.*;
import java.math.*;
import java.util.*;

class Result {

    public static int utopianTree(int n) {
        int height =1;
        for(int i=1; i<=n; i++)
        {
            if(i%2 == 1)
                height *=2;
            else if(i%2 == 0)
                height += 1;
        }
        
        return height;
    }

}

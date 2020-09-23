package com.apple.developer;

public class LevelParam {
    public static final Level[] LEVEL_PARAMS= new Level[7];
    static{
        LEVEL_PARAMS[0]= new Level(1,2,10,30,1);
        LEVEL_PARAMS[1]= new Level(2,3,9,28,2);
        LEVEL_PARAMS[2]= new Level(3,4,8,26,3);
        LEVEL_PARAMS[3]= new Level(4,5,7,22,4);
        LEVEL_PARAMS[4]= new Level(5,6,6,20,5);
        LEVEL_PARAMS[5]= new Level(6,7,5,18,6);
        LEVEL_PARAMS[6]= new Level(7,8,4,16,7);
    }
}

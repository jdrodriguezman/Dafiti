package com.example.straight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DafitiApplicationTests {

    DafitiApplication dafitiApplication = new DafitiApplication();

    @Test
    public void validateFirstLadder(){
        int[] cards = new int[]{ 2,3,4,5,6 };
        boolean result = dafitiApplication.isStraight(cards);
        Assertions.assertEquals(result,true);
    }

    @Test
    public void validateSecondLadder(){
        int[] cards = new int[]{ 14,5,4,2,3 };
        boolean result = dafitiApplication.isStraight(cards);
        Assertions.assertEquals(result,true);
    }

    @Test
    public void validateThirdLadder(){
        int[] cards = new int[]{ 7,7,12,11,3,4,14 };
        boolean result = dafitiApplication.isStraight(cards);
        Assertions.assertEquals(result,false);
    }

    @Test
    public void validateFourthLadder(){
        int[] cards = new int[]{ 7,3,2 };
        boolean result = dafitiApplication.isStraight(cards);
        Assertions.assertEquals(result,false);
    }
}

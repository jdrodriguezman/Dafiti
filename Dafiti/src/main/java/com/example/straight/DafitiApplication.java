package com.example.straight;

import java.util.Arrays;

public class DafitiApplication {

    public boolean isStraight(int[] cards){
        cards = Arrays.stream(cards).sorted().toArray();
        int count = 1;
        for (int i = 1; i < cards.length; i++) {
            if(cards[i - 1] + 1 == cards[i]){
                count++;
            }
            if(cards[i] == 14 && cards[i - 1] != 13 && cards[0] == 2){
                count++;
            }
        }
        if(count >= 5) {
            return true;
        }else{
            return false;
        }
    }
}

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DiceTest {

    @Test
    public void diceTest(){
        // Given
        Integer n1 = 2;
        Integer n2 = 5;

        Dice dice1 = new Dice(n1);
        Dice dice2 = new Dice(n2);

        // When
        Integer toss1 = dice1.tossAndSum();
        Integer toss2 = dice2.tossAndSum();


        Boolean result1 = ((toss1 >= 1 * n1) && (toss1 <= 6 * n1)) ? true : false;
        Boolean result2 = ((toss2 >= 1 * n2) && (toss2 <= 6 * n2)) ? true : false;

        // Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
    }

    @Test
    public void binTest(){
        // Given
        Bins result = new Bins(2, 12);

        // When
        Integer expectedSizeOfBin = 11;
        Integer actualSizeOfBin = result.bin.length;

        // Then
        Assert.assertEquals(expectedSizeOfBin,actualSizeOfBin);
    }

    @Test
    public void incrementTest(){
        // Given
        Bins result = new Bins(2, 12);

        // When
        Integer expectedIncrementByOneInBin = 3;
        result.incrementBin(2);
        result.incrementBin(2);
        result.incrementBin(2);
        Integer actualIncrementByOneInBin = result.bin[0]; // Get the value of index 0

        // Then
        Assert.assertEquals(expectedIncrementByOneInBin,actualIncrementByOneInBin);
    }

    @Test
    public void getTest(){
        // Given
        Bins result = new Bins(2,12);
        // When
        Integer expectedValueIndexFromBin = 3;
        result.incrementBin(5);
        result.incrementBin(5);
        result.incrementBin(5);

        Integer actualValueIndexFromBin = result.getBin(5); // This must return the value of index 3
        // Then
        Assert.assertEquals(expectedValueIndexFromBin,actualValueIndexFromBin);
    }


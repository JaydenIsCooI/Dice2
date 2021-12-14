package com.company;
import java.util.Random;

public class Dice2
{
    int numSides;
    int lastRoll;
    int numRoll;

    private void reset()
    {
        numSides = 6;
        lastRoll = 0;
        numRoll = 0;
    }

    public void sides(int sides)
    {
        numSides = sides;
        lastRoll = 0;
        numRoll = 0;
    }

    public void roll()
    {
        lastRoll = (int) (Math.random() * (numSides - 1))+1;
        numRoll++;
    }

    public int LastRoll()
    {
        return lastRoll;
    }

    public int numRoll()
    {
        return numRoll;
    }
}

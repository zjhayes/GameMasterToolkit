package model;

import java.util.Random;

public class DiceRoller
{
	private int numberOfSides;
	private int numberOfDice;
	private int previousRoll;
	private final int MINIMUM_ROLL = 1;
	
	public DiceRoller()
	{
		super();
	}

	public DiceRoller(int numberOfSides, int numberOfDice)
	{
		super();
		this.numberOfSides = numberOfSides;
		this.numberOfDice = numberOfDice;
		roll();
	}
	
	public void roll()
	{
		Random rand = new Random();
		int rollTotal = 0;
		
		for(int i = 0; i < numberOfDice; i++)
		{
			rollTotal += rand.nextInt(numberOfSides) + MINIMUM_ROLL;
		}
		
		setPreviousRoll(rollTotal);
	}

	public int getNumberOfSides()
	{
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides)
	{
		this.numberOfSides = numberOfSides;
	}

	public int getNumberOfDice()
	{
		return numberOfDice;
	}

	public void setNumberOfDice(int numberOfDice)
	{
		this.numberOfDice = numberOfDice;
	}
	
	public int getPreviousRoll()
	{
		return previousRoll;
	}

	public void setPreviousRoll(int previousRoll)
	{
		this.previousRoll = previousRoll;
	}
	
}

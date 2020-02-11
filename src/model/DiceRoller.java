package model;

import java.util.Random;

public class DiceRoller
{
	private int numberOfSides;
	private int numberOfDice;
	private int previousRoll;
	
	public DiceRoller()
	{
		super();
	}

	public DiceRoller(int numberOfSides, int numberOfDice)
	{
		super();
		this.numberOfSides = numberOfSides;
		this.numberOfDice = numberOfDice;
	}
	
	public void roll()
	{
		Random rand = new Random();
		int rollTotal = 0;
		
		for(int i = 0; i < numberOfDice; i++)
		{
			rollTotal += rand.nextInt(numberOfSides);
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

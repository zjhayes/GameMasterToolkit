package model;

public class EncounterCalculator
{
	private int numberOfPlayers;
	private int playerLevel;
	private int difficultyMultiplier;
	private final int[] EXPERIENCE_THRESHOLDS = {10, 25, 50, 75, 125, 250, 300, 350, 450, 
			550, 600, 800, 1000, 1100, 1250, 1400, 1600, 2000, 2100, 2400, 2800};
	private int encounterDifficulty; // in XP
	
	
	public EncounterCalculator()
	{
		super();
	}
	
	public EncounterCalculator(int numberOfPlayers, int playerLevel, int difficultyMultiplier)
	{
		super();
		this.numberOfPlayers = numberOfPlayers;
		this.playerLevel = playerLevel;
		this.difficultyMultiplier = difficultyMultiplier;
		calculate();
	}
	
	public void calculate()
	{
		int experienceThreshold = EXPERIENCE_THRESHOLDS[playerLevel];
		encounterDifficulty = experienceThreshold * numberOfPlayers * difficultyMultiplier;	
	}

	public int getNumberOfPlayers()
	{
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers)
	{
		this.numberOfPlayers = numberOfPlayers;
	}

	public int getPlayerLevel()
	{
		return playerLevel;
	}

	public void setPlayerLevel(int playerLevel)
	{
		this.playerLevel = playerLevel;
	}

	public int getDifficultyMultiplier()
	{
		return difficultyMultiplier;
	}

	public void setDifficultyMultiplier(int difficultyMultiplier)
	{
		this.difficultyMultiplier = difficultyMultiplier;
	}

	public int getEncounterDifficulty()
	{
		return encounterDifficulty;
	}

	public void setEncounterDifficulty(int encounterDifficulty)
	{
		this.encounterDifficulty = encounterDifficulty;
	}
}

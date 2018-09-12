package model;

public class MarshmallowMonster
{
	//Data member section
	//They are ALWAYS private
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//Default values are 0 or null BORING :(
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.legCount = 3;
		this.eyeCount = 2;
		this.hasNoses = true;
		this.armCount = 2;
		
	}
	
	//Getters
	
	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}

	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public  void setLegCount(double legs)
	{
		this.legCount = legs;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	
	public String toString()
	{
		String description = "My monsters name is " + "Jerimiah" + ", he has "
							+ legCount + " legs"
							+ " and the scary or silly thing it says is: What's cookin good lookin ;)";
		
		return description;
		
	}
	
	
}






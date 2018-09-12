package controller;

import model.MarshmallowMonster;

public class OdysseyController
{
	//Data member section
	private MarshmallowMonster myMonster;
	
	//Constructor section
	public OdysseyController()
	{
		//Job 1: initialize data members!
		myMonster = new MarshmallowMonster("Jerimiah", 3.0, 2, true, 2);
	}
	
	//method section
	public void start()
	{
		System.out.println(myMonster);
		myMonster.setArmCount(9999);
		System.out.println("My monster has this many arms: " + myMonster.getArmCount());
		
		//Make a new monster and customize from user input!
		MarshmallowMonster userMonster;
		
		userMonster();
	}
	
	public void userMonster()
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("What's the name of your Monster?");
		String.userMonsterName = inputScanner.nextLine();
		System.out.println("Your monster's name is " + userMonsterName);
		
	}
}

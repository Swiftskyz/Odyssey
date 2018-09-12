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
	}
}

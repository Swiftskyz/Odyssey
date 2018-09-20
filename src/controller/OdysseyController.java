package controller;

import model.MarshmallowMonster;
import javax.swing.JOptionPane;

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
		JOptionPane.showMessageDialog(null, "Show message here :D");
		//Use this method instead of: System.out.println("words");
		
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(9999);
		JOptionPane.showMessageDialog(null, "My monster has this many arms: " + myMonster.getArmCount());
		
		JOptionPane.showMessageDialog(null, "Death is a mercy, and I've got enough mercy to go around ;)");
		
		//Make a new monster and customize from user input!
		MarshmallowMonster userMonster = new MarshmallowMonster();
		String userMonsterName = JOptionPane.showInputDialog(null, "What is your monster's name?");
		userMonster.setName(userMonsterName);
		
		
		String userNumber = JOptionPane.showInputDialog(null, "How many arms?");
		int arms = 0;
		if (validInt(userNumber))
		{
			arms = Integer.parseInt(userNumber);
			userMonster.setArmCount(arms);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Fine!!! Your monster has ZERO arms!");
			userMonster.setArmCount(arms);
		}
		
	}	
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type an Integer value like -12345");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid =  true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . >)");
		}
		
		return isValid;
	}
	
}

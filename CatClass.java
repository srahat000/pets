
//a subclass is created called CatClass that has PetClass2 as its superclass


package com.rahat.lesson8;
import java.awt.Graphics;

public class CatClass extends PetClass2
{

	//CatClass constructor sets variables for its class
	public CatClass(int w, String n, String b, String c, String s)
	{
		//calls PetClass2 to send values to the variables
		super(w, n, b, c, s);
	}
	
	
	//results are displayed to the screen and functions of the super class
	//are called to give the values
	public void draw(Graphics g)
	{
		g.drawString("My cat's name is " + getName() + ".", 30, 350);
		g.drawString("My cat is a " + getBreed() + " and it weighs "
				+ getWeight() + " pounds.", 30, 370);
		g.drawString("My cat is " + getColor() + " as if you can't see!", 30, 390);
		g.drawString("My cat sounds like this: " + getSound()
		+ "!", 30, 410);
	}
}

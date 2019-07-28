
//a subclass is created called CatClass that has PetClass2 
//as its superclass


package com.rahat.lesson8;
import java.awt.Graphics;

public class DogClass extends PetClass2
{

	//DogClass constructor is created
	public DogClass(int w, String n, String b, String c, String s)
	{
		//calls super class and send the values 
		super(w, n, b, c, s);
	}
	
	//results are displayed on screen
	public void draw(Graphics g)
	{
		g.drawString("My dog's name is " + getName() + ".", 30, 350);
		g.drawString("My dog is a " + getBreed() + " and it weighs "
				+ getWeight() + " pounds.", 30, 370);
		g.drawString("My dog is " + getColor() + " as if you can't see!", 30, 390);
		g.drawString("My dog sounds like this: " + getSound()
		+ "!", 30, 410);
	}
}

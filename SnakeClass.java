
//a subclass is created called SnakeClass that has
//PetClass2 as its superclass

package com.rahat.lesson8;
import java.awt.Graphics;

public class SnakeClass extends PetClass2 {
	
	//SnakeClass constructor
	public SnakeClass(int w, String n, String b, String c, String s)
	{
		//calls super class to give values
		super(w, n, b, c, s);
	}
	
	//results are displayed on screen
	public void draw(Graphics g)
	{
		g.drawString("My snake's name is " + getName() + ".", 30, 350);
		g.drawString("My snake is a " + getBreed() + " and it weighs "
				+ getWeight() + " pounds.", 30, 370);
		g.drawString("My snake is " + getColor() + " as if you can't see!", 30, 390);
		g.drawString("My snake sounds like this: " + getSound()
		+ "!", 30, 410);
	}

}

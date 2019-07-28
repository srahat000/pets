
//PetClass2 is created and packaged

package com.rahat.lesson8;
import java.awt.Graphics;

public abstract class PetClass2 {

	private int weight;
	private String name, breed, color, sound;
	
	//class constructor
	public PetClass2()
	{
		weight = 0;
		name = breed = color = sound = "";
	}
	
	public PetClass2(int w, String n, String b, String c, String s)
	{
		weight = w;
		name = n;
		breed = b;
		color = c;
		sound = s;
	}
	
	//returns weight
	public void setWeight(int w) 
	{
		weight = w;
	}
	
	//returns name
	public void setName(String n) 
	{
		name = n;
	}
	
	//returns breed
	public void setBreed(String b) 
	{
		breed = b;
	}
	
	//returns color
	public void setColor(String c) 
	{
		color = c;
	}
	
	//returns sound
	public void setSound(String s) 
	{
		sound = s;
	}
	
	//gets weight
	public int getWeight()
	{
		return weight;
	}
	
	//gets name
	public String getName()
	{
		return name;
	}
	
	//gets breed
	public String getBreed()
	{
		return breed;
	}
	
	////gets color
	public String getColor()
	{
		return color;
	}
	
	//gets sound
	public String getSound()
	{
		return sound;
	}

	public abstract void draw(Graphics g);
}

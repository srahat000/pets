//the user interface is created allowing user to 
//input information to the classes

package com.rahat.lesson8;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import com.rahat.lesson8.*;

public class PetsTester extends Applet implements ActionListener{
	
	Button btnDog, btnCat, btnSnake;
	Label lblIntro, lblName, lblWeight, lblBreed, lblColor, lblSound;
	TextField txtWeight, txtName, txtBreed, txtColor, txtSound;
	
	int w;
	String n, b, c, s;
	
	int petType;
	
	//creates instances of each subclass
	DogClass dog;
	CatClass cat;
	SnakeClass snake;
	
	public void init()
	{
		setLayout(null);
		
		lblIntro = new Label("SELECT YOUR PET!");
		lblIntro.setBounds(90, 10, 150, 20);
		add(lblIntro);
		
		//button to choose dog as pet
		btnDog = new Button("Dog");
		btnDog.setBounds(30, 275, 80, 30);
		add(btnDog);
		btnDog.addActionListener(this);
		
		//button to choose cat as pet
		btnCat = new Button("Cat");
		btnCat.setBounds(120, 275, 80, 30);
		add(btnCat);
		btnCat.addActionListener(this);
		
		//button to choose snake as pet
		btnSnake = new Button("Snake");
		btnSnake.setBounds(210, 275, 80, 30);
		add(btnSnake);
		btnSnake.addActionListener(this);
		
		//asks user to input weight
		lblWeight = new Label("Enter the weight:");
		lblWeight.setBounds(30,70,125,20);
		txtWeight = new TextField(10);
		txtWeight.setBounds(170, 70, 100, 20);
		add(lblWeight);
		add(txtWeight);
		
		//asks user to input name
		lblName = new Label("Enter the name:");
		lblName.setBounds(30,100,125,20);
		txtName = new TextField(10);
		txtName.setBounds(170, 100, 100, 20);
		add(lblName);
		add(txtName);
		
		//asks user to input breed
		lblBreed = new Label("Enter the breed:");
		lblBreed.setBounds(30,130,125,20);
		txtBreed = new TextField(10);
		txtBreed.setBounds(170, 130, 100, 20);
		add(lblBreed);
		add(txtBreed);
		
		//asks user to input color
		lblColor = new Label("Enter the color:");
		lblColor.setBounds(30,160,125,20);
		txtColor = new TextField(10);
		txtColor.setBounds(170, 160, 100, 20);
		add(lblColor);
		add(txtColor);
	
		//asks user to input sound
		lblSound = new Label("Enter the sound it makes:");
		lblSound.setBounds(30,190,190,20);
		txtSound = new TextField(10);
		txtSound.setBounds(220, 190, 100, 20);
		add(lblSound);
		add(txtSound);
		
	}
	
	//action is performed a button is clicked
	//if dog is clicked, information gathered from user input 
	//and sent to the DogClass constructor
	//if cat is clicked or snake, the same is done
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnDog)
		{
			dog = new DogClass(Integer.parseInt(txtWeight.getText()), 
					txtName.getText(), txtBreed.getText(), txtColor.getText(),
					txtSound.getText());
			petType = 0;
		}
		
		if(e.getSource() == btnCat)
		{
			cat = new CatClass(Integer.parseInt(txtWeight.getText()),txtName.getText(), txtBreed.getText(), txtColor.getText(),txtSound.getText());
			petType = 1;
		}
		
		if(e.getSource() == btnSnake)
		{
			snake = new SnakeClass(Integer.parseInt(txtWeight.getText()), 
					txtName.getText(), txtBreed.getText(), txtColor.getText(),
					txtSound.getText());
			petType = 2;
		}
		repaint();
	}
	
	//depending on the petType that was set the results are displayed

	public void paint(Graphics g)
	{
		switch (petType)
		{
		case 0:
			dog.draw(g);
			break;
			
		case 1:
			cat.draw(g);
			break;
			
		case 2:
			snake.draw(g);
			break;
		}
	}
}

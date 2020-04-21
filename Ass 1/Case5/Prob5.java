package com.hcl.domino.ass1;

public class Prob5 
{

	public static void main(String[] args) 
	{
		
		//creating object for the class and initializing through constructor
		Prob5 ob=new Prob5(20);
		
		//setting the value through object
		ob.setLen(20);
		ob.display();
	}

//default constructor
Prob5()
{
	
}

//Arg constructor
Prob5(int number)
{
	this.hgt=number;
}

//generating setter and getter method and initializing by setting value
private int len;

//Initializing by creating constructor
private int hgt;

// Declaring and Initializing
private int WD=40;

//Setter and getter methods
 public int getLen() {
	return len;
}
public void setLen(int len) {
	this.len = len;
}

private void display()
 {
	 System.out.println("The length,height and width is "+len+ " " +hgt+ " " +WD);
 }

}

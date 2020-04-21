package com.hcl.domino.ass1;


/**
 *This class is created for checking the data type and size of the input  given by the user.
 *The size and data type are defined by using some methods in java.lang package.
 *@author Chaitanya
 *@version 1.8
 */

public class Prob1 {

	public static void main(String[] args) {
	
		
		//Ingeneral as Java has fixed datatypes, sizeof command is not worked in Java
		
		//Using For loop
		
		for(int i=0;i<args.length;i++)
		{
			
			//using try catch method for expection
			try
			{
				int a=Integer.parseInt(args[i]);
				System.out.println(a+" integer "+Integer.SIZE/8);
			}
			
			catch(Exception e1)
			{
				try
				{
				System.out.println(Float.parseFloat(args[i])+" float/double "+Float.SIZE/8);
				}
				catch(Exception e2)
				{
					if(args[i].length()==1)
					{
						System.out.println(args[i]+" char "+Character.SIZE/8);
					}
					else
					{
						System.out.println(args[i]+" string "+args[i].length());
						
						//String is non primitive datatype so no default size is not specified.
						
					}
				}
			}
		}

	}

}
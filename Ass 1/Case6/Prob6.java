package com.hcl.domino.ass1;
import java.util.Arrays;

public class Prob6 {
	

	//declaring the variables
		private int val;
		private char[] name=new char[50] ;	
		
		//default constructor
		Prob6()
		{
			System.out.println("Default constructor");
		}
		
		//parameterized constructor 
		Prob6(int val)
		{
			this.val=val;
			System.out.println("Overloaded constructor with integer value ");
		}
		
		//parameterized constructor
		Prob6(char[] values)
		{
			name = new char[values.length]; 
	        for (int j = 0; j < name.length; j++) 
	        { 
	        	name[j] = values[j]; 
	        }
			System.out.println("Overloaded constructor with character value ");
		}
		
		//parameterized constructor
		Prob6(int val, char[] values)
		{
			this.name=values;
			this.val=val;
			System.out.println("Overloaded constructor with integer,character values");	
		}
		
		public void show()
		{
			System.out.println("The integer value is: "+val+"\nThe character values are: "+Arrays.toString(name));
		}
		
		public static void main(String[] args) 
		{
			char C[]= {'a','b','c','d','e'};
			
			Prob6 S=new Prob6();
			
			Prob6 S1=new Prob6(10);
			S1.name=C;
			S1.show();
			
			//deep copying
			System.out.println("Deep copy");
			Prob6 S2 =new Prob6(C);
			S2.val=10;
			S2.show();
			C[0]='s';
			S2.show(); 
			
			//shallow copying
			System.out.println("Shallow copy");
			Prob6 S3=new Prob6(20,C);
			S3.show();
		}

	}
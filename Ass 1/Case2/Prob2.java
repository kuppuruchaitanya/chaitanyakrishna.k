package com.hcl.domino.ass1;

/**
*The program is used to find the sum of squares of the number.
 *@author Chaitanya
 *@version 1.8
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2 {
	

	public static void main(String[] args) throws  IOException
	{
		int num,temp = 0;
		
		//values taken from the user
		System.out.println("Please enter the itteration number ");
		
	//To read the values from the user
		BufferedReader brr=new BufferedReader(new InputStreamReader(System.in));
		
		num = Integer.parseInt(brr.readLine());
		
		for(int itteration=1;itteration<=num;itteration++) 
		{
			 temp += (itteration*itteration);
			
		}
		//To display the output
		System.out.println("Output: "+temp);

	}

}
/*
* StringFun.java
* Author: Wesley Wittekiend
* Submission Date: 10/7/16
*
* Purpose: Allows a user to repeatedly interact with a string
* and make changes to it. 
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

import java.util.Scanner;
public class StringFun {
public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter the string to be manipulated");
	String UserString = keyboard.nextLine();
	
	while (true)
	{
	
	System.out.println("Enter your command (quit, print reverse, replace all, replace single, remove)");
	String Command = keyboard.nextLine();

	int count;
	String s1, s2, sn, ReverseUserString;
	
	//Print Reverse Command
	if (Command.equalsIgnoreCase("print reverse"))
	{
	count = 1;
	sn = "";
	while (count <= UserString.length())
		{
		s1 = UserString.substring(UserString.length()- count, UserString.length() - count + 1);
		sn = sn + s1;
		count++;
		}
	ReverseUserString = sn;
	System.out.println(ReverseUserString);
	s1 = "";
	sn = "";
	count = 1;
	}
	
	//Replace All Command
	if (Command.equalsIgnoreCase("replace all"))
		{
		System.out.println("Enter the character to replace");
		String OldChar = keyboard.nextLine();
		
		System.out.println("Enter the new character");
		String NewChar = keyboard.nextLine();
		
		int letterCheck = 0;
		count=0;
		sn="";
		
		while (count < UserString.length())
		{
			if (UserString.charAt(count) == OldChar.charAt(0))
			{
			sn = sn + NewChar;
			letterCheck++;
			}
			else
			{
			sn = sn + UserString.charAt(count);
			}
			count++;
		}
		UserString = sn;
		
		if (letterCheck <1)
		{
			System.out.println("Error: the letter you are trying to replace does not exist");
		}
		System.out.println("The new string is: " + UserString);
		}
	
	//Replace Single
	if (Command.equalsIgnoreCase("replace single"))
		{
		System.out.println("Enter the character to replace");
		String OldChar = keyboard.nextLine();
			
		System.out.println("Enter the new character");
		String NewChar = keyboard.nextLine();
		
		System.out.println("Which " + OldChar + " would you like to replace?");
		int replaceNum = keyboard.nextInt();
		
		int replaceCount = 0;
		count=0;
		sn="";
		int gotReplaced = 0;
			
		while (count < UserString.length())
		{
			if (UserString.charAt(count) == OldChar.charAt(0))
			{
			replaceCount++;
			}
			
			if (count < UserString.length()-1)
			{
				s2 = UserString.substring(count+1);
			}
			else 
			{
				s2 = "";
			}
			
			if (replaceCount == replaceNum)
			{
				sn = UserString.substring(0, count) + NewChar + s2;
				gotReplaced++;
			}
			
			count++;
		}
		
		if (gotReplaced > 0)
		{
			UserString = sn;
		}
		
		if (gotReplaced < 1)
		{
			System.out.println("Error: the letter you are trying to remove does not exist");
		}
		
		System.out.println("The new string is: " + UserString);
		}
	
	
	//Remove Command
	if (Command.equalsIgnoreCase("remove"))
	{
	System.out.println("Enter the character to remove");
	String OldChar = keyboard.nextLine();
	
	String NewChar = "";
	
	count=0;
	sn="";
	
	while (count < UserString.length())
	{
		if (UserString.charAt(count) == OldChar.charAt(0))
		{
		sn = sn + NewChar;
		}
		else
		{
		sn = sn + UserString.charAt(count);
		}
		count++;
	}
	UserString = sn;
	
	System.out.println("The new string is: " + UserString);
	}

	//Quit Command
	if (Command.equalsIgnoreCase("quit"))
	{
		System.exit(0);
	}

	
	}
}
}

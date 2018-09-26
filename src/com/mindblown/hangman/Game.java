package com.mindblown.hangman;


public class Game
{
	public static void main(String[] arguments)
	{
		System.out.println("hi\nhi\\nhi\\nhi\\nhi\\nhi\\nhi\\nhi\\nhi\\\\nhi\\\\nhi\\\\nhi\\\\nhi\\\\nhi\\\\n");
		clear();
	}
	public static void clear()
	{
		System.out.print("\033[H\033[2J");  
	    System.out.flush();
	}
}

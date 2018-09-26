package com.mindblown.hangman;

import java.io.IOException;
import java.util.Scanner;

public class Game
{
	private static Scanner scanner = new Scanner(System.in);
	private static String word;
	private static int words_missed;
	
	public static void main(String[] arguments)
	{
		clear();
		System.out.println("##################");
		System.out.println("      HANGMAN     ");
		System.out.println("##################");
		try
		{
			Thread.sleep(5000);
		} catch(InterruptedException exception)
		{
			exception.printStackTrace();
		}
		clear();
		
		System.out.println("Would you like to choose a word or have one randomly choosen? [C/R] ");
		String choice = scanner.nextLine();
		clear();
		if(choice.equals("C") || choice.equals("c"))
			choose();
		if(choice.equals("R") || choice.equals("r"))
			random_ch();
		
		print_body(0);
	}
	public static void clear()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch(InterruptedException | IOException exception){
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		}
	}

	public static void choose()
	{
		System.out.println("What word would you like? ");
		word = scanner.nextLine();
	}
	public static void random_ch()
	{
		
	}

	public static void print_body(int words_missed)
	{
		if(words_missed == 0)
		{
			System.out.println("___________.._______");
			System.out.println("| .__________))______|");
			System.out.println("| | / /      ||");
			System.out.println("| |/ /       ||");
			System.out.println("| | /        ||");
			System.out.println("| |/         ||");
			System.out.println("| |          ||");
			System.out.println("| |          (```)");
			System.out.println("| |           `--'");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("\"\"\"\"\"\"\"\"\"\"|         |\"\"\"|");
			System.out.println("|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|");
			System.out.println("| |        \\ \\        | |");
			System.out.println(": :         \\ \\       : :");  
			System.out.println(". .          `'       . .");
		}
		if(words_missed == 1)
		{
			System.out.println("___________.._______");
			System.out.println("| .__________))______|");
			System.out.println("| | / /      ||");
			System.out.println("| |/ /       ||");
			System.out.println("| | /        ||.-''.");
			System.out.println("| |/         |/  _  \\");
			System.out.println("| |          ||  `/,|");
			System.out.println("| |          (\\\\`_.'");
			System.out.println("| |         .-`--'.");
			System.out.println("| |        /Y . . Y\\\\");
			System.out.println("| |       // |   | \\\\");
			System.out.println("| |      //  | . |  \\");
			System.out.println("| |     \')   |   |   (`");
			System.out.println("| |          ||'||");
			System.out.println("| |          || ||");
			System.out.println("| |          || ||");
			System.out.println("| |          || ||");
			System.out.println("| |         / | | \\");
			System.out.println("\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|");
			System.out.println("|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|");
			System.out.println("| |        \\ \\        | |");
			System.out.println(": :         \\ \\       : :");  
			System.out.println(". .          `'       . .");
		}
	}
}

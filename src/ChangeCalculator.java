//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String sandwich = JOptionPane.showInputDialog("How many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
              int nickels = Integer.parseInt(sandwich);                   
		// Ask the user how many dimes they have, and convert their answer
              String bmt = JOptionPane.showInputDialog("How many dimes do you have"); int dimes = Integer.parseInt(bmt); 
		// Ask the user how many quarters they have, and convert their answer
              String quarters = JOptionPane.showInputDialog("how many quarters do you have");
              int quarters1 = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
              int totalnickels = nickels*5;
              int totaldimes = dimes*10;
              int totalquarters = quarters1*25;
            		  
		// Tell the user how much money they have

	}
}


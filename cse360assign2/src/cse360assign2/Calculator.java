/**
 * @author Gage Gommels
 * @ID   1212690087
 * @Assignment 2
 * @Description This is a simple program that allows a user to create a Calculator and then input their own desired values. They are
 * able to retrieve the total and a history string of what functions they have used in the past.
 */
package cse360assign2;


/**
 * This class file contains 6 methods 4 being basic calculator functions (add, sub, mult, divide).
 * getTotal will return the value currently held in total
 * getHistory will return the string with all of the previous commands used in the main function for that specific calculator.
 */
public class Calculator {

	private int total;
	private String history;
	
	
	
	/**
	 * This is the constructor for the calculator class:
	 * it contains the starting value for the total and the starting String for the history variable
	 * its purpose is to create a calculator data type with the starting total = to 0 and history string = "0"
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	
	
	/**
	 * This method will simply return the total
	 * @return total:	Holds the total for the Calculator class
	 */
	public int getTotal () {
		return total;
	}
	
	
	
	/**
	 * This method will take a integer input and add it to the total
	 * It will also add a + symbol and the value to the history string
	 * @param value:	This needs to be an integer
	 */
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	
	
	
	/**
	 * This method will subtract the given value from the total
	 * It will also add a - symbol and the value to the history string
	 * @param value:	This needs to be an integer
	 */
	public void subtract (int value) {
		total = total - value;
		history += " - " + value;
	}
	
	
	
	/**
	 * This method will multiply the total by the value given in the parameters
	 * It also will add a * symbol and value to the history string.
	 * @param value:	This needs to be an integer
	 */
	public void multiply (int value) {
		total = total * value;
		history += " * " + value;
	}
	
	
	
	/**
	 * This method will divide the total by the value given in the parameters
	 * It also will add a / symbol and value to the history string.
	 * @param value:	This needs to be an integer
	 */
	public void divide (int value) {
		total = total / value;
		history += " / " + value;
	}
	
	
	
	/**
	 * This method will return the history string
	 * @return history string:	contains the string value of all previous used fuctions.
	 */
	public String getHistory () {
		return history;
	}
}



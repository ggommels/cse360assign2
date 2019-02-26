
package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * This is the constructor for the calculator class.
	 * It will be called upon in main when executing the code.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * this method will return the total
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * this method will be called upon when the program finds a + symbol in the input.
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * this method will be called upon when the program finds a - symbol in the input.
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * this method will be called upon when the program finds a * symbol in the input.
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * this method will be called upon when the program finds a / symbol in the input.
	 */
	public void divide (int value) {
		total = total/value;
	}
	
	/**
	 * this method will return the history of the last used functions
	 */
	public String getHistory () {
		return "";
	}
}

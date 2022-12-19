import java.util.Scanner;
class Game() {
	public int number;
	
	void Game(int n) {
		number=n;
	}
}
public class CHP_noguessgame {
	int userInput;
	void takeUserInput(int x) {
		userInput=x;
	}
	boolean isCorrectNumber() {
		return (number==userInput);
}
	public static void main(String[] args) {
		/* Number guessing game
		 * Constructor to generate random number
		 * takeUserInput() to take input
		 * isCorrectNumber() to check no 
		 * getter and setter for noOfGuesses
		 * Use properties such as noOfGuesses( int ) etc to get this task done!
		 */

	}

}

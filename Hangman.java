/**
 * @author Tuna Alikasifoglu
 * @version 4 Feb 2018
 */
public class Hangman
{
	// properties

	public StringBuffer secretWord;
	public StringBuffer allLetters;
	public StringBuffer usedLetters;
	public StringBuffer knownSoFar;
	public int numberOfIncorrectTries;
	public final int maxAllowedIncorrectTries = 6;

	// constructors

	// will be filled by others
	public Hangman ()
	{

	}

	// methods

	/**
	 * @return all letters in the english alphabet
	 * specified in the constructor
	 */
	public String getAllLetters ()
	{
		return allLetters.toString();
	}

	/**
	 * @return letters that user have guessed
	 */
	public String getUsedLetters ()
	{
		return usedLetters.toString();
	}

	/**
	 * @return the number of incorrect tries
	 */
	public int getNumOfIncorrectTries ()
	{
		return numberOfIncorrectTries;
	}

	/**
	 * @return the number of tries user can make incorrectly
	 */
	public int getMaxAllowedIncorrectTries ()
	{
		return maxAllowedIncorrectTries;
	}

	/**
	 * @return the partial word formed with known letters
	 */
	public String getKnownSoFar ()
	{
		return knownSoFar.toString();
	}

	/**
	 * @return true -> if the maximum number of incorrect tries is reached
	 * or user won the game
	 */
	public boolean isGameOver ()
	{
		return ( (numberOfIncorrectTries == maxAllowedIncorrectTries)
				|| secretWord.equals(knownSoFar) );
	}

	/**
	 * @return 1-) true if user lost the game 2-) false if user still have guess right or if user won the game
	 */
	public boolean hasLost ()
	{
		return ( (numberOfIncorrectTries == maxAllowedIncorrectTries)
				&& !secretWord.equals(knownSoFar) );
	}

	// tryThis and chooseSecretWord methods will be filled by others
	public int tryThis ( char letter )
	{

	}

	private void chooseSecretWord ()
	{

	}



}

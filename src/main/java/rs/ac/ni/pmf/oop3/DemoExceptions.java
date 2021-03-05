package rs.ac.ni.pmf.oop3;

import java.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoExceptions
{
	public static void main(String[] args)
	{
		final int maxAttempts = 2;
		int counter = 0;

		final Scanner scanner = new Scanner(System.in);


		while (counter < maxAttempts)
		{
			readNumber(scanner);

			++counter;
		}
	}

	private static void readNumber(final Scanner scanner)
	{
		System.out.println("Enter an integer: ");

		try
		{
			handleNumberInput(scanner);
		}
		catch (final InputMismatchException e)
		{
			scanner.nextLine();
			System.out.println("You did not enter a number!");
			log.debug("User did not enter a number", e);
		}
		catch (final IllegalStateException | NoSuchElementException e)
		{
			log.error("Something weird happened", e);
			System.out.println("Something went wrong...");
		}
	}

	private static void handleNumberInput(Scanner scanner)
	{
		final int number = scanner.nextInt();
		System.out.println("You've entered: " + number);
		scanner.close();
	}
}

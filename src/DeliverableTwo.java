import java.util.Scanner;//import scanner
public class DeliverableTwo {//Auto-generated method stub
	public static void main(String[] args) {//Auto-generated method stub
	
		int correctCount = 0;//counter for correct number of flips
		int headsCounter = 0;//counter for heads
		int tailsCounter = 0;//counter for tails
		double numberOfFlips;//variable for number of flips
		
		Scanner scnr = new Scanner(System.in);//assigning scnr as user input
		
				System.out.println("Guess which will have more: Heads or Tails?");//ask user to respond heads or tails
				String headsOrTailsGuess = scnr.nextLine();//user input of heads or tails
			do {	
				if (headsOrTailsGuess.equals("Heads"))//makes sure input is valid UPPER start
				{
				}
				else if (headsOrTailsGuess.equals("heads"))//makes sure input is valid LOWER start
				{
				}
				else if (headsOrTailsGuess.equals("Tails"))//makes sure input is valid UPPER start
				{
				}
				else if (headsOrTailsGuess.equals("tails"))//makes sure input is valid LOWER start
				{
				}
				else
				{
					System.out.println("Input not valid, try again");//re prompts if input isn't "heads" or "tails", ex: kjsfhg
					continue;
				}
				break;
			}while (true);
		
        do {
            System.out.print("How many times shall we flip the coin? ");//prompts user to enter number
            while (!scnr.hasNextInt()) {
                String numb = scnr.next();
                System.out.printf("\"%s\" is not a valid number. Try again.%n", numb);//tells if not valid, ex: kjsdhf
                continue;
            	}
            numberOfFlips = scnr.nextInt();
        	} while (numberOfFlips <= 0);//makes sure we get a positive number, re prompts if not, ex: 0, -1
        	
		
		for (int i =0; i < numberOfFlips; i++)//loop for number of flips
		{
			int rand =(int)(Math.random()*2);//random number 0 or 1
			if (rand == 0)
			{
				System.out.println("Heads");//if 0 print heads
				headsCounter++;//add to heads counter
			}
			else if (rand == 1)
			{
				System.out.println("Tails");//if 1 print tails
				tailsCounter++;//add to tails counter
			}
		}
		if (headsOrTailsGuess.equals("Heads"))//set accurate value for correctCount based on user decision Heads vs Tails
			{
				correctCount = headsCounter;
			}
		else if (headsOrTailsGuess.equals("heads"))
			{
				correctCount = headsCounter;
			}
		else if (headsOrTailsGuess.equals("Tails"))
			{
				correctCount = tailsCounter;
			}
		else if (headsOrTailsGuess.equals("tails"))
			{
				correctCount = tailsCounter;
			}
		 
		double percentage = correctCount / numberOfFlips * 100;//new variable to find percentage of times user choice showed up
				
		System.out.println("Your guess, " + headsOrTailsGuess +", came up " + correctCount + " time(s). Thats " + percentage + "%.");	
		
		scnr.close();//scanner close
	}

}


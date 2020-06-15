import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
	ManualPlayer case1 = new ManualPlayer();
	Scanner choice = new Scanner(System.in);
	
		try {
	for (int i=0;i<3;i++)
	{
		System.out.println("Please Select your choice:\n*Press One(1) for a game with bot\n*Press two(2) for a two player game");
		int Ch = choice.nextInt();	
	if(Ch == 1)
	{
		System.out.println("So u want to play with a bot !");
		break;
	}
	else if(Ch == 2)
	{
		System.out.println("Lets start");
		case1.crisscross();
		break;
	}
	else 
	{
		System.err.println("Please enter a valid input !\n");
		i=0;
	}
	}
	}
	catch (InputMismatchException exception)
	{
		System.err.println("Please run the code again and enter a valid Input !");
	}
}
}

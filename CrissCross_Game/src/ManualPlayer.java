import java.util.Scanner;

public class ManualPlayer {
public static void crisscross()
{
	int flag = 0;
	Scanner input = new Scanner(System.in);
	String[] arry = new String[10];
	Main call=new Main();
	

	abc:
	for(int i=0;i<10;i++)
	{	
		
		if(flag == 0) 
		{
			System.out.println("its coming inside");
			System.out.println("Board View :\n1 | 2 | 3\n---------\n4 | 5 | 6\n---------\n7 | 8 | 9");
			for(int z=1;z<=9;z++)
		{
			arry[z]=" ";
			flag =4;
		}
		}
		//For Player O
		System.out.println("Player 'O' select a number between 1-9 to enter you choice in board :");
		String O =input.nextLine();
		
		for(int j=1;j<=9;j++)
		{
			if(String.valueOf(j).equals(O))
			{
				arry[j] = "O";
			}
		}
		int k=1;
		
		for(k=1;k<=3;k++)
		{
			if((arry[k].equals(arry[k+3]) && arry[k].equals(arry[k+6]) && arry[k].equals("O")) || (arry[k].equals(arry[k+1]) && arry[k].equals(arry[k+2]) && arry[k].equals("O") && (k==1 || k==4 || k==7)) )
			{
				System.out.println("Player O wins !");
				System.out.println("Do you want to Play again ?(type yes/no)\n");
				String Repeate=input.nextLine();
				if(Repeate.equals("yes")) {
				flag = 1;
				call.main(null);
				}
				else if(Repeate.equals("no"))
				{
					System.out.println("Thank you for Playing !");
					return;
				}
			}
			
		}
		//Repeate session
		
		if(flag == 1)
		{
			flag = 0;
			continue abc;
		}
		
		
		System.out.println("Board View :\n"+arry[1]+" | "+arry[2]+" | "+arry[3]+"\n---------\n"+arry[4]+" | "+arry[5]+" | "+arry[6]+"\n---------\n"+arry[7]+" | "+arry[8]+" | "+arry[9]);
		
		//For player X
		System.out.println("Player 'X' select a number between 1-9 to enter you choice in board :");
		String X =input.nextLine();
		for(int j=1;j<=9;j++)
		{
			if(String.valueOf(j).equals(X))
			{
				arry[j] = "X";
			}
		}
		System.out.println("Board View :\n"+arry[1]+" | "+arry[2]+" | "+arry[3]+"\n---------\n"+arry[4]+" | "+arry[5]+" | "+arry[6]+"\n---------\n"+arry[7]+" | "+arry[8]+" | "+arry[9]);
					
				
	}
	
	
}


	
}


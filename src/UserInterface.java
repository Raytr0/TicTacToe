
import java.util.Scanner;

public class UserInterface extends QuestAndAns
{
	private String name = "";
	public void player()
	{
		Scanner k = new Scanner(System.in);
		System.out.println("What is your name?");
		String playerName = k.nextLine();
		name = playerName;
	}
	
	public boolean intro()
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Hello "+ name +"! This is a 10 question trivia game, all questions are true or false. Enter T for true and F for false when the question appears." );
		System.out.println("Now, are you ready to start the game?(Y to start, N to quit)");
		String yesNo = k.nextLine();
		
		if(yesNo.equalsIgnoreCase("Y"))
			return true;
		else
			return false;
	}
	
	private int randNum;
	
	public void randValue()
	{
		int n = (int)(Math.random()*10);
		randNum = n;
	}
	
	public void askQuestion()
	{
		sendRandom(randNum);
		System.out.println(getCurrentQ());
	}
	
	public void checkAns()
	{
		sendRandom(randNum);
		
		Scanner k = new Scanner(System.in);
		String answer = k.nextLine();
		
		if(getCurrentA() == answer)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Incorrect!");
		}
	}
	
	public static void main(String[] args)
	{
		UserInterface user = new UserInterface();
		user.player();
		boolean start = user.intro();
		if(start == true)
		{
			for(int i = 0; i < 10; ++i)
			{
				user.randValue();
				user.askQuestion();
				user.checkAns();
			}
		}
			
	}
}

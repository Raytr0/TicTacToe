/*
 * Purpose: To print out the questions and their respective answers
 * Author: Ms. Yhard
 * Modified By: Ryan Huang
 * Modified On: 2020/11/2
 */
public class QuestTest {
	
	//prints out a random question and answer to console
	public static void main(String[] args)
	{
		QuestAndAns quest = new QuestAndAns();
		
		for(int i = 0; i < 5; ++i)
		{
			int n = (int)(Math.random()*10);
			quest.sendRandom(n);
			System.out.println(quest.getCurrentQ());
			System.out.println(quest.getCurrentA());
		}
	}
}

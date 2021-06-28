
public class QuestAndAns 
{
	private String[] questions = 
		{
			"Fields are always private for our ICS3U projects. \nType T for true or F for false", 
			"Methods are always public for our ICS3U projects. \nType T for true or F for false", 
			"The class name must be different than the file name for Java classes. \nType T for true or F for false", 
			"A subclass is higher in the heirarchy than the superclass. \nType T for true or F for false", 
			"Inheritance prevents us from re-using code. \nType T for true or F for false", 
			"Internal comments can be more than one line in our ICS3U projects. \nType T for true or F for false", 
			"The naming convention camelCase is used for methods and variables. \nType T for true or F for false", 
			"The naming convention PascalCase is used for fields. \nType T for true or F for false", 
			"A constructor has the same name as the class it is part of. \nType T for true or F for false", 
			"Computer Science is my favorite course. \nType T for true or F for false"
		};
	private String[] answers = {"T", "T", "F", "F", "F", "F", "T", "F", "T", "T"};
	private String currentQ = "";
	private String currentA = "";
	
	public void sendRandom(int num)
	{
		currentQ = questions[num];
		currentA = answers[num];
	}
	
	public String getCurrentQ()
	{
		return currentQ;
	}
	
	public String getCurrentA()
	{
		return currentA;
	}
	
	
}

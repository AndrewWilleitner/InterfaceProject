package interfaceproject.model;

import java.util.ArrayList;
import java.util.Random;

public class Interface
{
	private ArrayList<String> complementList;
	private ArrayList<String> insultList;
	private ArrayList<String> jokeList;
	private ArrayList<String> punList;
	public String computerText;
	
	
	public Interface(String name)
	{
		complementList = new ArrayList<String>();
		insultList = new ArrayList<String>();
		jokeList = new ArrayList<String>();
		punList = new ArrayList<String>();
		fillComplementList();
		fillInsultList();
		
	}
	
	
	
	private void fillComplementList()
	{
		complementList.add("You are looking great today!");
		complementList.add("You can reach any goal!");
		complementList.add("You smell nice!");
		complementList.add("You have an amazing brain!");
	}
	
	private void fillInsultList()
	{
		insultList.add("You look bad and you should feel bad!");
		insultList.add("You're fat!");
		insultList.add("You don't get an insult!");
		insultList.add("You smell AWFUL!");
	}
	
	private void fillJokeList()
	{
		jokeList.add("A paperless office has about as much chance as a paperless bathroom.");
		jokeList.add("A Life? Cool! Where can I download one of those from?");
		jokeList.add("Computers are unreliable, but humans are even more unreliable.");
		jokeList.add("Keyboard not connected, press F1 to continue.");
		jokeList.add("Math problems? Call 1-800-[(10x)(ln(13e))]-[sin(xy)/2.362x]");
	}
	
	private void fillPunList()
	{
		punList.add("A computer program attached to an electric chair would have to have its execution checked carefully.");
		punList.add("When computer programmers are hungry they take mega-bites.");
		punList.add("I got fired from my job as a software engineer. I just couldn't get with the program.");
		punList.add("Technically speaking, a programmer's favorite subject with his boss is usually arrays.");
	}
	
	
	public String randomComplement()
	{
		int index = new Random().nextInt(complementList.size());
		computerText = complementList.get(index);
		
		return computerText;
	}

	
}

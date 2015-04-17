package interfaceproject.view;

import javax.swing.*;

import interfaceproject.controller.InterfaceAppController;

import java.awt.Font;
import java.awt.event.*;

public class InterfacePanel extends JPanel
{
	private InterfaceAppController baseController;
	private JLabel resultsLabel;
	private JButton complementButton;
	private JButton insultButton;
	private JButton jokeButton;
	private JButton punButton;
	private SpringLayout baseLayout;
	
	public InterfacePanel(InterfaceAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		
		resultsLabel = new JLabel("Click on a button.");
		baseLayout.putConstraint(SpringLayout.WEST, resultsLabel, 131, SpringLayout.WEST, this);
		complementButton = new JButton("Complement");
		baseLayout.putConstraint(SpringLayout.NORTH, complementButton, 74, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, complementButton, 10, SpringLayout.WEST, this);
		insultButton = new JButton("Insult");
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsLabel, -28, SpringLayout.NORTH, insultButton);
		baseLayout.putConstraint(SpringLayout.NORTH, insultButton, 0, SpringLayout.NORTH, complementButton);
		baseLayout.putConstraint(SpringLayout.WEST, insultButton, 174, SpringLayout.WEST, this);
		jokeButton = new JButton("Joke");
		baseLayout.putConstraint(SpringLayout.NORTH, jokeButton, 0, SpringLayout.NORTH, complementButton);
		baseLayout.putConstraint(SpringLayout.WEST, jokeButton, 6, SpringLayout.EAST, insultButton);
		punButton = new JButton("Pun");
		baseLayout.putConstraint(SpringLayout.NORTH, punButton, 0, SpringLayout.NORTH, complementButton);
		baseLayout.putConstraint(SpringLayout.EAST, punButton, -6, SpringLayout.WEST, insultButton);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		
		this.add(resultsLabel);
		this.add(complementButton);
		this.add(insultButton);
		this.add(jokeButton);
		this.add(punButton);
		
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		complementButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
//				String resultsText = 
				resultsLabel.setText("");
			}
		});
		
	}
}

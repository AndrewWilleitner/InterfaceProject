package interfaceproject.view;

import interfaceproject.controller.InterfaceAppController;

import javax.swing.JFrame;

public class InterfaceFrame extends JFrame
{
	private InterfacePanel basePanel;
	
	public InterfaceFrame(InterfaceAppController baseController)
	{
		basePanel = new InterfacePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
}

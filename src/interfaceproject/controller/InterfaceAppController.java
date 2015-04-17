package interfaceproject.controller;

import interfaceproject.view.InterfaceFrame;
import interfaceproject.view.InterfacePanel;

public class InterfaceAppController
{
	private InterfaceFrame baseFrame;
	
	
	public InterfaceAppController()
	{
		baseFrame = new InterfaceFrame(this);
	}
	
	public void start()
	{
		InterfacePanel myAppPanel = (InterfacePanel) baseFrame.getContentPane();
	}
	
	
}

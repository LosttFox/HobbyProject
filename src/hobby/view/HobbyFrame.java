package hobby.view;

import javax.swing.JFrame;

import hobby.controller.HobbyController;


public class HobbyFrame extends JFrame
{
	private HobbyController controller;
	
	private HobbyPanel basePanel;
	
	public HobbyFrame(HobbyController controller) 
	{
		this.controller = controller;
		basePanel = new HobbyPanel(controller);
	}
	
	private void setupFrame()
	{
		this.setTitle("Hobby Project");
		this.setSize(500, 500);
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}

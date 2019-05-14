import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Main
{
	public static void main (String[] args)
	{

		windowMaker();

	}

	public static void windowMaker()
	{
		Dimension scDim = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame mainFrame = new JFrame ();
		mainFrame.setSize(scDim.width/2,scDim.height/2);
		mainFrame.setLocation(scDim.width/4,scDim.height/4);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField path = new JTextField (100);
		JTextField author = new JTextField (100);
		JTextField date = new JTextField (100);
		JTextField tags = new JTextField (100);
		JTextField location = new JTextField (100);
		JPanel firstPanel = new JPanel();
		mianFrame.setContentPane(firstPanel);
		firstPanel.add(path);
		firstPanel.add(author);
		firstPanel.add(date);
		firstPanel.add(location);
		firstPanel.add(tags);
		mainFrame.setVisible(true);
		
	}
}

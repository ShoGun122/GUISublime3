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
		JLabel pathText = new JLabel("Path: ");
		JLabel authorText = new JLabel("Author: ");
		JLabel dateText = new JLabel("Date:");
		JLabel tagsText = new JLabel("Tags:");
		JLabel locationText = new JLabel("Location:");
		mainFrame.setContentPane(firstPanel);
		firstPanel.add(pathText);
		firstPanel.add(path);
		firstPanel.add(authorText);
		firstPanel.add(author);
		firstPanel.add(dateText);
		firstPanel.add(date);
		firstPanel.add(locationText);
		firstPanel.add(location);
		firstPanel.add(tagsText);
		firstPanel.add(tags);
		mainFrame.setVisible(true);
		//JArrayList listaa = new JAr
		
	}
}

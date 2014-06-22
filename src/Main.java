/*
 * See Video https://www.youtube.com/watch?v=IkEz5tW5bok
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Main extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		new Main().setVisible(true);
	}
	
	private Main()
	{
		super("Demo - 2014");
		setSize(600, 600); //1024x768
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLayout(new GridLayout(2,1)); //(row, column)
		//setLayout(new BorderLayout());
		
		/*
		 * FlowLayout
		 * GridBagLayout
		 * GridLayout
		 * BorderLayout
		 */
//		JButton button2 = new JButton("Button 2");
//		button.setActionCommand("Button");
//		button.addActionListener(this);
//		button2.addActionListener(this);
//		
//		add(button, BorderLayout.WEST); 
//		add(button2, BorderLayout.EAST);
		
		/*
		 * JMenu
		 */
		JButton button = new JButton("Click Me");
		button.setActionCommand("Click");
		
		JMenuBar bar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem save = new JMenuItem("Save"); 
		JMenuItem close = new JMenuItem("Exit");
		
		close.addActionListener(this);
		
		JMenuItem extra = new JMenu("Extra");
		JMenuItem hello = new JMenuItem("Hello");
		JMenuItem hello2 = new JMenuItem("Hello 2");
		
		extra.add(hello);
		extra.add(hello2);
		
		file.add(newMenuItem);
		file.add(save);
		file.add(extra);
		file.addSeparator();
		file.add(close);
			
		bar.add(file);
		
		setJMenuBar(bar);
	}

	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		
		if (name.equals("Click"))
		{
			System.out.println("Click Me has been clicked.");
		}
		else if (name.equals("Button"))
		{
			System.out.println("Button 2 has been clicked.");
		}
	
		if (name.equals("Exit"))
		{
			System.exit(0);
		}
		
	}
}

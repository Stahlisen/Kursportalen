package GUI;

import javax.swing.JFrame;

import Application.Kontrollant;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Vy {

	private JFrame frame;
	private Kontrollant kontroll;
	public JList list;
	
	/**
	 * Skapa Vy
	 */
	public Vy(Kontrollant kon) {
		initialize();
		kontroll = kon;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		list = new JList();
		list.setBounds(84, 76, 1, 1);
		frame.getContentPane().add(list);
		
		frame.setVisible(true);
	}
}

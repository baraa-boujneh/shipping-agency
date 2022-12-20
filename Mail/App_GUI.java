package Mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;

public class App_GUI {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					App_GUI window = new App_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 835, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Welcome to Baraa shipping agency");
		lblNewJgoodiesTitle.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewJgoodiesTitle.setBounds(208, 10, 384, 99);
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Email :\r\n");
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewJgoodiesLabel.setBounds(112, 173, 78, 21);
		frame.getContentPane().add(lblNewJgoodiesLabel);
		
		TextField textField = new TextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(189, 173, 254, 21);
		frame.getContentPane().add(textField);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Password :");
		lblNewJgoodiesLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewJgoodiesLabel_1.setBounds(79, 213, 98, 21);
		frame.getContentPane().add(lblNewJgoodiesLabel_1);
		passwordField = new JPasswordField();
		passwordField.setBounds(189, 213, 254, 21);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("log in");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mailbox m=new Mailbox(textField,passwordField);
				frame.dispose();
				add addmail=new add();
				addmail.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(481, 235, 111, 35);
		frame.getContentPane().add(btnNewButton);
		
		
	}
	
	
	
}

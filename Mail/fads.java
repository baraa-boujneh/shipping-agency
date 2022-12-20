package Mail;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import Project_Exceptions.Volume_exception;
import Project_Exceptions.Weight_exception;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class fads extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fads frame = new fads();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fads() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle(" Advertisment ");
		lblNewJgoodiesTitle.setBounds(86, 26, 282, 32);
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewJgoodiesTitle);
	
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("weight(in grams):");
		lblNewJgoodiesLabel.setBounds(109, 100, 107, 16);
		contentPane.add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("address:");
		lblNewJgoodiesLabel_1.setBounds(119, 132, 83, 13);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		JLabel lblNewJgoodiesLabel_3 = DefaultComponentFactory.getInstance().createLabel("shipping method:");
		lblNewJgoodiesLabel_3.setBounds(95, 155, 107, 16);
		contentPane.add(lblNewJgoodiesLabel_3);
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("normal\r\n");
		rdbtnNewRadioButton_2.setBounds(196, 153, 63, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("express");
		rdbtnNewRadioButton_3.setBounds(268, 153, 103, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		ButtonGroup bgs=new ButtonGroup();
		bgs.add(rdbtnNewRadioButton_2);
		bgs.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		try {
			
			Courier l=new Advertisment(textField_2,bgs,textField_3);
			dispose();
		} catch (Weight_exception e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "ERROR: you cannot assign a negative value to weight");	;	}	
				
			}
		});
		btnNewButton.setBounds(160, 232, 89, 21);
		contentPane.add(btnNewButton);
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 126, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 99, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
}
}

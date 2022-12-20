package Mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import Project_Exceptions.Weight_exception;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class fletter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fletter frame = new fletter();
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
	public fletter() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 573, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Letter");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewJgoodiesTitle.setBounds(234, 40, 94, 32);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("weight(in grams):");
		lblNewJgoodiesLabel.setBounds(109, 100, 107, 16);
		contentPane.add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("address:");
		lblNewJgoodiesLabel_1.setBounds(148, 142, 83, 13);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		textField = new JTextField();
		textField.setBounds(216, 100, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(216, 142, 112, 19);
		contentPane.add(textField_1);
		
		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("Format:");
		lblNewJgoodiesLabel_2.setBounds(140, 172, 63, 13);
		contentPane.add(lblNewJgoodiesLabel_2);
		
		JLabel lblNewJgoodiesLabel_3 = DefaultComponentFactory.getInstance().createLabel("shipping method:");
		lblNewJgoodiesLabel_3.setBounds(96, 195, 107, 16);
		contentPane.add(lblNewJgoodiesLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A2");
		rdbtnNewRadioButton.setBounds(197, 170, 49, 16);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("A4");
		rdbtnNewRadioButton_1.setBounds(265, 170, 55, 16);
		contentPane.add(rdbtnNewRadioButton_1);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton);
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("normal\r\n");
		rdbtnNewRadioButton_2.setBounds(197, 193, 63, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("express");
		rdbtnNewRadioButton_3.setBounds(265, 193, 103, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		ButtonGroup bgs=new ButtonGroup();
		bgs.add(rdbtnNewRadioButton_2);
		bgs.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		try {
			
			Courier l=new Lettre(textField,bgs,textField_1,bg);
			dispose();
		} catch (Weight_exception e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "ERROR: you cannot assign a negative value to weight");	;	}
				
				
			}
		});
		btnNewButton.setBounds(212, 284, 116, 21);
		contentPane.add(btnNewButton);
	}
}

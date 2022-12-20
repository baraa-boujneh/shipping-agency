package Mail;

import java.awt.EventQueue;
import Project_Exceptions.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import Project_Exceptions.Weight_exception;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fpackage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fpackage frame = new fpackage();
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
	public fpackage() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 458, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("package");
		lblNewJgoodiesTitle.setBounds(160, 27, 94, 32);
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewJgoodiesTitle);
	
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("weight(in grams):");
		lblNewJgoodiesLabel.setBounds(109, 100, 107, 16);
		contentPane.add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("address:");
		lblNewJgoodiesLabel_1.setBounds(133, 158, 83, 13);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		textField = new JTextField();
		textField.setBounds(216, 100, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 155, 96, 19);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("volume(in cm3):");
		lblNewJgoodiesTitle_1.setBounds(109, 126, 93, 13);
		contentPane.add(lblNewJgoodiesTitle_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(216, 126, 96, 19);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		JLabel lblNewJgoodiesLabel_3 = DefaultComponentFactory.getInstance().createLabel("shipping method:");
		lblNewJgoodiesLabel_3.setBounds(96, 195, 107, 16);
		contentPane.add(lblNewJgoodiesLabel_3);
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
			
			Courier l=new Package(textField,bgs,textField_1,textField_2);
			dispose();
		} catch (Weight_exception e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "ERROR: you cannot assign a negative value to weight");	;	}
		catch (Volume_exception e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "ERROR: you cannot assign a negative value to volume");	;	}	
				
			}
		});
		btnNewButton.setBounds(185, 250, 89, 21);
		contentPane.add(btnNewButton);
	}}
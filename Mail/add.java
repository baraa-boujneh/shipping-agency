package Mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Canvas;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import java.awt.Scrollbar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import java.awt.Panel;
import javax.swing.JProgressBar;
import javax.swing.JList;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class add extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add frame = new add();
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
	public add() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 741, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Welcome back to your mailbox dashboard");
		lblNewJgoodiesTitle.setBounds(134, 21, 487, 69);
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewJgoodiesTitle.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewJgoodiesTitle);
		
		JButton btnNewButton = new JButton("log out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(562, 405, 140, 21);
		contentPane.add(btnNewButton);
		
		Choice choice = new Choice();
		choice.setForeground(new Color(0, 0, 0));
		
		choice.add("Letter");
		choice.add("package");
		choice.add("advertisment");
		choice.add("commercial package");
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		choice.setBounds(251, 219, 191, 31);
		contentPane.add(choice);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("choose item");
		lblNewJgoodiesLabel.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewJgoodiesLabel.setBounds(132, 219, 113, 18);
		contentPane.add(lblNewJgoodiesLabel);
		
		JButton btnNewButton_1 = new JButton("postage amount");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"000$ ","postage cost",JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btnNewButton_1.setBounds(21, 405, 150, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			switch(choice.getSelectedItem()) {
			case "Letter" :fletter lframe=new fletter();lframe.setVisible(true);;break;
			case "package" :fpackage pframe=new fpackage();pframe.setVisible(true);break;
			case "advertisment" :fads adframe=new fads();adframe.setVisible(true);break;
			case "commercial package" :fcpackage cpframe=new fcpackage();cpframe.setVisible(true);break;
			}
			}
		});
		btnNewButton_2.setBounds(446, 405, 100, 21);
		contentPane.add(btnNewButton_2);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

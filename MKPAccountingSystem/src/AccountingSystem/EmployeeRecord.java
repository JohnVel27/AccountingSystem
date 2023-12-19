package AccountingSystem;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeRecord extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeRecord frame = new EmployeeRecord();
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
	public EmployeeRecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeRecord = new JLabel("Employee Record");
		lblEmployeeRecord.setForeground(new Color(0, 100, 0));
		lblEmployeeRecord.setFont(new Font("Arial Black", Font.BOLD, 29));
		lblEmployeeRecord.setBounds(266, 87, 403, 41);
		contentPane.add(lblEmployeeRecord);
		
		JRadioButton rdbtn1 = new JRadioButton("1");
		rdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee1 obj = new Employee1();
				obj.setVisible(true);
                dispose();
				
			}
		});
		rdbtn1.setBounds(219, 157, 109, 23);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("2");
		rdbtn2.setBounds(368, 157, 109, 23);
		contentPane.add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("3");
		rdbtn3.setBounds(531, 157, 109, 23);
		contentPane.add(rdbtn3);
		
		JLabel lblNumberEmployees = new JLabel("Number of Employees");
		lblNumberEmployees.setForeground(new Color(0, 100, 0));
		lblNumberEmployees.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNumberEmployees.setBounds(46, 161, 156, 14);
		contentPane.add(lblNumberEmployees);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 31, 22);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(31, 0, 101, 22);
		contentPane.add(menuBar_1);
		
		JMenu mnAccount = new JMenu("Account");
		menuBar_1.add(mnAccount);
		
		// Set custom icon with text
        ImageIcon customIcon = new ImageIcon("C:/Users/COMPUTER/eclipse-workspace/MKPAccountingSystem/MKpsw2/MKP.png");
        setIconImage(customIcon.getImage());
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Logout Account");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcctgSystem obj = new AcctgSystem();
                obj.setVisible(true);
                dispose();
			}
		});
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		mnAccount.add(mntmNewMenuItem);
		
		JLabel lblGoback = new JLabel("Go Back");
		lblGoback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WelcomePage obj = new WelcomePage();
				obj.setVisible(true);
                dispose();
			}
		});
		lblGoback.setForeground(new Color(255, 0, 0));
		lblGoback.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblGoback.setBounds(687, 23, 78, 31);
		contentPane.add(lblGoback);
	}
}

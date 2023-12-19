package AccountingSystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcctgSystem extends JFrame implements ActionListener {
    private JLabel label, passwordLabel;
    private JTextField username;
    private JButton loginButton;
    private JPasswordField passwordField;
    private JButton resetButton;
    private JLabel lblNewLabel;
    private JLabel lblcode;
    private JPasswordField passwordField_1;
	private JFrame frame;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

    public AcctgSystem() {
        setTitle("MACKIM PRINTS LOG IN"); // Set the title here

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 811, 524);

        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setForeground(new Color(255, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 2));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
     // Set custom icon with text
        ImageIcon customIcon = new ImageIcon("C:/Users/COMPUTER/eclipse-workspace/MKPAccountingSystem/MKpsw2/MKP.png");
        setIconImage(customIcon.getImage());

        // Username label
        label = new JLabel("Username");
        label.setBounds(594, 118, 81, 20);
        label.setForeground(new Color(0, 100, 0));
        label.setFont(new Font("Arial Black", Font.BOLD, 12));
        contentPane.add(label);

        // Username TextField
        username = new JTextField();
        username.setBounds(592, 149, 193, 28);
        contentPane.add(username);

        // Password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(594, 190, 70, 20);
        passwordLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
        passwordLabel.setForeground(new Color(0, 100, 0));
        contentPane.add(passwordLabel);

        // Password TextField
        passwordField = new JPasswordField();
        passwordField.setBounds(592, 221, 193, 28);
        contentPane.add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(594, 260, 90, 25);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLACK);
        loginButton.addActionListener(this); // Register ActionListener
        contentPane.add(loginButton);
        
        

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 128, 0));
        panel.setBounds(0, 0, 304, 486);
        panel.setForeground(new Color(255, 0, 0));
        panel.setBorder(new LineBorder(new Color(255, 255, 255), 2));
        contentPane.add(panel);
        panel.setLayout(null);
        
        lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\COMPUTER\\Pictures\\294872659_414248357391287_5200913240681609519_n.jpg"));
        lblNewLabel_3.setBounds(495, 0, 179, 370);
        panel.add(lblNewLabel_3);
        
        lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\COMPUTER\\Pictures\\download (1).png"));
        lblNewLabel_4.setBounds(33, 94, 239, 246);
        panel.add(lblNewLabel_4);
        
        lblNewLabel_5 = new JLabel("MKP ");
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lblNewLabel_5.setBounds(96, 337, 113, 54);
        panel.add(lblNewLabel_5);
        
        lblNewLabel_6 = new JLabel("ACCOUNTANT");
        lblNewLabel_6.setForeground(Color.WHITE);
        lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lblNewLabel_6.setBounds(10, 390, 330, 54);
        panel.add(lblNewLabel_6);
        
        
        resetButton = new JButton("Reset");
        resetButton.setBounds(695, 260, 90, 25);
        resetButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		resetFields();
        	}
        });
        
        
        resetButton.setForeground(Color.WHITE);
        resetButton.setBackground(Color.BLACK);
        contentPane.add(resetButton);
        
        lblcode = new JLabel("Secret code");
        lblcode.setForeground(new Color(255, 255, 255));
        lblcode.setBounds(364, 374, 117, 14);
        contentPane.add(lblcode);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        passwordField_1.setBounds(449, 374, 216, 20);
        contentPane.add(passwordField_1);
        
        JButton btnOk = new JButton("Ok");
        btnOk.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String uni = passwordField_1.getText();
        		if(uni.equals("vel")) {
        			JOptionPane.showMessageDialog(rootPane,"Username:dark27hitman \n Password:123456789");
        		}
        		else {
        			JOptionPane.showMessageDialog(rootPane,"You cannot access the application");
        		}
        	}
        });
        btnOk.setForeground(Color.WHITE);
        btnOk.setBackground(Color.BLACK);
        btnOk.setBounds(449, 407, 90, 25);
        contentPane.add(btnOk);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setForeground(Color.RED);
        panel_1.setBorder(new LineBorder(new Color(255, 255, 255), 2));
        panel_1.setBackground(new Color(255, 0, 0));
        panel_1.setBounds(304, 324, 501, 162);
        contentPane.add(panel_1);
        
        lblNewLabel = new JLabel("FORGOT Password?Enter the Secret code to know the password");
        lblNewLabel.setBounds(24, 22, 467, 14);
        panel_1.add(lblNewLabel);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
        
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setForeground(Color.RED);
        panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 2));
        panel_2.setBackground(new Color(0, 128, 0));
        panel_2.setBounds(215, 0, 590, 90);
        contentPane.add(panel_2);
        
        JLabel lblNewLabel_1 = new JLabel("Accounting Application ");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(108, 14, 472, 54);
        panel_2.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBounds(312, 109, 327, 204);
        contentPane.add(lblNewLabel_2);
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\COMPUTER\\Pictures\\MKP.png"));
    }
    
 // Method to reset username and password fields
    private void resetFields() {
        username.setText("");
        passwordField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String enteredUsername = username.getText();
        String enteredPassword = String.valueOf(passwordField.getPassword());

        if (enteredUsername.equals("dark27hitman") && enteredPassword.equals("123456789")) {
            JOptionPane.showMessageDialog(null, "Login Successfully! ! !");
            WelcomePage obj = new WelcomePage();
            obj.setVisible(true);
            dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Username or Password mismatch");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AcctgSystem frame = new AcctgSystem();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}



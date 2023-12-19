package AccountingSystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomePage extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WelcomePage frame = new WelcomePage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public WelcomePage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 813, 521);
        setTitle("Mackim prints Accounting Software");

        // Set application icon
        ImageIcon appIcon = new ImageIcon("C:/Users/COMPUTER/eclipse-workspace/MKPAccountingSystem/MKpsw2/MKP.png");
        setIconImage(appIcon.getImage());

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 128, 0));
        panel.setBounds(0, 0, 321, 77);
        panel.setBorder(new LineBorder(new Color(0, 128, 0), 2));
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblAccountingSoftware = new JLabel("Accounting Software");
        lblAccountingSoftware.setBackground(new Color(255, 255, 255));
        lblAccountingSoftware.setForeground(new Color(255, 255, 255));
        lblAccountingSoftware.setFont(new Font("Arial Black", Font.BOLD, 26));
        lblAccountingSoftware.setBounds(0, 0, 611, 76);
        panel.add(lblAccountingSoftware);
        
        JButton CreateEmployeeRecord = new JButton("Create Employee Payslip");
        CreateEmployeeRecord.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		Employee1 obj = new Employee1();
           		obj.setVisible(true);
                   dispose();

        	}
        });
        CreateEmployeeRecord.setBackground(new Color(0, 128, 0));
        CreateEmployeeRecord.setForeground(new Color(255, 255, 255));
        CreateEmployeeRecord.setFont(new Font("Times New Roman", Font.BOLD, 18));
        CreateEmployeeRecord.setBounds(282, 149, 510, 58);
        contentPane.add(CreateEmployeeRecord);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\COMPUTER\\Pictures\\download.png"));
        lblNewLabel.setBounds(19, 75, 253, 298);
        contentPane.add(lblNewLabel);
        
        JButton CreateEmployeeRecord_1 = new JButton("Create Customer Record");
        CreateEmployeeRecord_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		CustomerR obj = new CustomerR();
        		obj.setVisible(true);
        		dispose();
        	}
        });
        CreateEmployeeRecord_1.setForeground(new Color(255, 255, 255));
        CreateEmployeeRecord_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        CreateEmployeeRecord_1.setBackground(new Color(255, 0, 0));
        CreateEmployeeRecord_1.setBounds(277, 223, 510, 58);
        contentPane.add(CreateEmployeeRecord_1);
        
        JButton btnNewButton = new JButton("Go Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		AcctgSystem obj = new AcctgSystem();
           		obj.setVisible(true);
                   dispose();

        	}
        });
        btnNewButton.setBounds(703, 0, 89, 23);
        contentPane.add(btnNewButton);
        
        JButton btnLogOut = new JButton("Log Out");
        btnLogOut.setBackground(new Color(0, 128, 0));
        btnLogOut.setForeground(new Color(255, 255, 255));
        btnLogOut.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		AcctgSystem obj = new AcctgSystem();
           		obj.setVisible(true);
                   dispose();
        	}
        });
        btnLogOut.setBounds(613, 0, 89, 23);
        contentPane.add(btnLogOut);
        
        JLabel lblNewLabel_1 = new JLabel("Mackim Prints, Inc. is a family run corporation, established in 1996 by Mr. Junzedik and Mrs. Lolita Llacuna,duly registered and licensed by the Securities and  ");
        lblNewLabel_1.setBounds(29, 370, 792, 23);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("advertising and publishing company, duly registered and licensed by the National Book Development Board.one in Ortigas Center and a Production Plant in JP Rizal ");
        lblNewLabel_1_1.setBounds(0, 394, 792, 23);
        contentPane.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("MACKIM has also reached the provinces as they welcomed the opening of a branch in Cebu City and another in Kidapawan.MACKIM PRINTS, INC is slowly rising");
        lblNewLabel_1_1_1.setBounds(0, 417, 792, 23);
        contentPane.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("to its rivals with a better and wider range printing services.");
        lblNewLabel_1_1_1_1.setBounds(0, 438, 792, 23);
        contentPane.add(lblNewLabel_1_1_1_1);
    }
}



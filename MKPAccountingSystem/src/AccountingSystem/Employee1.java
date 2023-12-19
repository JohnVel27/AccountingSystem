package AccountingSystem;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

public class Employee1 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_grosssalary;
    private JTextField textField_totaldeductions;
    private JTextField textField_netpay;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Employee1 frame = new Employee1();
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
    public Employee1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 816, 514);
        contentPane = new JPanel();
        contentPane.setLayout(null);

        setContentPane(contentPane);
        
     // Set custom icon with text
        ImageIcon customIcon = new ImageIcon("C:/Users/COMPUTER/eclipse-workspace/MKPAccountingSystem/MKpsw2/MKP.png");
        setIconImage(customIcon.getImage());
        
     // Set the title for the JFrame
        setTitle("Mackim Prints inc. Employee Payslip");
        
        

        JButton btnPrint = new JButton("Print");
        btnPrint.setForeground(new Color(255, 255, 255));
        btnPrint.setBackground(new Color(0, 0, 0));
        btnPrint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printDocument();
            }
        });
        
        
        btnPrint.setBounds(701, 442, 89, 23);
        contentPane.add(btnPrint);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 64, 0));
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.setBounds(0, 0, 800, 30);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("MACKIM PRINTS INC.");
        lblNewLabel.setBounds(300, 0, 211, 23);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
        panel.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Go Back");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		WelcomePage obj = new WelcomePage();
        		obj.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 128, 0));
        btnNewButton.setBounds(711, 0, 89, 23);
        panel.add(btnNewButton);
        
        JButton btnLogOut = new JButton("Log Out");
        btnLogOut.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		AcctgSystem obj = new AcctgSystem();
        		obj.setVisible(true);
        		dispose();
        	}
        });
        btnLogOut.setForeground(new Color(255, 255, 255));
        btnLogOut.setBackground(new Color(255, 0, 0));
        btnLogOut.setBounds(619, 0, 89, 23);
        panel.add(btnLogOut);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 0, 0));
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_1.setBounds(0, 29, 800, 30);
        contentPane.add(panel_1);
        
        JLabel lblSalarySlipFor = new JLabel("SALARY SLIP FOR EMPLOYEES");
        lblSalarySlipFor.setForeground(new Color(255, 255, 255));
        lblSalarySlipFor.setFont(new Font("Tahoma", Font.BOLD, 19));
        panel_1.add(lblSalarySlipFor);
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_1_1.setBounds(0, 56, 800, 146);
        contentPane.add(panel_1_1);
        panel_1_1.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Name:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1.setBounds(10, 11, 98, 27);
        panel_1_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Employee number :");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_1.setBounds(10, 52, 136, 27);
        panel_1_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Designation: ");
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_1_1.setBounds(10, 90, 98, 27);
        panel_1_1.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Department:");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_2.setBounds(444, 11, 98, 27);
        panel_1_1.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("Bank Name:");
        lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_1_2.setBounds(444, 52, 136, 27);
        panel_1_1.add(lblNewLabel_1_1_2);
        
        JLabel lblNewLabel_1_1_2_1 = new JLabel("Account number:");
        lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_1_2_1.setBounds(444, 90, 136, 27);
        panel_1_1.add(lblNewLabel_1_1_2_1);
        
        textField = new JTextField();
        textField.setBounds(60, 15, 314, 20);
        panel_1_1.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(127, 56, 247, 20);
        panel_1_1.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(95, 94, 279, 20);
        panel_1_1.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(521, 15, 269, 20);
        panel_1_1.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(521, 56, 269, 20);
        panel_1_1.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(543, 94, 247, 20);
        panel_1_1.add(textField_5);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0, 64, 0));
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.setBounds(0, 201, 403, 41);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblEarnings = new JLabel("EARNINGS");
        lblEarnings.setForeground(new Color(255, 255, 255));
        lblEarnings.setBounds(97, 11, 184, 23);
        lblEarnings.setFont(new Font("Tahoma", Font.BOLD, 19));
        panel_2.add(lblEarnings);
        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2_1.setBounds(0, 240, 403, 155);
        contentPane.add(panel_2_1);
        panel_2_1.setLayout(null);
        
        JLabel lblNewLabel_1_3 = new JLabel("Basic salary:");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3.setBounds(10, 11, 98, 27);
        panel_2_1.add(lblNewLabel_1_3);
        
        JLabel lblNewLabel_1_3_1 = new JLabel("House rent allowances:");
        lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_1.setBounds(10, 40, 143, 27);
        panel_2_1.add(lblNewLabel_1_3_1);
        
        JLabel lblNewLabel_1_3_1_1 = new JLabel("Conveyance allowances:");
        lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_1_1.setBounds(10, 69, 143, 27);
        panel_2_1.add(lblNewLabel_1_3_1_1);
        
        JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Medical allowances:");
        lblNewLabel_1_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_1_1_1.setBounds(10, 98, 143, 27);
        panel_2_1.add(lblNewLabel_1_3_1_1_1);
        
        JLabel lblNewLabel_1_3_1_1_1_1 = new JLabel("Gross Salary:");
        lblNewLabel_1_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_1_1_1_1.setBounds(10, 128, 143, 27);
        panel_2_1.add(lblNewLabel_1_3_1_1_1_1);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(89, 15, 283, 20);
        panel_2_1.add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(149, 44, 222, 20);
        panel_2_1.add(textField_7);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(149, 73, 222, 20);
        panel_2_1.add(textField_8);
        
        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(128, 102, 244, 20);
        panel_2_1.add(textField_9);
        
        textField_grosssalary = new JTextField();
        textField_grosssalary.setColumns(10);
        textField_grosssalary.setBounds(128, 128, 244, 20);
        panel_2_1.add(textField_grosssalary);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 64, 0));
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_3.setBounds(0, 391, 403, 40);
        contentPane.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNetpay = new JLabel("NETPAY");
        lblNetpay.setForeground(new Color(255, 255, 255));
        lblNetpay.setBounds(10, 11, 184, 23);
        lblNetpay.setFont(new Font("Tahoma", Font.BOLD, 19));
        panel_3.add(lblNetpay);
        
        JPanel panel_2_2 = new JPanel();
        panel_2_2.setBackground(new Color(255, 0, 0));
        panel_2_2.setLayout(null);
        panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2_2.setBounds(397, 201, 403, 41);
        contentPane.add(panel_2_2);
        
        JLabel lblDeductions = new JLabel("DEDUCTIONS");
        lblDeductions.setForeground(Color.WHITE);
        lblDeductions.setFont(new Font("Tahoma", Font.BOLD, 19));
        lblDeductions.setBounds(38, 11, 184, 23);
        panel_2_2.add(lblDeductions);
        
        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setLayout(null);
        panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2_1_1.setBounds(397, 240, 403, 155);
        contentPane.add(panel_2_1_1);
        
        JLabel lblNewLabel_1_3_2 = new JLabel("EPF:");
        lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_2.setBounds(10, 11, 98, 27);
        panel_2_1_1.add(lblNewLabel_1_3_2);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(45, 15, 348, 20);
        panel_2_1_1.add(textField_10);
        
        JLabel lblNewLabel_1_3_2_1 = new JLabel("Health Insurance:");
        lblNewLabel_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_2_1.setBounds(10, 46, 120, 27);
        panel_2_1_1.add(lblNewLabel_1_3_2_1);
        
        JLabel lblNewLabel_1_3_2_1_1 = new JLabel("Professional Tax:");
        lblNewLabel_1_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_2_1_1.setBounds(10, 75, 120, 27);
        panel_2_1_1.add(lblNewLabel_1_3_2_1_1);
        
        JLabel lblNewLabel_1_3_2_2 = new JLabel("TDS:");
        lblNewLabel_1_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_2_2.setBounds(10, 100, 98, 27);
        panel_2_1_1.add(lblNewLabel_1_3_2_2);
        
        JLabel lblNewLabel_1_3_1_1_1_1_1 = new JLabel("Total Deductions:");
        lblNewLabel_1_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1_3_1_1_1_1_1.setBounds(10, 128, 143, 27);
        panel_2_1_1.add(lblNewLabel_1_3_1_1_1_1_1);
        
        textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(117, 46, 276, 20);
        panel_2_1_1.add(textField_11);
        
        textField_12 = new JTextField();
        textField_12.setColumns(10);
        textField_12.setBounds(117, 79, 276, 20);
        panel_2_1_1.add(textField_12);
        
        textField_13 = new JTextField();
        textField_13.setColumns(10);
        textField_13.setBounds(45, 104, 348, 20);
        panel_2_1_1.add(textField_13);
        
        textField_totaldeductions = new JTextField();
        textField_totaldeductions.setColumns(10);
        textField_totaldeductions.setBounds(117, 132, 276, 20);
        panel_2_1_1.add(textField_totaldeductions);
        
        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBackground(new Color(0, 64, 0));
        panel_3_1.setForeground(new Color(0, 0, 0));
        panel_3_1.setLayout(null);
        panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_3_1.setBounds(397, 391, 403, 40);
        contentPane.add(panel_3_1);
        
        textField_netpay = new JTextField();
        textField_netpay.setColumns(10);
        textField_netpay.setBounds(79, 11, 290, 18);
        panel_3_1.add(textField_netpay);
        
        JButton btnNewButton1 = new JButton("Compute");
        btnNewButton1.setForeground(new Color(255, 255, 255));
        btnNewButton1.setBackground(new Color(0, 128, 0));
        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                computeValues(); // Call the method to compute values
            }
        });
        btnNewButton1.setBounds(602, 442, 89, 23);
        contentPane.add(btnNewButton1);
        
        JPanel panel_3_2 = new JPanel();
        panel_3_2.setLayout(null);
        panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_3_2.setBackground(new Color(128, 128, 128));
        panel_3_2.setBounds(0, 453, 403, 23);
        contentPane.add(panel_3_2);
        
        JLabel lblNewLabel_2 = new JLabel("NOTE: Computing the Gross Salary,Deductions and Net Pay.");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2.setBounds(23, 0, 393, 23);
        panel_3_2.add(lblNewLabel_2);
        
        JButton btnNewButton_1 = new JButton("Clear");
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(255, 0, 0));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		clearValues();
        	}
        });
        btnNewButton_1.setBounds(503, 442, 89, 23);
        contentPane.add(btnNewButton_1);
    }
    private void clearValues() {
    	textField.setText("");
    	textField_1.setText("");
    	textField_2.setText("");
    	textField_3.setText("");
    	textField_4.setText("");
    	textField_5.setText("");
    	textField_6.setText("");
        textField_7.setText("");
        textField_8.setText("");
        textField_9.setText("");
        textField_grosssalary.setText("");
        textField_10.setText("");
        textField_11.setText("");
        textField_12.setText("");
        textField_13.setText("");
        textField_totaldeductions.setText("");
        textField_netpay.setText("");
        
    }
    
    private void computeValues() {
        try {
            // Get values from text fields
            double basicSalary = Double.parseDouble(textField_6.getText());
            double houseRentAllowance = Double.parseDouble(textField_7.getText());
            double conveyanceAllowance = Double.parseDouble(textField_8.getText());
            double medicalAllowance = Double.parseDouble(textField_9.getText());

            // Calculate gross salary
            double grossSalary = basicSalary + houseRentAllowance + conveyanceAllowance + medicalAllowance;
            textField_grosssalary.setText(String.valueOf(grossSalary));

            // Calculate deductions
            double epf = Double.parseDouble(textField_10.getText());
            double healthInsurance = Double.parseDouble(textField_11.getText());
            double professionalTax = Double.parseDouble(textField_12.getText());
            double tds = Double.parseDouble(textField_13.getText());

            double totalDeductions = epf + healthInsurance + professionalTax + tds;
            textField_totaldeductions.setText(String.valueOf(totalDeductions));

            // Calculate net pay
            double netPay = grossSalary - totalDeductions;
            textField_netpay.setText(String.valueOf(netPay));

        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
    
    
    

    private void printDocument() {
        boolean success = false;
        PrinterJob printerJob = PrinterJob.getPrinterJob();

        printerJob.setPrintable(new Printable() {
            public int print(Graphics g, PageFormat pf, int pageNum) {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());
                g2d.scale(0.24, 0.24);

                contentPane.printAll(g);
                return Printable.PAGE_EXISTS;
            }
        });

        if (printerJob.printDialog()) {
            try {
                printerJob.print();
                success = true;
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }

        if (success) {
            System.out.println("Print job submitted successfully.");
        } else {
            System.out.println("Error in printing.");
        }
    }
}




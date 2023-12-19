package AccountingSystem;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerR extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldOR;
    private JTextField textFieldName;
    private JTextField textFieldDate;
    private JTextField textFieldAmount;
    private JTextField textFieldAge;
    private JTextField textFieldAddress;
    private JTable table;

    // Define column names for the JTable
    private String[] columnNames = {"O/R Number", "Name", "Age", "Gender", "Address", "Date", "Type of Account", "Amount"};

    // Create a DefaultTableModel with no data initially
    private DefaultTableModel tableModel = new DefaultTableModel(null, columnNames);

    // Radio buttons for gender and type of account
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnAccountReceivable;
    private JRadioButton rdbtnMale;
    private JRadioButton rdbtnFemale;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CustomerR frame = new CustomerR();
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
    public CustomerR() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 803, 518);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 64, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Label for the title
        JLabel lblTitle = new JLabel("Customer Record");
        lblTitle.setForeground(new Color(255, 255, 255));
        lblTitle.setFont(new Font("Arial Black", Font.BOLD, 24));
        lblTitle.setBounds(265, -13, 319, 57);
        contentPane.add(lblTitle);

        // Set custom icon with text
        ImageIcon customIcon = new ImageIcon("C:/Users/COMPUTER/eclipse-workspace/MKPAccountingSystem/MKpsw2/MKP.png");
        setIconImage(customIcon.getImage());

        // Set the title for the JFrame
        setTitle("Mackim Prints inc. Sales");

        // Labels for text fields
        JLabel lblOR = new JLabel("O/R Number:");
        lblOR.setForeground(new Color(255, 255, 255));
        lblOR.setBounds(10, 28, 100, 20);
        contentPane.add(lblOR);

        JLabel lblName = new JLabel("Customer Name:");
        lblName.setForeground(new Color(255, 255, 255));
        lblName.setBounds(154, 28, 120, 20);
        contentPane.add(lblName);

        JLabel lblDate = new JLabel("Date:");
        lblDate.setForeground(new Color(255, 255, 255));
        lblDate.setBounds(320, 28, 80, 20);
        contentPane.add(lblDate);

        JLabel lblAmount = new JLabel("Amount:");
        lblAmount.setForeground(new Color(255, 255, 255));
        lblAmount.setBounds(460, 28, 100, 20);
        contentPane.add(lblAmount);

        JLabel lblAge = new JLabel("Customer Age:");
        lblAge.setForeground(Color.WHITE);
        lblAge.setBounds(10, 74, 100, 20);
        contentPane.add(lblAge);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setForeground(Color.WHITE);
        lblGender.setBounds(154, 74, 100, 16);
        contentPane.add(lblGender);

        JLabel lblCustomerAddress = new JLabel("Customer Address:");
        lblCustomerAddress.setForeground(Color.WHITE);
        lblCustomerAddress.setBounds(320, 74, 128, 16);
        contentPane.add(lblCustomerAddress);

        // Text fields for data entry
        textFieldOR = new JTextField();
        textFieldOR.setBounds(10, 50, 120, 20);
        contentPane.add(textFieldOR);

        textFieldName = new JTextField();
        textFieldName.setBounds(154, 50, 150, 20);
        contentPane.add(textFieldName);

        textFieldDate = new JTextField();
        textFieldDate.setBounds(320, 50, 100, 20);
        contentPane.add(textFieldDate);

        textFieldAmount = new JTextField();
        textFieldAmount.setBounds(460, 50, 120, 20);
        contentPane.add(textFieldAmount);

        textFieldAge = new JTextField();
        textFieldAge.setBounds(10, 93, 120, 20);
        contentPane.add(textFieldAge);

        textFieldAddress = new JTextField();
        textFieldAddress.setBounds(320, 93, 128, 20);
        contentPane.add(textFieldAddress);

        // Button to add data to the table
        JButton btnAdd = new JButton("Add");
        btnAdd.setForeground(new Color(255, 255, 255));
        btnAdd.setBackground(new Color(0, 128, 0));
        btnAdd.setBounds(611, 50, 80, 20);
        btnAdd.addActionListener(e -> addRow());
        contentPane.add(btnAdd);

        // Create a JScrollPane to hold the JTable
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 138, 767, 317);
        contentPane.add(scrollPane);

        // Create the JTable using the DefaultTableModel
        table = new JTable(tableModel);

        // Add the JTable to the JScrollPane
        scrollPane.setViewportView(table);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setForeground(new Color(255, 255, 255));
        btnUpdate.setBackground(new Color(0, 0, 0));
        btnUpdate.addActionListener(e -> updateRow());
        btnUpdate.setBounds(611, 74, 80, 20);
        contentPane.add(btnUpdate);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setForeground(new Color(255, 255, 255));
        btnDelete.setBackground(new Color(255, 0, 0));
        btnDelete.addActionListener(e -> deleteRow());
        btnDelete.setBounds(697, 50, 80, 20);
        contentPane.add(btnDelete);

        rdbtnNewRadioButton = new JRadioButton("Cash");
        rdbtnNewRadioButton.setBackground(new Color(0, 64, 0));
        rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
        rdbtnNewRadioButton.setBounds(480, 94, 115, 18);
        contentPane.add(rdbtnNewRadioButton);

        rdbtnAccountReceivable = new JRadioButton("Account Receivable");
        rdbtnAccountReceivable.setBackground(new Color(0, 64, 0));
        rdbtnAccountReceivable.setForeground(new Color(255, 255, 255));
        rdbtnAccountReceivable.setBounds(480, 118, 140, 18);
        contentPane.add(rdbtnAccountReceivable);

        JLabel lblNewLabel = new JLabel("Type of Account:");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(460, 72, 100, 16);
        contentPane.add(lblNewLabel);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearFields();
				
			}
        });
        btnClear.setForeground(Color.WHITE);
        btnClear.setBackground(new Color(0, 0, 255));
        btnClear.setBounds(697, 74, 80, 20);
        btnClear.addActionListener(e -> clearFields());
        contentPane.add(btnClear);

        rdbtnMale = new JRadioButton("Male");
        rdbtnMale.setForeground(Color.WHITE);
        rdbtnMale.setBackground(new Color(0, 64, 0));
        rdbtnMale.setBounds(164, 94, 115, 18);
        contentPane.add(rdbtnMale);

        rdbtnFemale = new JRadioButton("Female");
        rdbtnFemale.setForeground(Color.WHITE);
        rdbtnFemale.setBackground(new Color(0, 64, 0));
        rdbtnFemale.setBounds(164, 118, 140, 18);
        contentPane.add(rdbtnFemale);

        // Group the gender radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdbtnMale);
        genderGroup.add(rdbtnFemale);

        // Group the account type radio buttons
        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(rdbtnNewRadioButton);
        accountTypeGroup.add(rdbtnAccountReceivable);
        
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
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setBounds(697, 0, 90, 28);
        contentPane.add(btnNewButton);
        
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
        btnLogOut.setBackground(new Color(0, 128, 0));
        btnLogOut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnLogOut.setBounds(611, 0, 90, 28);
        contentPane.add(btnLogOut);
    }

    private void deleteRow() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Delete Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateRow() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
        	// Get data from text fields
            String orNumber = textFieldOR.getText();
            String customerName = textFieldName.getText();
            String customerAge = textFieldAge.getText();
            String date = textFieldDate.getText();
            String amount = textFieldAmount.getText();

            // Get selected gender
            String gender = rdbtnMale.isSelected() ? "Male" : "Female";

            // Get customer address
            String customerAddress = textFieldAddress.getText();

            // Get selected type of account
            String typeOfAccount = rdbtnNewRadioButton.isSelected() ? "Cash" : "Account Receivable";

            // Update data in the table
            tableModel.setValueAt(orNumber, selectedRow, 0);
            tableModel.setValueAt(customerName, selectedRow, 1);
            tableModel.setValueAt(customerAge, selectedRow, 2);
            tableModel.setValueAt(date, selectedRow, 3);
            tableModel.setValueAt(amount, selectedRow, 4);
            tableModel.setValueAt(gender, selectedRow, 5);
            tableModel.setValueAt(customerAddress, selectedRow, 6);
            tableModel.setValueAt(typeOfAccount, selectedRow, 6);
            
            

            
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.", "Update Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addRow() {
        // Get data from text fields
        String orNumber = textFieldOR.getText();
        String customerName = textFieldName.getText();
        String customerAge = textFieldAge.getText();
        String date = textFieldDate.getText();
        String amount = textFieldAmount.getText();

        // Get selected gender
        String gender = rdbtnMale.isSelected() ? "Male" : "Female";

        // Get customer address
        String customerAddress = textFieldAddress.getText();

        // Get selected type of account
        String typeOfAccount = rdbtnNewRadioButton.isSelected() ? "Cash" : "Account Receivable";

        // Add data to the table
        Object[] rowData = {orNumber, customerName, customerAge, gender, customerAddress, date, typeOfAccount, amount};
        tableModel.addRow(rowData);

        
    }

    private void clearFields() {
        textFieldOR.setText("");
        textFieldName.setText("");
        textFieldAge.setText("");
        textFieldAddress.setText("");
        textFieldDate.setText("");
        textFieldAmount.setText("");
        rdbtnMale.setSelected(false);
        rdbtnFemale.setSelected(false);
        rdbtnNewRadioButton.setSelected(false);
        rdbtnAccountReceivable.setSelected(false);
    }
}








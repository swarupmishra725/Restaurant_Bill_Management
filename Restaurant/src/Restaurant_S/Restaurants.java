package Restaurant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.*;
import javax.swing.*;

public class Restaurants {

	private JFrame frame;
	private JTextField JtxtChickenBurger;
	private JTextField JtxtComboMeal;
	private JTextField JtxtCheeseBurger;
	private JTextField textField;
	private JTextField JtxtQuantity;
	private JTextField JtxtConvert;
	
	
	double firstnum,secondnum,result;
	String operations,answer;
	double[] i = new double[5];
	double Austrelia = 55.82;
	double Brazil = 13.85;
	double Canada = 59.94;
	double Chaina = 11.37;
	double Denmark = 11.87;
	double Egypt = 4.62;
	double Hong_Kong = 9.33;
	double Indonesia = 0.0051;
	double Japan = 0.66;
	double Keniya = 0.67;
	double Malaysia = 17.54;
	double Mexico = 3.63;
	double Nigeria = 0.18;
	double Pakistan = 0.46;
	double Philippines = 1.52;
	double Singapore = 54.72;
	double Turkey = 8.46;
	double UAE = 19.71;
	double UK = 102.79;
	double USA = 72.39;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
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
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1540, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(10, 432, 681, 231);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cost of Drinks");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(21, 38, 220, 31);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cost of Meal");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(21, 101, 251, 31);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cost of Delivery");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(21, 162, 220, 31);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel JlblCostofDrink = new JLabel("");
		JlblCostofDrink.setHorizontalAlignment(SwingConstants.RIGHT);
		JlblCostofDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JlblCostofDrink.setBounds(347, 38, 251, 31);
		JlblCostofDrink.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(JlblCostofDrink);
		
		JLabel JlblCostofMeal = new JLabel("");
		JlblCostofMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		JlblCostofMeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JlblCostofMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JlblCostofMeal.setBounds(347, 101, 251, 31);
		panel.add(JlblCostofMeal);
		
		JLabel JlblCostofDelivery = new JLabel("");
		JlblCostofDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		JlblCostofDelivery.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JlblCostofDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JlblCostofDelivery.setBounds(347, 162, 251, 31);
		panel.add(JlblCostofDelivery);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(10, 112, 681, 300);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(21, 22, 220, 31);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Combo  Meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(21, 63, 251, 31);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(21, 104, 220, 31);
		panel_1.add(lblNewLabel_1_2);
		
		JtxtChickenBurger = new JTextField();
		JtxtChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		JtxtChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JtxtChickenBurger.setBounds(343, 22, 200, 31);
		panel_1.add(JtxtChickenBurger);
		JtxtChickenBurger.setColumns(10);
		
		JtxtComboMeal = new JTextField();
		JtxtComboMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		JtxtComboMeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JtxtComboMeal.setColumns(10);
		JtxtComboMeal.setBounds(343, 63, 200, 31);
		panel_1.add(JtxtComboMeal);
		
		JtxtCheeseBurger = new JTextField();
		JtxtCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		JtxtCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JtxtCheeseBurger.setColumns(10);
		JtxtCheeseBurger.setBounds(343, 104, 200, 31);
		panel_1.add(JtxtCheeseBurger);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(18, 158, 525, 10);
		panel_1.add(separator);
		
		JCheckBox JchckbxHomeDelivery = new JCheckBox("Home Delivery");
		JchckbxHomeDelivery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JchckbxHomeDelivery.setBounds(21, 242, 200, 38);
		panel_1.add(JchckbxHomeDelivery);
		
		JCheckBox JchckbxIncludeTax = new JCheckBox("Include Tax");
		JchckbxIncludeTax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JchckbxIncludeTax.setBounds(343, 242, 200, 38);
		panel_1.add(JchckbxIncludeTax);
		
		JComboBox JcmbDrinks = new JComboBox();
		JcmbDrinks.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JcmbDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice", "Chocolate Shake", "Coffe", "Cola ", "Coke", "Cold Coffe", "Ice Tea", "Orange", "Pinaple", "Tea "}));
		JcmbDrinks.setBounds(21, 206, 200, 25);
		panel_1.add(JcmbDrinks);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Select Drink");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_2.setBounds(21, 165, 220, 31);
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Give Quantity");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_3.setBounds(343, 165, 220, 31);
		panel_1.add(lblNewLabel_1_2_3);
		
		JtxtQuantity = new JTextField();
		JtxtQuantity.setHorizontalAlignment(SwingConstants.RIGHT);
		JtxtQuantity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JtxtQuantity.setColumns(10);
		JtxtQuantity.setBounds(343, 200, 200, 31);
		panel_1.add(JtxtQuantity);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(713, 432, 375, 231);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Tax");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3_1.setBounds(25, 39, 145, 31);
		panel_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sub Total");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(25, 102, 145, 31);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Total");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_1_1.setBounds(25, 163, 145, 31);
		panel_2.add(lblNewLabel_1_2_1_1);
		
		JLabel JlblTax = new JLabel("");
		JlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		JlblTax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JlblTax.setBounds(180, 39, 161, 31);
		panel_2.add(JlblTax);
		
		JLabel JlblSubTotal = new JLabel("");
		JlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		JlblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JlblSubTotal.setBounds(180, 102, 161, 31);
		panel_2.add(JlblSubTotal);
		
		JLabel JlblTotal = new JLabel("");
		JlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		JlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JlblTotal.setBounds(180, 163, 161, 31);
		panel_2.add(JlblTotal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(713, 112, 375, 300);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JComboBox JcmbCurrency = new JComboBox();
		JcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Chose a Country", "Australia", "Brazil", "Canada", "Chaina", "Denmark", "Egypt", "Hong Kong", "Indonesia", "Keniya", "Malayasia", "Mexico", "Nigeria", "Pakistan", "Philippines", "Singapore", "Turkey", "UAE", "UK", "USA"}));
		JcmbCurrency.setBounds(67, 35, 200, 25);
		panel_3.add(JcmbCurrency);
		
		JtxtConvert = new JTextField();
		JtxtConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		JtxtConvert.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JtxtConvert.setColumns(10);
		JtxtConvert.setBounds(67, 90, 200, 31);
		panel_3.add(JtxtConvert);
		
		JLabel JlblConvert = new JLabel("");
		JlblConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		JlblConvert.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JlblConvert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JlblConvert.setBounds(67, 157, 200, 31);
		panel_3.add(JlblConvert);
		
		JButton jBtnConvert = new JButton("Convert");
		jBtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Indian = Double.parseDouble(JtxtConvert.getText());
				
				if(JcmbCurrency.getSelectedItem().equals("Australia"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Austrelia);
					JlblConvert.setText(cConvert1);
				}
				
				if(JcmbCurrency.getSelectedItem().equals("Brazil"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Brazil);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Canada"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Canada);
					JlblConvert.setText(cConvert1);
				}
				
				if(JcmbCurrency.getSelectedItem().equals("Chaina"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Chaina);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Denmark"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Denmark);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Egypt"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Egypt);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Hong_Kong"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Hong_Kong);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Indonesia"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Indonesia);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Japan"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Japan);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Keniya"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Keniya);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Malayasia"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Malaysia);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Mexico"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Mexico);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Nigeria);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Pakistan"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Pakistan);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Philippines"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Philippines);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Singapore"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Singapore);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("Turkey"))
				{
					String cConvert1 = String.format(" %.2f", Indian / Turkey);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("UAE"))
				{
					String cConvert1 = String.format(" %.2f", Indian / UAE);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("UK"))
				{
					String cConvert1 = String.format(" %.2f", Indian / UK);
					JlblConvert.setText(cConvert1);
				}

				if(JcmbCurrency.getSelectedItem().equals("USA"))
				{
					String cConvert1 = String.format(" %.2f", Indian / USA);
					JlblConvert.setText(cConvert1);
				}
				
				
			}
		});
		jBtnConvert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBtnConvert.setBounds(67, 244, 100, 30);
		panel_3.add(jBtnConvert);
		
		JButton jBtnClose = new JButton("Close");
		jBtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JtxtConvert.setText(null);
				JlblConvert.setText(null);
				JcmbCurrency.setSelectedItem("Chose One .....");
			}
		});
		jBtnClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBtnClose.setBounds(172, 244, 95, 30);
		panel_3.add(jBtnClose);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBounds(1110, 112, 393, 551);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 25, 373, 516);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea JtxtAreaReceipts = new JTextArea();
		JtxtAreaReceipts.setBounds(10, 10, 348, 469);
		panel_6.add(JtxtAreaReceipts);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
				
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.PLAIN, 18));
		btnBack.setBounds(37, 93, 60, 60);
		panel_7.add(btnBack);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(111, 95, 60, 60);
		panel_7.add(btnC);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(181, 95, 60, 60);
		panel_7.add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(251, 95, 60, 60);
		panel_7.add(btnPlus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn7.getText());
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(37, 163, 60, 60);
		panel_7.add(btn7);
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn8.getText());
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(111, 163, 60, 60);
		panel_7.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn9.getText());
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(181, 163, 60, 60);
		panel_7.add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(251, 163, 60, 60);
		panel_7.add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn4.getText());
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(37, 233, 60, 60);
		panel_7.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn5.getText());
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(111, 233, 60, 60);
		panel_7.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn6.getText());
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(181, 233, 60, 60);
		panel_7.add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(251, 233, 60, 60);
		panel_7.add(btnMult);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn1.getText());
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(37, 303, 60, 60);
		panel_7.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn2.getText());
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(111, 303, 60, 60);
		panel_7.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn2.getText());
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(181, 303, 60, 60);
		panel_7.add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBounds(251, 303, 60, 60);
		panel_7.add(btnDiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn0.getText());
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(37, 373, 60, 60);
		panel_7.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btnDot.getText());
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(111, 373, 60, 60);
		panel_7.add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(181, 373, 60, 60);
		panel_7.add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="-")
				{
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="*")
				{
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="/")
				{
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations=="%")
				{
					result=firstnum%secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(251, 373, 60, 60);
		panel_7.add(btnEqual);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(37, 25, 274, 60);
		panel_7.add(textField);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setBounds(10, 673, 1493, 130);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton jBtnTotal = new JButton("Total");
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------------------------- Burger Zone ---------------------------
				double ChickenBurger = Double.parseDouble(JtxtChickenBurger.getText());
				double iChickenBurger = 229;
				double Burger;
				
				Burger = ChickenBurger * iChickenBurger;
				String pMeal = String.format("%.2f", Burger);
				JlblCostofMeal.setText(pMeal);
				
				double ComboMeal = Double.parseDouble(JtxtComboMeal.getText());
				double iComboMeal = 449;
				double Combo;
				
				Combo = ComboMeal * iComboMeal;
				String cmbMeal = String.format("%.2f", Combo+Burger);
				JlblCostofMeal.setText(cmbMeal);
				
				double CheeseBurger = Double.parseDouble(JtxtCheeseBurger.getText());
				double iCheeseBurger = 399;
				double CheesseBurger;
				
				CheesseBurger = CheeseBurger * iCheeseBurger;
				String cMeal = String.format("%.2f", Combo+Burger+CheesseBurger);
				JlblCostofMeal.setText(cMeal);
				//---------------------------- Delivery Zone ---------------------------
				double iDelivery = 79;
				if(JchckbxHomeDelivery.isSelected())
				{
					String pDelivery = String.format("%.2f", iDelivery);
					JlblCostofDelivery.setText(pDelivery);
				}
				else
				{
					JlblCostofDelivery.setText("0");
				}
				
				//-----------------------------Drinks-------------------------------------
				double Drinks = Double.parseDouble(JtxtQuantity.getText());
				double Apple_Juice = 40 * Drinks;
				double Chocolate_Shake = 60 * Drinks;
				double Coffe = 45 * Drinks;
				double Cola = 40 * Drinks;
				double Coke = 40 * Drinks;
				double Cold_Coffe = 50 * Drinks;
				double Ice_Tea = 35 * Drinks;
				double Orange = 45 * Drinks;
				double Pinaple = 30 * Drinks;
				double Tea = 30 * Drinks;
				
				if(JcmbDrinks.getSelectedItem().equals("Apple Juice"))
				{
					String cApple_Juice = String.format("%.2f",Apple_Juice);
					JlblCostofDrink.setText(cApple_Juice);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Chocolate Shake"))
				{
					String cChocolate_Shake = String.format("%.2f",Chocolate_Shake);
					JlblCostofDrink.setText(cChocolate_Shake);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Coffe"))
				{
					String cCoffe = String.format("%.2f",Coffe);
					JlblCostofDrink.setText(cCoffe);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Cola"))
				{
					String cCola = String.format("%.2f",Cola);
					JlblCostofDrink.setText(cCola);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f",Coke);
					JlblCostofDrink.setText(cCoke);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Cold_Coffe"))
				{
					String cCold_Coffe = String.format("%.2f",Cold_Coffe);
					JlblCostofDrink.setText(cCold_Coffe);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Ice_Tea"))
				{
					String cIce_Tea = String.format("%.2f",Ice_Tea);
					JlblCostofDrink.setText(cIce_Tea);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Orange"))
				{
					String cOrange = String.format("%.2f",Orange);
					JlblCostofDrink.setText(cOrange);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Pinaple"))
				{
					String cPinaple = String.format("%.2f",Pinaple);
					JlblCostofDrink.setText(cPinaple);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Tea"))
				{
					String cTea = String.format("%.2f",Tea);
					JlblCostofDrink.setText(cTea);
				}
				
				if(JcmbDrinks.getSelectedItem().equals("Select a Drink"))
				{
					JlblCostofDrink.setText("0");
				}
				
				//---------------------------Tax Rate-------------------------
				
				double cTotal1 = Double.parseDouble(JlblCostofDrink.getText());
				double cTotal2 = Double.parseDouble(JlblCostofMeal.getText());
				double cTotal3 = Double.parseDouble(JlblCostofDelivery.getText());
				double AllTotal = (cTotal1+ cTotal2 + cTotal3)/100;
				if(JchckbxIncludeTax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					JlblTax.setText(iTotal);
				}
				
				//--------------------------Total------------------------
				
				double cTotal4 = Double.parseDouble(JlblTax.getText());
				
				double subTotal = (cTotal1 + cTotal2 + cTotal3);
				String isubTotal = String.format(" %.2f /-", subTotal);
				JlblSubTotal.setText(isubTotal);
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String iTotal = String.format("  %.2f /-", allTotal);
				JlblTotal.setText(iTotal);
				
				String iTaxTotal = String.format("  %.2f /-", cTotal4);
				JlblTax.setText(iTaxTotal);
				
				
				
				
				
			}
		});
		jBtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnTotal.setBounds(203, 57, 100, 30);
		panel_5.add(jBtnTotal);
		
		JButton jBtnReceipt = new JButton("Receipt");
		jBtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Qty1 = Double.parseDouble(JtxtChickenBurger.getText());
				double Qty2 = Double.parseDouble(JtxtComboMeal.getText());
				double Qty3 = Double.parseDouble(JtxtCheeseBurger.getText());
				
				JtxtAreaReceipts.setText("Restaurant Management System:-\n"+ "\nChicken Burger:\t" + Qty1 +"\nCombo Meal:\t\t" + Qty2 +"\nCheese Burger:\t\t" + Qty3 + "\n\nThanks for using my Restaurant\n\n");
			}
		});
		jBtnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnReceipt.setBounds(501, 57, 100, 30);
		panel_5.add(jBtnReceipt);
		
		JButton jBtnReset = new JButton("Reset");
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JlblCostofDelivery.setText(null);
				JlblSubTotal.setText(null);
				JlblTotal.setText(null);
				JlblTax.setText(null);
				JlblConvert.setText(null);
				JlblCostofDelivery.setText(null);
				JlblCostofDrink.setText(null);
				JlblCostofMeal.setText("0");
				JtxtChickenBurger.setText(null);
				JtxtCheeseBurger.setText(null);
				JtxtComboMeal.setText(null);
				JtxtQuantity.setText(null);
				JtxtConvert.setText(null);
				JtxtAreaReceipts.setText(null);
			}
		});
		jBtnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnReset.setBounds(800, 57, 100, 30);
		panel_5.add(jBtnReset);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jBtnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnExit.setBounds(1095, 57, 100, 30);
		panel_5.add(jBtnExit);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management Systems");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel.setBounds(10, 10, 1493, 102);
		frame.getContentPane().add(lblNewLabel);
	}
}

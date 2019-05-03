package beginner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIclass {

	// assigning 0-9 buttons and adding them to gui and enable ActionListener
	private JButton btn0 = new JButton("0");
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");

	// other btns too
	private JButton btnadd = new JButton("+");
	private JButton btndiff = new JButton("-");
	private JButton btnmult = new JButton("*");
	private JButton btndiv = new JButton("/");
	private JButton btnmod = new JButton("%");
	private JButton btnexp = new JButton("exp");
	private JButton btnsqrt = new JButton("sqrt");
	private JButton btncancel = new JButton("C");
	private JButton btnNeg = new JButton("-");
	private JButton btnDot = new JButton(".");
	private JButton btnReturn = new JButton("=");

	// Calc variables
	String strNum1 = "";
	String strNum2 = "";
	String[] statement;
	float num1 = 0;
	float num2 = 0;
	String strTotal = "";
	float totalVal = 0;

	private JFrame frame = new JFrame("Standard Calculator");

	private JPanel layout = new JPanel(new FlowLayout());

	private JTextArea display = new JTextArea();

	public void GUI() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 450);
		frame.setResizable(false);
		frame.setLayout(null);

		// display attributes
		display.setSize(390, 90);
		display.setLocation(7, 5);
		display.setEditable(false);

		// Sets JTextArea font and color.
		Font font = new Font("Digital-7", Font.BOLD, 24);
		display.setFont(font);
		display.setForeground(Color.BLUE);
		frame.setForeground(Color.GRAY);

		// btn0;
		frame.add(display);
		btn0.setSize(100, 50);
		btn0.setLocation(110, 360);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("0");
			}
		});
		// btnDot;
		frame.add(display);
		btnDot.setSize(100, 50);
		btnDot.setLocation(210, 360);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String text = display.getText();
					if (text.isEmpty()) {}
					else if(text.endsWith(".")) {}
					else
						display.append(".");
				
			}
		});

		// btnNeg;
		frame.add(display);
		btnNeg.setSize(100, 50);
		btnNeg.setLocation(10, 360);
		btnNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("-");
			}
		});
		// btn1;
		frame.add(display);
		btn1.setSize(100, 50);
		btn1.setLocation(10, 310);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("1");
			}
		});
		// btn2;
		frame.add(display);
		btn2.setSize(100, 50);
		btn2.setLocation(110, 310);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("2");
			}
		});
		// btn3;
		frame.add(display);
		btn3.setSize(100, 50);
		btn3.setLocation(210, 310);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("3");
			}
		});
		// btn+;
		frame.add(display);
		btnadd.setSize(50, 50);
		btnadd.setLocation(310, 310);
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("+");
			}
		});
		// btn4;
		frame.add(display);
		btn4.setSize(100, 50);
		btn4.setLocation(10, 260);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("4");
			}
		});
		// btn5;
		frame.add(display);
		btn5.setSize(100, 50);
		btn5.setLocation(110, 260);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("5");
			}
		});
		// btn6;
		frame.add(display);
		btn6.setSize(100, 50);
		btn6.setLocation(210, 260);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("6");
			}
		});
		// btndiff;
		frame.add(display);
		btndiff.setSize(50, 50);
		btndiff.setLocation(310, 260);
		btndiff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("-");
			}
		});
		// btn7;
		frame.add(display);
		btn7.setSize(100, 50);
		btn7.setLocation(10, 210);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("7");
			}
		});
		// btn8;
		frame.add(display);
		btn8.setSize(100, 50);
		btn8.setLocation(110, 210);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("8");
			}
		});
		// btn9;
		frame.add(display);
		btn9.setSize(100, 50);
		btn9.setLocation(210, 210);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("9");
			}
		});
		// btnC;
		frame.add(display);
		btncancel.setSize(100, 50);
		btncancel.setLocation(10, 110);
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = display.getText();
				if (text.isEmpty())
					;

				else
					display.setText(text.substring(0, text.length() - 1));
			}
		});
		// btnmult;
		frame.add(display);
		btnmult.setSize(50, 50);
		btnmult.setLocation(310, 210);
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("*");
			}
		});
		// btndiv;
		frame.add(display);
		btndiv.setSize(50, 45);
		btndiv.setLocation(310, 160);
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("/");
			}
		});
		// btnmod;
		frame.add(display);
		btnmod.setSize(50, 45);
		btnmod.setLocation(260, 160);
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("%");
			}
		});
		// btnexp;
		frame.add(display);
		btnexp.setSize(75, 50);
		btnexp.setLocation(285, 110);
		btnexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("exp");
			}
		});
		// btnsqrt;
		frame.add(display);
		btnsqrt.setSize(75, 50);
		btnsqrt.setLocation(210, 110);
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.append("sqrt");
				if (display.getText().contains("sqrt")) {
					statement = display.getText().split("sqrt");
					strNum1 = statement[0];
					
					num1 = Float.parseFloat(strNum1);
					
					totalVal = (float) Math.sqrt(num1);
					
					strTotal = Float.toString(totalVal);
					
					display.setText(strTotal);
				}
			}
		});
		// btnreturn;
		frame.add(display);
		btnReturn.setSize(50, 50);
		btnReturn.setLocation(310, 360);
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (display.getText().contains("/")) {
					statement = display.getText().split("\\/");
					strNum1 = statement[0];
					strNum2 = statement[1];

					num1 = Float.parseFloat(strNum1);
					num2 = Float.parseFloat(strNum2);

					totalVal = num1 / num2;

					strTotal = Float.toString(totalVal);

					display.setText(strTotal);
				}
				if (display.getText().contains("*")) {
					statement = display.getText().split("\\*");
					strNum1 = statement[0];
					strNum2 = statement[1];

					num1 = Float.parseFloat(strNum1);
					num2 = Float.parseFloat(strNum2);

					totalVal = num1 * num2;

					strTotal = Float.toString(totalVal);

					display.setText(strTotal);
				}
				if (display.getText().contains("+")) {
					statement = display.getText().split("\\+");
					strNum1 = statement[0];
					strNum2 = statement[1];

					num1 = Float.parseFloat(strNum1);
					num2 = Float.parseFloat(strNum2);

					totalVal = num1 + num2;

					strTotal = Float.toString(totalVal);

					display.setText(strTotal);
				}
				if (display.getText().contains("-")) {
					statement = display.getText().split("\\-");
					strNum1 = statement[0];
					strNum2 = statement[1];

					num1 = Float.parseFloat(strNum1);
					num2 = Float.parseFloat(strNum2);

					totalVal = num1 - num2;

					strTotal = Float.toString(totalVal);

					display.setText(strTotal);
				}
				if (display.getText().contains("%")) {
					statement = display.getText().split("\\%");
					strNum1 = statement[0];
					strNum2 = statement[1];

					num1 = Float.parseFloat(strNum1);
					num2 = Float.parseFloat(strNum2);

					totalVal = num1 % num2;

					strTotal = Float.toString(totalVal);

					display.setText(strTotal);
				}
				if (display.getText().contains("exp")) {
					statement = display.getText().split("exp");
					strNum1 = statement[0];
					strNum2 = statement[1];

					num1 = Float.parseFloat(strNum1);
					num2 = Float.parseFloat(strNum2);

					totalVal = (float) Math.pow(num1, num2);

					strTotal = Float.toString(totalVal);

					display.setText(strTotal);
				}
			}
		});

		// adds objects to screen
		frame.add(btn0);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(btnadd);
		frame.add(btndiff);
		frame.add(btndiv);
		frame.add(btnmult);
		frame.add(btnmod);
		frame.add(btnexp);
		frame.add(btnNeg);
		frame.add(btnDot);
		frame.add(btnReturn);
		frame.add(btncancel);
		frame.add(btnsqrt);

		frame.add(layout);
		frame.repaint(); // fix buttons not showing up before hovering over them with mouse
	}
}

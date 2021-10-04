package pohe61;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class CuaSoChinh {

	private JFrame frame;
	private JTextField textWeight;
	private JTextField textHeight;
	private JTextField textBMI;
	private JTextField textAdvice;
	public Float CalBMI;//chỉ số BMI
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuaSoChinh window = new CuaSoChinh();
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
	public CuaSoChinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblINFOR = new JLabel("WELCOME TO MY PROGRAM");
		lblINFOR.setHorizontalAlignment(SwingConstants.CENTER);
		lblINFOR.setToolTipText("");
		lblINFOR.setBounds(109, 11, 195, 14);
		frame.getContentPane().add(lblINFOR);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(26, 89, 59, 20);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(26, 123, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		textWeight = new JTextField();
		textWeight.setBounds(71, 120, 145, 20);
		frame.getContentPane().add(textWeight);
		textWeight.setColumns(10);
		
		textHeight = new JTextField();
		textHeight.setBounds(71, 89, 145, 20);
		frame.getContentPane().add(textHeight);
		textHeight.setColumns(10);
		
		JLabel lblReadme1 = new JLabel("Height = Cm");
		lblReadme1.setBounds(101, 47, 89, 14);
		frame.getContentPane().add(lblReadme1);
		
		JLabel lblReadme2 = new JLabel("Weight = Kg");
		lblReadme2.setBounds(246, 47, 80, 14);
		frame.getContentPane().add(lblReadme2);
		
		JPanel panelRAD = new JPanel();
		panelRAD.setBorder(new TitledBorder(null, "Region", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panelRAD.setBounds(270, 80, 139, 70);
		frame.getContentPane().add(panelRAD);
		panelRAD.setLayout(null);
		
		JRadioButton radAsian = new JRadioButton("Asian");
		radAsian.setBounds(6, 18, 109, 23);
		panelRAD.add(radAsian);
		
		JRadioButton radNonAsian = new JRadioButton("Non - Asian");
		radNonAsian.setHorizontalAlignment(SwingConstants.LEFT);
		radNonAsian.setBounds(6, 40, 109, 23);
		panelRAD.add(radNonAsian);
		
		JButton btnBMI = new JButton("BMI");
		btnBMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//get text
				String strHeight = textHeight.getText();
				String strWeight = textWeight.getText();
				//convert string to float
				Float numHeight = Float.parseFloat(strHeight);
				Float numWeight = Float.parseFloat(strWeight);
				//calculating BMI
				numHeight = numHeight/100;//convert centimet to meter
				CalBMI = numWeight/(numHeight*numHeight);
				//result
				textBMI.setText(String.valueOf(CalBMI));
			}
		});
		btnBMI.setBounds(26, 192, 89, 26);
		frame.getContentPane().add(btnBMI);
		
		textBMI = new JTextField();
		textBMI.setBounds(125, 192, 114, 26);
		frame.getContentPane().add(textBMI);
		textBMI.setColumns(10);
		
		JButton btnAdvice = new JButton("Get Advice?");
		btnAdvice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(radAsian.isSelected() == true) {
					if(CalBMI < 18.5) textAdvice.setText("Underweight!");
					else	if(CalBMI >= 18.5 && CalBMI <= 22.9)	textAdvice.setText("You are Good :D");
					else	if(CalBMI >= 23 && CalBMI <= 24.9)	textAdvice.setText("You are Overweight");
					else	if(CalBMI >= 25 && CalBMI <=29.9)	textAdvice.setText("Pre-Obese!");
					else	if(CalBMI == 30)	textAdvice.setText("Obese");
					else	if(CalBMI > 30 && CalBMI <= 40)		textAdvice.setText("Obese I");
					else	if(CalBMI > 40 && CalBMI <= 50)		textAdvice.setText("Obese II");
					else	textAdvice.setText("Obesity III");
				}
				else if(radNonAsian.isSelected() == true) {
					if(CalBMI < 18.5) textAdvice.setText("Underweight!");
					else	if(CalBMI >= 18.5 && CalBMI <= 24.9)	textAdvice.setText("You are Good :D");
					else	if(CalBMI >= 25 && CalBMI <= 29.9)	textAdvice.setText("You are Overweight");
					else	if(CalBMI == 30)	textAdvice.setText("Obese!");
					else	if(CalBMI > 30 && CalBMI <= 40)		textAdvice.setText("Obese I");
					else	if(CalBMI > 40 && CalBMI <= 50)		textAdvice.setText("Obese II");
					else 	textAdvice.setText("Obese III");
				}
			}
		});
		btnAdvice.setBounds(270, 171, 139, 20);
		frame.getContentPane().add(btnAdvice);
		
		textAdvice = new JTextField();
		textAdvice.setHorizontalAlignment(SwingConstants.CENTER);
		textAdvice.setBounds(270, 198, 139, 40);
		frame.getContentPane().add(textAdvice);
		textAdvice.setColumns(10);
	}
}

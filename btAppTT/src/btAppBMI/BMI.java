package btAppBMI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class BMI extends Frame{
	//thuoc tinh
	TextField txtCNang, txtCCao, txtBMI;
	Label lbrme, lbCNang, lbCCao, lbnoti1;
	Button btnBMI, btnnoti;
	Float CalBMI;
	
	// khoi tao ham
	public BMI() {
		FlowLayout fL = new FlowLayout();
		setLayout(fL); //quy dinh layout
		setBounds(440,150,300,310);//kich thuoc
		setTitle("Calculating BMI");//tieu de cua so
		setVisible(true);
		
		//dua cac dieu khien vao frame
		lbrme = new Label("       Weight = Kg 	               Height = Cm");
		lbCNang = new Label("Weight:");
		lbCCao = new Label("Height:");
		lbnoti1 = new Label("Click to get notification!");
		
		
		txtCNang = new TextField(24);
		txtCCao = new TextField(24);
		txtBMI = new TextField(27);
		
		btnBMI = new Button("BMI");
		btnnoti = new Button("Get Notification?");
		
		add(lbrme);
		add(lbCNang);	add(txtCNang);
		add(lbCCao);	add(txtCCao);
		add(btnBMI);		
		add(txtBMI);
		
		btnBMI.setSize(100, 100);
		btnnoti.setSize(100, 100);
		lbnoti1.setSize(100, 100);
		
		add(btnnoti);	add(lbnoti1);
		
		//THEM BO LANG NGHE VA XU LY SU KIEN CHO CUA SO FRAME
		addWindowListener(new xuly_cs());
		btnBMI.addActionListener(new xuly_btn_BMI());
		btnnoti.addActionListener(new xuly_btn_noti());
		
	}
	class xuly_btn_BMI implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//code xu ly
			String strCNang = txtCNang.getText();
			String strCCAO = txtCCao.getText();
			//convert string to float
			Float numCNang = Float.parseFloat(strCNang);
			Float numCCao = Float.parseFloat(strCCAO);
			//calculating BMI
			numCCao = numCCao/100;//convert centimet to meter
			CalBMI = numCNang/(numCCao*numCCao);
			//result
			txtBMI.setText(String.valueOf(CalBMI));
		}
		
	}
	
	class xuly_btn_noti implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(CalBMI < 18.5) lbnoti1.setText("You are thin!");
			else	if(CalBMI >= 18.5 && CalBMI <= 24.9)	lbnoti1.setText("You are Good :D");
			else	if(CalBMI >= 25 && CalBMI <= 29.9)	lbnoti1.setText("You are obese");
			else	if(CalBMI >= 30 && CalBMI <34.9)	lbnoti1.setText("Obesity I");
			else	if(CalBMI > 35 && CalBMI <39.5)	lbnoti1.setText("Obesity II");
			else	lbnoti1.setText("Obesity III");
		}
		
	}
	class xuly_cs implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

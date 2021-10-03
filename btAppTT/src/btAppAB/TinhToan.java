package btAppAB;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TinhToan extends Frame{
	//thuoc tinh
	TextField txtA, txtB, txtKQ;
	Label lbA, lbB, lbKQ;
	Button btnCong, btnTru, btnNhan, btnChia;
	//ham tao
	public TinhToan() {
		FlowLayout fL = new FlowLayout();
		setLayout(fL); //quy dinh layout
		setBounds(440,150,320,300);//kich thuoc
		setTitle("Calculating A,B");//tieu de cua so
		setVisible(true);
		//dua cac dieu khien vao frame
		
		lbA = new Label("A =");
		lbB = new Label("B =");
		lbKQ = new Label("Result =");
		
		txtA = new TextField(33);
		txtB = new TextField(33);
		txtKQ = new TextField(38);
		
		btnCong = new Button("Addition");
		btnTru = new Button("Subtraction");
		btnNhan = new Button("Multiplication");
		btnChia = new Button("Division");
		
		add(lbA);	add(txtA);
		add(lbB);	add(txtB);
		add(btnCong);	add(btnTru);	add(btnNhan);	add(btnChia);
		add(lbKQ);		
		add(txtKQ);
		
		//THEM BO LANG NGHE VA XU LY SU KIEN CHO CUA SO FRAME
		addWindowListener(new LSN_XL_CS());
		
		//THEM BO LANG NGHE VA XU LY SU KIEN CHO NUT TINH TONG
		btnCong.addActionListener(new LSN_XL_Cong());
		
		//THEM BO LANG NGHE VA XU LY SU KIEN CHO NUT TINH TONG
		btnTru.addActionListener(new LSN_XL_Tru());
		
		//THEM BO LANG NGHE VA XU LY SU KIEN CHO NUT TINH TONG
		btnNhan.addActionListener(new LSN_XL_Nhan());
		
		//THEM BO LANG NGHE VA XU LY SU KIEN CHO NUT TINH TONG
		btnChia.addActionListener(new LSN_XL_Chia());
		
	}	
	//VIET LOP LANG NGHE VA XU LY Phep Toan NGOAI HAM TAO
	class LSN_XL_Cong implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//code xu ly
			String strA = txtA.getText();
			String strB = txtB.getText();
			//Convert to number
			float numA = Float.parseFloat(strA);
			float numB = Float.parseFloat(strB);
			//Tinh tong
			Float sumAB = numA + numB;
			//xuat ket qua
			txtKQ.setText(String.valueOf(sumAB));
		}
	}
	
	class LSN_XL_Tru implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//code xu ly
			String strA = txtA.getText();
			String strB = txtB.getText();
			//Convert to number
			Float numA = Float.parseFloat(strA);
			Float numB = Float.parseFloat(strB);
			//Tinh Tru
			Float sumAB = numA - numB;
			//xuat ket qua
			txtKQ.setText(String.valueOf(sumAB));
		}
	}
	
	class LSN_XL_Nhan implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//code xu ly
			String strA = txtA.getText();
			String strB = txtB.getText();
			//Convert to number
			Float numA = Float.parseFloat(strA);
			Float numB = Float.parseFloat(strB);
			//Tinh Tru
			Float sumAB = numA * numB;
			//xuat ket qua
			txtKQ.setText(String.valueOf(sumAB));
		}
	}
	
	class LSN_XL_Chia implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//code xu ly
			String strA = txtA.getText();
			String strB = txtB.getText();
			//Convert to number
			Float numA = Float.parseFloat(strA);
			Float numB = Float.parseFloat(strB);
			//Tinh tong
			float sumAB = numA / numB;
			//xuat ket qua
			txtKQ.setText(String.valueOf(sumAB));
		}
	}
	
	
	//VIET LOP LANG NGHE VA XU LY CUA SO
	class LSN_XL_CS implements WindowListener{

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


package NguyenPhuong;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CuaSoTong extends Frame{
	//thuoc tinh
	TextField txtA, txtB, txtKQ;
	Label lbA, lbB, lbKQ;
	Button btnCong;
	//ham tao
	public CuaSoTong() {
		FlowLayout fL = new FlowLayout();
		setLayout(fL); //quy dinh layout
		setBounds(440,150,280,300);//kich thuoc
		setTitle("Tính tổng A và B");//tieu de cua so
		setVisible(true);
		//dua cac dieu khien vao frame
		
		lbA = new Label("A =");
		lbB = new Label("B =");
		lbKQ = new Label("Ket Qua =");
		
		txtA = new TextField(26);
		txtB = new TextField(26);
		txtKQ = new TextField(32);
		
		btnCong = new Button("Tinh Tong");
		add(lbA);	add(txtA);
		add(lbB);	add(txtB);
		add(btnCong);
		add(lbKQ);	add(txtKQ);
		//THEM BO LANG NGHE VA XU LY SU KIEN CHO NUT TINH TONG
		btnCong.addActionListener(new LSN_XL_Cong());
		//THEM BO LANG NGHE VA XU LY SU KIEN CHO CUA SO FRAME
		addWindowListener(new LSN_XL_CS());
	}	
	//VIET LOP LANG NGHE VA XU LY CONG O NGOAI HAM TAO
	class LSN_XL_Cong implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//code xu ly
			String strA = txtA.getText();
			String strB = txtB.getText();
			//Convert to number
			int numA = Integer.parseInt(strA);
			int numB = Integer.parseInt(strB);
			//Tinh tong
			int sumAB = numA + numB;
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

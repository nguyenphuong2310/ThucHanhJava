import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BTVN {

	public static void main(String[] args) {
		Frame fr = new Frame("Tổng A và B");
		fr.setBounds(440,150,250,300);
		fr.setLayout(new FlowLayout());
		//
		Label lbA = new Label("A = ");
		Label lbB = new Label("B = ");
		Label lbKQ = new Label("Kết Quả = ");
		//
		TextField txtA = new TextField(20);
		TextField txtB = new TextField(20);
		TextField txtKQ = new TextField(26);
		//
		Button btnCong = new Button("Tính Tổng: ");

		// Add vao frame
		fr.add(lbA); fr.add(txtA);
		fr.add(lbB); fr.add(txtB);
		fr.add(btnCong);
		fr.add(lbKQ); fr.add(txtKQ);
		//Xử lý sự kiện nút tính tổng
		ActionListener LSN = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String strA = txtA.getText();
				String strB = txtB.getText();
				//Convert to number
				int numA = Integer.parseInt(strA);
				int numB = Integer.parseInt(strB);
				//Tính tổng
				int sumAB = numA + numB;
				//Xuất kết quả
				txtKQ.setText(String.valueOf(sumAB));
			}
		};
			
		btnCong.addActionListener(LSN);
			
		fr.addWindowListener(new WindowAdapter()
		{
					@Override
					public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
							
		});
		
		fr.setVisible(true);
	}

}

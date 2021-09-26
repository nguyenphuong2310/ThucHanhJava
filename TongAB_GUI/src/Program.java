import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.event.WindowListener;
import java.awt.FlowLayout;
public class Program {

	public static void main(String[] args) {
		
		Frame fr = new Frame("Tổng 2 số A B");
		fr.setBounds(0, 0, 600, 400);
		fr.setLayout(new FlowLayout());
		//
		Label lbA = new Label("A = ");
		Label lbB = new Label("B = ");
		Label lbKQ = new Label("KQ = ");
		
		TextField txtA = new TextField();
		TextField txtB = new TextField();
		TextField txtKQ = new TextField();
		
		Button btnCong = new Button("Tính Tổng: ");
		
		//gan vao fr
		
		fr.add(lbA); fr.add(txtA);
		fr.add(lbB); fr.add(txtB);
		fr.add(btnCong);
		fr.add(lbKQ); fr.add(txtKQ);
		
		
		//đóng cửa sổ
		fr.addWindowListener((WindowListener) new WindowAdapter()
		{
					@Override
					public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
							
		});
	}

}
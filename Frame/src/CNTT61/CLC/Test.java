package CNTT61.CLC;
import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {

	public static void main(String[] args) {
		//
		Frame mainFrame = new Frame("Main Frame");//tạo được đối tượng trong bộ nhớ
		mainFrame.setBounds(0,0,100,200);
		mainFrame.setVisible(true);

		//them 1 nut vao
		Button btnOK = new btnOK("OK");
		btnOK.setLocation()
		
		
		//đóng cửa sổ
		mainFrame.addWindowListener((WindowListener) new WindowAdapter()
			{
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
					
		});
		
	}

}

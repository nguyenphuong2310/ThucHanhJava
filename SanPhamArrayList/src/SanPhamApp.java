import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SanPhamApp {

	private JFrame frmQunLSn;
	private JTextField textMSP;
	private JTextField textTSP;
	private JTextField textDG;
	JButton btnAdd;
	JButton btnfind;
	JButton btnDel;
	JButton btnfix;
	JButton btnshow;
	JTextArea textArea;
	private JFrame frmArraylist;
	List<SanPham> sanPhams = new ArrayList<SanPham>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SanPhamApp window = new SanPhamApp();
					window.frmQunLSn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SanPhamApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQunLSn = new JFrame();
		frmQunLSn.setTitle("Quản Lý Sản Phẩm");
		frmQunLSn.setBounds(100, 100, 485, 387);
		frmQunLSn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQunLSn.getContentPane().setLayout(null);
		
		btnAdd = new JButton("Thêm");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtMSP = textMSP.getText();	
				String txtTSP = textTSP.getText();
				int txtDG = Integer.parseInt(textDG.getText());
				
				SanPham sp = new SanPham(txtMSP,txtTSP,txtDG);
				sanPhams.add(sp);
				//set button noti
				JOptionPane.showMessageDialog(frmArraylist, "Bạn đã thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		btnAdd.setBounds(10, 143, 89, 23);
		frmQunLSn.getContentPane().add(btnAdd);
		
		btnfind = new JButton("Tìm");
		btnfind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtMSP = textMSP.getText();
				int check = 0;
				for(int i =0; i< sanPhams.size(); i++) {
					if(sanPhams.get(i).MaSP.equals(txtMSP)) {
						textArea.setText(null);
						textArea.append(sanPhams.get(i).toString());
						check++;
						break;
					}	
				}
				if(check > 0)
				//set button noti
				JOptionPane.showMessageDialog(frmArraylist, "Đã tìm thấy sản phẩm!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				else
				//set button noti
				JOptionPane.showMessageDialog(frmArraylist, "Không có sản phẩm cần tìm!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnfind.setBounds(129, 143, 89, 23);
		frmQunLSn.getContentPane().add(btnfind);
		
		btnDel = new JButton("Xóa");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtMSP = textMSP.getText();
				int check = 0;
				for(int i = 0; i< sanPhams.size(); i++) {
					if(sanPhams.get(i).MaSP.equals(txtMSP)) {
						check++;
						sanPhams.remove(i);
					}
				}
				if(check > 0)
					//set button noti
					JOptionPane.showMessageDialog(frmArraylist, "Đã Xóa Sản Phẩm!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				else
					//set button noti
					JOptionPane.showMessageDialog(frmArraylist, "Không Có Sản Phẩm Này Trong Danh Sách!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

		}
		});
		btnDel.setBounds(251, 143, 89, 23);
		frmQunLSn.getContentPane().add(btnDel);
		
		btnfix = new JButton("Sửa");
		btnfix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtMSP = textMSP.getText();
				String txtTSP = textTSP.getText();
				int txtDG = Integer.parseInt(textDG.getText());
				int check = 0;
				for(int i = 0; i < sanPhams.size(); i++) {
					if(sanPhams.get(i).MaSP.equals(txtMSP)) {
						check++;
						sanPhams.set(i, new SanPham(txtMSP,txtTSP,txtDG));
					}
				}
				if(check > 0)
					//set button noti
					JOptionPane.showMessageDialog(frmArraylist, "Đã Sửa Thành Công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				else
					//set button noti
					JOptionPane.showMessageDialog(frmArraylist, "Không Có Sản Phẩm Này Trong Danh Sách!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnfix.setBounds(370, 143, 89, 23);
		frmQunLSn.getContentPane().add(btnfix);
		
		btnshow = new JButton("Hiển thị");
		btnshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				for (SanPham sanPham : sanPhams) {
					textArea.append(sanPham.toString() + "\n");
				}
			}
		});
		btnshow.setBounds(190, 185, 89, 23);
		frmQunLSn.getContentPane().add(btnshow);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 219, 449, 118);
		frmQunLSn.getContentPane().add(textArea);
		
		textMSP = new JTextField();
		textMSP.setBounds(175, 29, 220, 20);
		frmQunLSn.getContentPane().add(textMSP);
		textMSP.setColumns(10);
		
		textTSP = new JTextField();
		textTSP.setBounds(175, 70, 220, 20);
		frmQunLSn.getContentPane().add(textTSP);
		textTSP.setColumns(10);
		
		textDG = new JTextField();
		textDG.setBounds(175, 112, 220, 20);
		frmQunLSn.getContentPane().add(textDG);
		textDG.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mã Sản Phẩm");
		lblNewLabel.setBounds(64, 32, 79, 14);
		frmQunLSn.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Sản Phẩm");
		lblNewLabel_1.setBounds(64, 73, 101, 14);
		frmQunLSn.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Đơn Giá");
		lblNewLabel_2.setBounds(64, 115, 79, 14);
		frmQunLSn.getContentPane().add(lblNewLabel_2);
	}
}

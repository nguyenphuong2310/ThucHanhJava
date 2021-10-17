package clc61.ntu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class Program {
	//Khai bao danh sach
	ArrayList<String> dsten;
	
	
	private JFrame frmDemoArraylist;
	private JTextField txtName;
	JLabel lblHoTen;
	JButton btnAdd;
	JButton btnShow;
	JTextArea textAreaHoTen;
	JLabel lblStatus;
	private JTextField textNameFind;
	private JButton btnFind;
	private JLabel lblNameFind;
	private JTextArea textAreaNameNow;
	private JLabel lblDanhSach;
	private JFrame frmArraylist;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program window = new Program();
					window.frmDemoArraylist.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Program() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDemoArraylist = new JFrame();
		frmDemoArraylist.setTitle("Demo ArrayList");
		frmDemoArraylist.setBounds(100, 100, 577, 402);
		frmDemoArraylist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDemoArraylist.getContentPane().setLayout(null);
		
		lblHoTen = new JLabel("Name:");
		lblHoTen.setBounds(23, 28, 50, 20);
		frmDemoArraylist.getContentPane().add(lblHoTen);
		
		txtName = new JTextField();
		txtName.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				lblStatus.setText("I'm waiting!");
			}
		});
		txtName.setBounds(121, 28, 273, 20);
		frmDemoArraylist.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		btnAdd = new JButton("Add");
		dsten = new ArrayList<String>();
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//su dung ArrayList la bien toan cuc
				addDS(dsten);	//void addDS(ArrayList<String> a)
			}
		});
		btnAdd.setBounds(434, 27, 89, 23);
		frmDemoArraylist.getContentPane().add(btnAdd);
		
		btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				showDS(dsten);//void showDS(ArrayList<String> a)
			}
		});
		btnShow.setBounds(69, 153, 100, 23);
		frmDemoArraylist.getContentPane().add(btnShow);
		
		textAreaHoTen = new JTextArea();
		textAreaHoTen.setBounds(10, 187, 228, 154);
		frmDemoArraylist.getContentPane().add(textAreaHoTen);
		
		lblStatus = new JLabel("Status");
		lblStatus.setForeground(Color.BLUE);
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setBounds(257, 48, 137, 14);
		frmDemoArraylist.getContentPane().add(lblStatus);
		
		textNameFind = new JTextField();
		textNameFind.setBounds(121, 73, 273, 20);
		frmDemoArraylist.getContentPane().add(textNameFind);
		textNameFind.setColumns(10);
		
		btnFind = new JButton("Search");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean result = false;
				for(int index = 0; index < dsten.size(); index++) {
					String sTen = dsten.get(index);
					if (sTen.equals(textNameFind.getText())){
						result = true;
						break;
					}
					else {
						result = false;
					}
				}
				if(result == true) {
					JOptionPane.showMessageDialog(frmArraylist, "Tên vừa nhập có trong danh sách!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				} 
				else {
					JOptionPane.showMessageDialog(frmArraylist, "Tên vừa nhập chưa có trong danh sách", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		btnFind.setBounds(434, 73, 89, 21);
		frmDemoArraylist.getContentPane().add(btnFind);
		
		lblNameFind = new JLabel("Search Name");
		lblNameFind.setBounds(23, 76, 88, 14);
		frmDemoArraylist.getContentPane().add(lblNameFind);
		
		textAreaNameNow = new JTextArea();
		textAreaNameNow.setBounds(323, 187, 228, 154);
		frmDemoArraylist.getContentPane().add(textAreaNameNow);
		
		lblDanhSach = new JLabel("List Name");
		lblDanhSach.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSach.setBounds(323, 157, 228, 14);
		frmDemoArraylist.getContentPane().add(lblDanhSach);
	}
	//
	void addDS(ArrayList<String> a) {
		String hoten = txtName.getText();
		a.add(hoten);
		//xoa noi dung
		txtName.setText("");
		//status
		lblStatus.setText("added");
		textAreaNameNow.append(hoten + "\n");
	}
	
	void showDS(ArrayList<String> a) {
		String fName = textNameFind.getText();
		for(int index = 0; index<a.size(); index++) {
			//lay gia tri o vi tri index 
			String sTen = a.get(index);
			//dua vao dsshow
			if(fName.equals(sTen) == true) {
				textAreaHoTen.append(fName + "   Vị trí " + (index+1) +" trong danh sách\n");
				textNameFind.setText("");
			}
		}
	}
}

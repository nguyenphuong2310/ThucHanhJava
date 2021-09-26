import java.util.Scanner;

public class Tgiac {
	public static void main(String[] args) {
		//Khai báo các biến chứa 3 cạnh
		float a, b, c, CV;
		//Tạo đối tượng để nhập dữ liệu từ bàn phím
		//Sử dụng lớp Scanner
		Scanner b_phim = new Scanner(System.in);
		
		//Nhập a
		System.out.print("Mời nhập chiều dài a: ");	
		a = b_phim.nextFloat();
		
		//Nhập b
		System.out.print("Mời nhập chiều dài b: ");	
		b = b_phim.nextFloat();
		
		//Nhập c
		System.out.print("Mời nhập chiều dài c: ");	
		c = b_phim.nextFloat();
		
		if((a+b> c) && (a+c > b) && (b+c > a)) {
			CV = a+b+c;
			System.out.println("Chu vi bằng: "+ CV);
		}
		else
			System.out.println("Nhập sai dữ liệu!");
	}

}

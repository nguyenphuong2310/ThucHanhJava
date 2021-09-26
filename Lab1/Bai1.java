import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		String hoten;
		double diem;
		Scanner b_phim = new Scanner(System.in);
		
		System.out.print("Nhập họ và tên: ");
		hoten = b_phim.nextLine();
		
		System.out.print("Nhập Điểm TB: ");
		diem = b_phim.nextDouble();
		
		System.out.printf("Họ và tên : %s\nĐiểm TB: %.2f",hoten, diem);
	}

}

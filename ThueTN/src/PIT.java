import java.util.Scanner;

public class PIT {

	public static void main(String[] args) {
		int tNhap;
		
		Scanner b_phim = new Scanner(System.in);
		
		System.out.print("Thu nhập của bạn là: ");
		tNhap = b_phim.nextInt();
		
		if(tNhap < 9000000)
			System.out.print("Không đóng thuế!");
		else if(tNhap < 15000000) {
			tNhap = tNhap*10/100;
			System.out.printf("Thuế thu nhập là: %d",tNhap);
		}
		else if(tNhap < 30000000) {
			tNhap = tNhap*15/100;
			System.out.printf("Thuế thu nhập là: %d",tNhap);
		}
		else if(tNhap > 30000000) {
			tNhap = tNhap*20/100;
			System.out.printf("Thuế thu nhập là: %d",tNhap);
		}	
	}

}
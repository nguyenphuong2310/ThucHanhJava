import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		
		int hSoa, hSob, hSoc;
		double Delta, cDelta;
		
		Scanner b_phim = new Scanner(System.in);
		
		//Nhập hệ số cho a, b, c
		
		System.out.print("Nhập hệ số a:");
		hSoa = b_phim.nextInt();
		
		System.out.print("Nhập hệ số b:");
		hSob = b_phim.nextInt();
		
		System.out.print("Nhập hệ số c:");
		hSoc = b_phim.nextInt();
		
		Delta = Math.pow(hSob, 2) - 4 * hSoa * hSoc;
		cDelta = Math.sqrt(Delta);
		
		System.out.printf("Delta = %f\ncDelta = %f", Delta, cDelta);
	}

}

import java.util.Scanner;

public class Bai3 {
	
	public static void main(String[] args) {
		double canh, tTich;
		
		Scanner b_phim = new Scanner(System.in);
		
		//Nhập cạnh của một khối lập phương
		System.out.print("Nhập cạnh: ");
		canh = b_phim.nextDouble();
		
		tTich = Math.pow(canh,3);
		
		System.out.printf("Thể tích lập phương: %.2f", tTich);
	}
}
	
	

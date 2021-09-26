import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		float cDai, cRong, cVi, dTich, minCanh;
		Scanner b_phim = new Scanner(System.in);
		
		//Nhập 2 cạnh của hình chữ nhật
		System.out.print("Nhập chiều dài cạnh: ");
		cDai = b_phim.nextFloat();
		
		System.out.print("Nhập chiều rộng cạnh: ");
		cRong = b_phim.nextFloat();
		
		cVi = (cDai + cRong) * 2;
		dTich = cDai * cRong;
		minCanh = Math.min(cDai, cRong);
		System.out.printf("Chu Vi HCN: %.3f \nDiện Tích HCN: %.3f\nCạnh nhỏ nhất: %.3f",cVi, dTich, minCanh);
	}

}

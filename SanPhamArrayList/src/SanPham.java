
public class SanPham {
	String MaSP, TenSP;
	int DonGia;
	
	
	public String getMaSP() {
		return MaSP;
	}


	public String getTenSP() {
		return TenSP;
	}


	public int getDonGia() {
		return DonGia;
	}
	

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}


	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}


	public void setDonGia(int donGia) {
		DonGia = donGia;
	}


	public SanPham(String msp, String tsp, int dgia) {
		this.MaSP = msp;
		this.TenSP = tsp;
		this.DonGia = dgia;
	}
	
	@Override
	public String toString() {
		return MaSP + "---" + TenSP + "---" + DonGia;
	}
	
	
	
	
	
}

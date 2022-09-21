package bai08Arr.copy;

public abstract class HangHoa {
	// Cac thuoc tuh
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;

	// Cac phuong thuc
	public String getMaHang() {
		return maHang;
	}

	/**
	 * Ma hang khong duocsua,khong duoc de trong
	 * 
	 * @param maHang
	 * @throws Exception
	 */
	private void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("LOI: Ma hang rong");
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (!tenHang.equals(""))
			this.tenHang = tenHang;
		else
			this.maHang = "xxx";
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		if (soLuongTon >= 0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon = 0;
	}

	public HangHoa() throws Exception {
		this("", "xxx", 0, 0);
	}

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	public abstract double getVAT();
	public abstract String getDanhGiaMucDoBanBuon();
	//public String getDanhGiaMucDoBanBuon() {
	//	return "khongdanh gia";
	//}
	public static String getTieuDe() {
		return String.format("%-10s %-15s %-15s %-15s %-15s %-15s %-20s %-10s %s","Ma_hang","Ten_Hang","Don_Gia","So_Luong_Ton","NhaSX/TimeBH","NgaySX/CongSuat","MucDoBan","VAT","Ngay HH");
	}
	@Override
	public String toString() {
		return String.format("%-10s %-15s %-15.2f %-15d", maHang,tenHang,donGia,soLuongTon);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHang == null) ? 0 : maHang.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		if (maHang == null) {
			if (other.maHang != null)
				return false;
		} else if (!maHang.equals(other.maHang))
			return false;
		return true;
	}

	
	
	
	
	
	
}

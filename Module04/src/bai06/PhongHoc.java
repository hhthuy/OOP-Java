package bai06;

public abstract class PhongHoc {
	//Cac thuoc tinh 
	private String maPhong;
	private String dayNha;
	private int dienTich;
	private int soBongDen;
	//Cac phuong thuc
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		if (!maPhong.trim().equals(""))
			this.maPhong = maPhong;
		else
			this.maPhong ="chua xac dinh";
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		if (!dayNha.trim().equals(""))
			this.dayNha = dayNha;
		else
			this.dayNha = "chua xac dinh";
	}
	public int getDienTich() {
		return dienTich;
	}
	public void setDienTich(int dienTich) {
		if(dienTich > 0)
			this.dienTich = dienTich;
		else
			this.dienTich = 0;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		if(soBongDen > 0)
			this.soBongDen = soBongDen;
		else
			this.soBongDen = 0;
	}
	
	public PhongHoc(String maPhong, String dayNha, int dienTich, int soBongDen) {
		super();
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}
	public PhongHoc() {
		this("","",0,0);
	}
	public abstract boolean phongDatChuan();
	@Override
	public String toString() {
		String phongHocChuan = (phongDatChuan())? "Dat chuan": "Khong dat chuan";
		return String.format("%-10s %-10s %10d %5d %-20s",maPhong,dayNha,dienTich,soBongDen,phongHocChuan);
	}
	public boolean duAnhSang() {
		return (dienTich/soBongDen) <= 10;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
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
		PhongHoc other = (PhongHoc) obj;
		if (maPhong == null) {
			if (other.maPhong != null)
				return false;
		} else if (!maPhong.equals(other.maPhong))
			return false;
		return true;
	}

	
}

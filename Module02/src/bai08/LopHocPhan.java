package bai08;

/**
 * Bieu dien Lop hoc phan
 * 
 * @author HongThuy
 *
 */
public class LopHocPhan {
	// Cac thuoc tinh
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHocPhan;
	private SinhVien[] dsSV;

	// Cac phuong thuc
	/**
	 * @return the maLHP
	 */
	public String getMaLHP() {
		return maLHP;
	}

	/**
	 * @param maLHP the maLHP to set
	 */
	public void setMaLHP(String maLHP) {
		if (!maLHP.trim().equals(""))
			this.maLHP = maLHP;
		else
			this.maLHP = "chua biet ma lop hoc phan";
	}

	/**
	 * @return the tenLHP
	 */
	public String getTenLHP() {
		return tenLHP;
	}

	/**
	 * @param tenLHP the tenLHP to set
	 */
	public void setTenLHP(String tenLHP) {
		if (!tenLHP.trim().equals(""))
			this.tenLHP = maLHP;
		else
			this.tenLHP = "chua biet Ten lop hoc phan";
	}

	/**
	 * @return the tenGV
	 */
	public String getTenGV() {
		return tenGV;
	}

	/**
	 * @param tenGV the tenGV to set
	 */
	public void setTenGV(String tenGV) {
		if (!tenGV.trim().equals(""))
			this.tenGV = tenGV;
		else
			this.tenGV = "chua biet ten giang vien";
	}

	/**
	 * @return the thongTinLopHocPhan
	 */
	public String getThongTinLopHocPhan() {
		return thongTinLopHocPhan;
	}

	/**
	 * @param thongTinLopHocPhan the thongTinLopHocPhan to set
	 */
	public void setThongTinLopHocPhan(String thongTinLopHocPhan) {
		if (!tenGV.trim().equals(""))
			this.thongTinLopHocPhan = thongTinLopHocPhan;
		else
			this.thongTinLopHocPhan ="Chua biet thong tin ve lop hoc phan";
	}

	/**
	 * @return the dsSV
	 */
	public SinhVien[] getDsSV() {
		return dsSV;
	}

	/**
	 * @param dsSV the dsSV to set
	 */
	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}

	/**
	 * Constructor mac dinh
	 */
	public LopHocPhan() {

	}

	/**
	 * Constructors day du cac tham so
	 * 
	 * @param maLHP
	 * @param tenLHP
	 * @param tenGV
	 * @param thongTinLopHocPhan
	 * @param dsSV
	 */
	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHocPhan, SinhVien[] dsSV) {
		setMaLHP(maLHP);
		setTenLHP(tenLHP);
		setTenGV(tenGV);
		setThongTinLopHocPhan(thongTinLopHocPhan);
		setDsSV(dsSV);
	}

	/**
	 * Tinh so luong sinh vien
	 * 
	 * @return so luong sinh vien
	 */
	public int getSoLuongSV() {
		return dsSV.length;
	}

	/**
	 * Ham tra ve kieu chuoi cho lop hoc phan
	 */
	public String toString() {
		String s = "";
		s += "-Ma LHP: " + maLHP + "\n-Ten LHP: " + tenLHP + "\n-GV giang day: " + tenGV + "\n-Thong tin buoi hoc: "
				+ thongTinLopHocPhan + "\nDanh sach sinh vien \n";
		for (SinhVien temp : dsSV) {
			s += temp + "";
		}
		return s + "Tong so sinh vien: " + getSoLuongSV();
	}
}

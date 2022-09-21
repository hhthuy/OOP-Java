package bai10;

public class CD {
	// Cac thuoc tinh
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;

	// Cac phuong thuc
	/**
	 * @return the maCD
	 */
	public int getMaCD() {
		return maCD;
	}

	/**
	 * @param maCD the maCD to set
	 */
	public void setMaCD(int maCD) {
		if (maCD > 0) 
			this.maCD = maCD;
		else 
			this.maCD = 999999;
	}

	/**
	 * @return the tuaCD
	 */
	public String getTuaCD() {
		return tuaCD;
	}

	/**
	 * @param tuaCD the tuaCD to set
	 */
	public void setTuaCD(String tuaCD) {
		if (tuaCD.equals("")) {
			this.tuaCD = "chua xac dinh";
		} else {
			this.tuaCD = tuaCD;
		}
	}

	/**
	 * @return the soBaiHat
	 */
	public int getSoBaiHat() {
		return soBaiHat;
	}

	/**
	 * @param soBaiHat the soBaiHat to set
	 */
	public void setSoBaiHat(int soBaiHat) {
		if (soBaiHat > 0) 
			this.soBaiHat = soBaiHat;
		else
			this.soBaiHat = 0;
	}

	/**
	 * @return the giaThanh
	 */
	public double getGiaThanh() {
		return giaThanh;
	}

	/**
	 * @param giaThanh the giaThanh to set
	 */
	public void setGiaThanh(double giaThanh) {
		if (giaThanh > 0) {
			this.giaThanh = giaThanh;
		} else {
			this.giaThanh = 0;
		}

	}
	/**
	 * Constructors mac dinh
	 */
	public CD() {
		this(0,"",0,0);
	}

	/**
	 * Constructors day du cac tham so
	 * @param maCD
	 * @param tuaCD
	 * @param soBaiHat
	 * @param giaThanh
	 */
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}
	public static String tieuDe() {
		return String.format("|%5d|%-10s|%6d|%10.2f|\n", "Ma_CD", "Tua_CD", "So_Bai", "Gia");
	}
	/**
	 * Ham tra ve thong tin cua CD
	 */
	public String toString() {
		return String.format("|%5d|%-10s|%6d|%10.2f|\n", maCD, tuaCD, soBaiHat, giaThanh);
	}

}

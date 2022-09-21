package bai11;

public class CongNhan {
	// Cac thuoc tinh
	private String mHo;
	private String mTen;
	private int mSoSP;

	// Cac phuong thuc
	/**
	 * @return the mHo
	 */
	public String getmHo() {
		return mHo;
	}

	/**
	 * @param mHo the mHo to set
	 */
	public void setmHo(String mHo) {
		if (!mHo.trim().equals(""))
			this.mHo = mHo;
		else 
			this.mHo = "chua biet ho";
	}

	/**
	 * @return the mTen
	 */
	public String getmTen() {
		return mTen;
	}

	/**
	 * @param mTen the mTen to set
	 */
	public void setmTen(String mTen) {
		if (!mTen.trim().equals(""))
			this.mTen = mTen;
		else 
			this.mTen = "chua biet ten";
	}

	/**
	 * @return the mSoSP
	 */
	public int getmSoSP() {
		return mSoSP;
	}

	/**
	 * @param mSoSP the mSoSP to set
	 */
	public void setmSoSP(int mSoSP) {
		if (mSoSP<0)
			System.out.println("loi");
		this.mSoSP = mSoSP;
	}

	/**
	 * Constructor mac dinh
	 */
	public CongNhan() {

	}

	/**
	 * Constructor day du tham so
	 * @param mHo
	 * @param mTen
	 * @param mSoSP
	 */
	public CongNhan(String mHo, String mTen, int mSoSP) {
		setmHo(mHo);
		setmTen(mTen);
		setmSoSP(mSoSP);
	}

	/**
	 * Ham tinh tien luong cua cong nhan
	 */
	public double tinhLuong() {
		double luong = 0;
		if (mSoSP < 200) {
			luong = mSoSP * 0.5;
			if (mSoSP < 400) {
				luong = mSoSP * 0.55;
				if (mSoSP < 600) {
					luong = mSoSP * 0.6;
				}
			}
		} else
			luong = mSoSP * 0.65;
		return luong;
	}
	
	public static String tieude() {
		return String.format("|%-7s | %-7s | %5s|", "Ho","Ten","So SP");
	}
	/**
	 * Ham tra ve thong tin cua Cong Nhsn
	 */
	public String toString() {
		return String.format("|%-7s | %-7s | %5d|", mHo, mTen, mSoSP);
	}
}

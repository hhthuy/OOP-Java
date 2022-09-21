package onThiCKOOP;

public class PhongLyThuyet extends Room {
	private boolean coMayChieu;

	/**
	 * @return the coMayChieu
	 */
	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	/**
	 * @param coMayChieu the coMayChieu to set
	 */
	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setCoMayChieu(coMayChieu);
	}

	public PhongLyThuyet() {
		this("","",0,0,true);
	}

	@Override
	public String toString() {
		String MayChieu =(coMayChieu)?"Co may chieu":"Khong co may chieu";
		return String.format("%s %20s",super.toString(),MayChieu);
	}
	@Override 
	public boolean coDatChuan(){
		return coDuAnhSang() && coMayChieu;
	}
	
}

package onThiCKOOP;

public class PhongMayTinh extends Room {
	private int soMayTinh;

	/**
	 * @return the soMayTinh
	 */
	public int getSoMayTinh() {
		return soMayTinh;
	}

	/**
	 * @param soMayTinh the soMayTinh to set
	 */
	public void setSoMayTinh(int soMayTinh) {
		if(soMayTinh >= 0)
			this.soMayTinh = soMayTinh;
		else
			this.soMayTinh = 0;
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setSoMayTinh(soMayTinh);
	}

	public PhongMayTinh() {
		this("","",0,0,0);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %10s",super.toString(),soMayTinh);
	}
	@Override
	public boolean coDatChuan() {
		// TODO Auto-generated method stub
		return coDuAnhSang() && ((getDienTich()/getSoBongDen()) >= 1.5);
	}
	
	
	
}

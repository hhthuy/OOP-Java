package bai06;

public class PhongMayTinh extends PhongHoc{
	private int  soMayTinh;

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	public PhongMayTinh() {
		super();
	}

	public PhongMayTinh(String maPhong, String dayNha, int dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setSoMayTinh(soMayTinh);
	}
	@Override
	public boolean phongDatChuan() {
		// TODO Auto-generated method stub
		return (getDienTich()/getSoBongDen()>=1.5 && duAnhSang());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %10s",super.toString(),soMayTinh);
	}
	
	
}

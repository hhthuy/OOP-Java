package bai06;

public class PhongLyThuyet extends PhongHoc {
	private boolean coMayChieu;

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	
	public PhongLyThuyet(String maPhong, String dayNha, int dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setCoMayChieu(coMayChieu);
	}

	public PhongLyThuyet(){
		super();
	}

	@Override
	public String toString() {
		String mayChieu =(coMayChieu)?"Co may chieu":"Khong co may chieu";
		return String.format("%s %20s",super.toString(),mayChieu);
	}
	@Override
	public boolean phongDatChuan() {
		// TODO Auto-generated method stub
		return duAnhSang() && coMayChieu;
	}
	
	
	
	
}

package bai06;

public class PhongThiNghiem extends PhongHoc {
	//Cacthuoc tinh
	private String chuyenNganh;
	private float sucChua;
	private boolean coBonRua;
	//Cac phuong thuc
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public float getSucChua() {
		return sucChua;
	}
	public void setSucChua(float sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	public PhongThiNghiem() {
		super();
	}
	
	public PhongThiNghiem(String maPhong, String dayNha, int dienTich, int soBongDen, String chuyenNganh,
			float sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setChuyenNganh(chuyenNganh);
		setSucChua(sucChua);
		setCoBonRua(coBonRua);
	}
	@Override
	public String toString() {
		String bonRua =(coBonRua)?"Co bon rua":"Khongco bon rua";
		return String.format("%s %20s", super.toString(),bonRua);
	}
	public boolean phongDatChuan() {
		// TODO Auto-generated method stub
		return coBonRua && duAnhSang();
	}
	
	

}

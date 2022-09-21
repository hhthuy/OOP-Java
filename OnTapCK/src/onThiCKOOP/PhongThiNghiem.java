package onThiCKOOP;

public class PhongThiNghiem extends Room {
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;

	
	/**
	 * @return the chuyenNganh
	 */
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	/**
	 * @param chuyenNganh the chuyenNganh to set
	 */
	public void setChuyenNganh(String chuyenNganh) {
		if(!chuyenNganh.trim().equals(""))
			this.chuyenNganh = chuyenNganh;
		else
			this.chuyenNganh="chua xac dinh";
	}

	/**
	 * @return the sucChua
	 */
	public int getSucChua() {
		return sucChua;
	}

	/**
	 * @param sucChua the sucChua to set
	 */
	public void setSucChua(int sucChua) {
		if(sucChua >= 0)
			this.sucChua = sucChua;
		else
			this.sucChua=0;
	}

	/**
	 * @return the coBonRua
	 */
	public boolean isCoBonRua() {
		return coBonRua;
	}

	/**
	 * @param coBonRua the coBonRua to set
	 */
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	public PhongThiNghiem() {
		this("", "", 0, 0, "", 0, true);
	}

	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setChuyenNganh(chuyenNganh);
		setSucChua(sucChua);
		setCoBonRua(coBonRua);
	}
	public String toString() {
		String bonRua =(coBonRua)?"Co bon rua":"Khongco bon rua";
		return String.format("%s %20s %15s %15s", super.toString(),bonRua, chuyenNganh,sucChua);
	}
	@Override
	public boolean coDatChuan() {
		// TODO Auto-generated method stub
		return coDuAnhSang() && coBonRua;
	}
}

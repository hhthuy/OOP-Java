package onTap;

/**
 * Viết lớp CD: 
 * - Các thuộc tính khai báo private; định nghĩa các phương thức
 * get/set cho từng thuộc tính và kiểm tra tính hợp lệ của dữ liệu. 
 * - Viết các constructor để khởi tạo đối tượng CD 
 * - Viết phương thức toString trả về thông tin của một CD.
 * 
 * @author Hong Thuy
 *
 */
public class Album {
	//Cac thuoc tinh
	private int maAB;
	private String tuaAB;
	private int soBH;
	private double giaThanh;
	//Cac phuong thuc
	/**
	 * @return the maCD
	 */
	public int getMaAB() {
		return maAB;
	}
	/**
	 * @param maCD để thiết lập mã CD
	 */
	public void setMaAB(int maAB) {
		if(maAB > 0)
			this.maAB = maAB;
		else
			this.maAB=999999;
	}
	/**
	 * @return tuaCD
	 */
	public String getTuaAB() {
		return tuaAB;
	}
	/**
	 * @param tuaCD the tuaCD to set
	 */
	public void setTuaAB(String tuaAB) {
		if(tuaAB.equals(""))
			this.tuaAB= "chua xac dinh";
		else
			this.tuaAB = tuaAB;
	}
	/**
	 * @return the soBH
	 */
	public int getSoBH() {
		return soBH;
	}
	/**
	 * @param soBH the soBH to set
	 */
	public void setSoBH(int soBH) {
		if(soBH > 0)
			this.soBH = soBH;
		else
			this.soBH=0;
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
		if(giaThanh  > 0)
			this.giaThanh = giaThanh;
		else
			this.giaThanh = 0;
	}
	/**
	 * 
	 */
	public Album() {
		this(999999,"chua xac dinh",0,0);
	}
	/**
	 * @param maCD
	 * @param tuaCD
	 * @param soBH
	 * @param giaThanh
	 */
	public Album(int maAB, String tuaAB, int soBH, double giaThanh) {
		setMaAB(maAB);
		setTuaAB(tuaAB);
		setSoBH(soBH);
		setGiaThanh(giaThanh);
	}
	@Override
	public String toString() {
		return "Ablum [Ma_Album=" + maAB + ", Tua_Album=" + tuaAB + ", So_BH=" + soBH + ", Gia_Thanh=" + giaThanh + "]";
	}
	
	
	
	
	
}

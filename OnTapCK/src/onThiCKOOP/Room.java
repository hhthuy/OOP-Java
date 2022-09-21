package onThiCKOOP;

public abstract class Room {
	private String maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;

	/**
	 * @return the maPhong
	 */
	public String getMaPhong() {
		return maPhong;
	}

	/**
	 * @param maPhong the maPhong to set
	 */
	public void setMaPhong(String maPhong) {
		if (!maPhong.trim().equals(""))
			this.maPhong = maPhong;
		else
			this.maPhong = "chau xac dinh";
	}

	/**
	 * @return the dayNha
	 */
	public String getDayNha() {
		return dayNha;
	}

	/**
	 * @param dayNha the dayNha to set
	 */
	public void setDayNha(String dayNha) {
		if (!dayNha.trim().equals(""))
			this.dayNha = dayNha;
		else
			this.dayNha = "chau xac dinh";
	}

	/**
	 * @return the dienTich
	 */
	public double getDienTich() {
		return dienTich;
	}

	/**
	 * @param dienTich the dienTich to set
	 */
	public void setDienTich(double dienTich) {
		if (dienTich >= 0)
			this.dienTich = dienTich;
		else
			this.dienTich = 0;
	}

	/**
	 * @return the soBongDen
	 */
	public int getSoBongDen() {
		return soBongDen;
	}

	/**
	 * @param soBongDen the soBongDen to set
	 */
	public void setSoBongDen(int soBongDen) {
		if (soBongDen >= 0)
			this.soBongDen = soBongDen;
		else
			this.soBongDen = 0;
	}

	public Room(String maPhong, String dayNha, double dienTich, int soBongDen) {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}

	public Room() {
		this("", "", 0, 0);
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %10f %10d", maPhong, dayNha, dienTich, soBongDen);
	}

	public abstract boolean coDatChuan();

	public boolean coDuAnhSang() {
		return (dienTich / soBongDen) <= 10;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (maPhong == null) {
			if (other.maPhong != null)
				return false;
		} else if (!maPhong.equals(other.maPhong))
			return false;
		return true;
	}

}

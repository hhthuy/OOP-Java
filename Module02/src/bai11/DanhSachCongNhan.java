package bai11;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachCongNhan {
	private int count;
	private CongNhan[] ds;
	//private CongNhan temp;
	
	public DanhSachCongNhan(int n) {
		ds = new CongNhan[n];
		count = 0;
	}
	public boolean themCongNhan(CongNhan cn) {
		if (ds.length==count)
			return false;
		ds[count]= cn;
		count++;
		return true;
	}
	public int getsoLuongCongNhan () {
		return count;
	}
	public String toString() {
		String s ="";
		for(int i = 0; i < count; i++) {
			s+=ds[i] +"\n";
		}return s;
	}
	/**
	public void XuatDS () {
		System.out.printf("|%-7s | %-7s | %5s|\n","Ho","Ten","SoSP");
		System.out.println("---------------------------");
		for (int i =0 ; i<count ; i++) {
			System.out.println(ds[i]);
		}
	}**/
	
	public void SapXepSanPham () {
		Arrays.sort(ds,0,count,new Comparator <CongNhan>() {
			public int compare (CongNhan o1, CongNhan o2) {
				return Double.compare(o2.getmSoSP(),o1.getmSoSP());
			}
		});
	}
	public String laySoLuongCNLamTren200sp() {
		String s="";
		for (int i = 0 ; i< getsoLuongCongNhan() ; i++) {
			if (ds[i].getmSoSP()>=200) {
				s+= ds[i]+"\n";
			}
		}
		if(!s.equals(""))
			return s;
		return "Khong co cong nhan nao lam tren 200 san pham";
	}
	/**public void layCongNhanTren200SanPham () {
		for (int i =0 ; i<count ; i++)
			if (ds[i].getmSoSP()>=200){
				System.out.println(ds[i]);
			}
	}**/
}

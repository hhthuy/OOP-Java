package bai11;

public class Test {
	public static void main(String[] args) {
		DanhSachCongNhan ds = new DanhSachCongNhan (10);
		ds.themCongNhan(new CongNhan("Ho","Thuy", 100));
		ds.themCongNhan(new CongNhan("Nguyen","Hong", 300));
		ds.themCongNhan(new CongNhan("Tran","Bao", 250));
		ds.themCongNhan(new CongNhan("Vo","Thanh", 440));
		ds.themCongNhan(new CongNhan("Le","Tuan", 1000));
		System.out.println("--------------------------");
		System.out.println(CongNhan.tieude());
		System.out.println("--------------------------");
		System.out.println(ds.toString()); //ds.XuatDS();
		System.out.println("--------------------------");
		
		System.out.println("SO LUONG CONG NHAN : "+ ds.getsoLuongCongNhan());
		
		ds.SapXepSanPham();
		System.out.println("SAP XEP SAN PHAM GIAM DAN ");
		System.out.println(ds.toString());
		
		System.out.println("CAC CONG NHAN LAM TREN 200 SAN PHAM ");
		System.out.println(ds.laySoLuongCNLamTren200sp());
	}
}

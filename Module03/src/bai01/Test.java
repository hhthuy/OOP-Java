package bai01;

public class Test {
	public static void main(String[] agrs) {
		DanhMucChuyenXe dm = new DanhMucChuyenXe(100);
		dm.themChuyenXe(new ChuyenXeNgoaiThanh("001", "Nguyen Van A", "68N-1245",15000f,"Kien Giang", 10));
		dm.themChuyenXe(new ChuyenXeNoiThanh("002", "TRan Van C", "59F-9876", 20000f, "A01", 35));
		dm.themChuyenXe(new ChuyenXeNgoaiThanh("003", "Ho Thi B", "60G-1245",30000f,"TP.HCM", 20));
		dm.themChuyenXe(new ChuyenXeNoiThanh("004", "Le Thi D", "50H-9876", 45000f, "A02", 50));
		System.out.println("__________CHUYEN XE NGOAI THANH__________");
		System.out.println(ChuyenXeNgoaiThanh.tieude());
		System.out.println(dm.getChuyenXeNgoaiThanh());
		System.out.println("__________CHUYEN XE NOI THANH__________");
		System.out.println(ChuyenXeNoiThanh.tieude());
		System.out.println(dm.getChuyenXeNoiThanh());
		
		System.out.println("-----DOANH THU------");
		dm.getTongDoanhThu();
		dm.getTongDoanhThuNoiThanh();
		dm.getTongDoanhThuNgoaiThanh();
		
		
		
	}
}
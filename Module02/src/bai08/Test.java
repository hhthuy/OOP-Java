package bai08;

public class Test {
	public static void main(String[] args) {
		SinhVien[] sv = new SinhVien[3];
		sv[0] = new SinhVien("123", "Nguyen Van A");
		sv[1] = new SinhVien("543", "Le Thi B");
		sv[2] = new SinhVien("321", "Luong Van C");
		LopHocPhan lhp = new LopHocPhan("123456", "LT Huong doi tuong", "Co Ha", "Thu 7, tiet 4-6, phong A1.1",
				sv);
		System.out.println(lhp);
	}
}

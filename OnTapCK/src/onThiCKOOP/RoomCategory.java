package onThiCKOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TODO use English
public class RoomCategory {
	private List<Room> rooms;

	public RoomCategory() {
		rooms = new ArrayList<Room>();
	}

	public String toString() {
		String output = "";
		for (Room room : rooms) {
			output += room.getMaPhong() + "\n";
		}
		return output;
	}

//1.Them mot phong vao danh sach ( them duoc neu khong trung ma)
	public boolean addRoom(Room room) {
		if (rooms.contains(room)) {
			return false;
		}

		rooms.add(room);
		return true;
	}

//2.Tim kiem mot phong hoc nao do khi biet ma.
	public Room findRoomByRoomNumber(String roomNumber) {
		for (Room room : rooms) {
			if (room.getMaPhong().equalsIgnoreCase(roomNumber)) {
				return room;
			}
		}
		return null;
	}

//3.Tim kiem hang hoa khi biet ma. Neu tim thay tra ve vi tri tim thay. Nguoc lai tra ve - 1.
	public int findRoomIndexByRoomNumber(String roomNumber) {
		for (int roomIndex = 0; roomIndex < rooms.size(); roomIndex++) {
			if (rooms.get(roomIndex).getMaPhong().equalsIgnoreCase(roomNumber)) {
				return roomIndex;
			}
		}
		int notFoundRoomIndex = -1;
		return notFoundRoomIndex;
	}


	/**
	 * Sap xep danh sach tang dan theo day nha
	 */
	public void orderByRoomLine() {
		Collections.sort(rooms, new Comparator<Room>() {

			@Override
			public int compare(Room o1, Room o2) {
				// TODO Auto-generated method stub
				return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
			}
		});
	}

//5.Sap xep danh sach tang dan theo dien tich
	public void orderByRoomArea() {
		Collections.sort(rooms, new Comparator<Room>() {

			@Override
			public int compare(Room o1, Room o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getDienTich(), o2.getDienTich());
			}
		});
	}

//	6.Cap nhat so bomg den khi biet ma phong.
	public boolean capNhatSoBongDenTheoMa(String maCanSua, int soBongDenMoi) {
		for (Room room : rooms) {
			if (room.getMaPhong().equalsIgnoreCase(maCanSua)) {
				room.setSoBongDen(soBongDenMoi);
				return true;
			}
		}
		return false;
	}

//	7.Xoa mot phong nao do khi biet ma phong ( xac minh rang co chan chan xoa khong).
	public boolean deleteRoomByRoomNumber(String roomNumber) {
		if (findRoomByRoomNumber(roomNumber) != null) {
			return rooms.removeIf(p -> p.getMaPhong().equalsIgnoreCase(roomNumber));
		}	
		return false;
	}

//	9.Lay tung loai thong tin hang hoa
	public String getPhongLyThuyet() {
		String s = "";
		for (Room room : rooms) {
			if (room instanceof PhongLyThuyet)
				return s += room + "\n";
		}
		return s;
	}

	public String getPhongMayTinh() {
		String s = "";
		for (Room room : rooms) {
			if (room instanceof PhongMayTinh)
				return s += room + "\n";
		}
		return s;
	}

	public String getPhongThiNghiem() {
		String s = "";
		for (Room room : rooms) {
			if (room instanceof PhongThiNghiem)
				return s += room + "\n";
		}
		return s;
	}

//	10.Lay danh sach phong hoc co  60 may.
	public void getPhongMayTinhCo60May() {
		for (Room room : rooms) {
			if (room instanceof PhongMayTinh) {
				if (((PhongMayTinh) room).getSoMayTinh() >= 60) {
					System.out.println(room);
				}
			}
		}
	}

//	11.Tinh tong suc chua cua phong thi nghiem
	public int getTongPhongHoc() {
		int sum = 0;
		for (Room room : rooms) {
			if (room instanceof PhongThiNghiem)
				return sum += ((PhongThiNghiem) room).getSucChua();
		}
		return sum;
	}

//	12.Tim so bong den co so long lon nhat
	public int getPhongCoBongDenMax() {
		int max = rooms.get(0).getSoBongDen();
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getSoBongDen() > max) {
				max = rooms.get(i).getSoBongDen();
			}
		}
		return max;
	}

//	13.Tinh TBC so bong den cua phong may tinh
	public int getTBCSoMayTinh() {
		int sum = 0;
		int dem = 0;
		for (int i = 0; i < rooms.size(); i++) {
			sum += rooms.get(i).getSoBongDen();
			dem++;
		}
		return (sum / dem);
	}

//	14.Dem so luong bong den trong phong 
	public int getDemSoBongDen() {
		int dem = 0;
		for (int i = 0; i < rooms.size(); i++) {
			dem += rooms.get(i).getSoBongDen();
		}
		return dem;
	}

}

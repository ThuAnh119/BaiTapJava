package BaiTap1010;

import java.util.Scanner;

public class ChuyenDoiTienTe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double tiGia = 23500;

		while (true){
		System.out.println("Chương trình chuyển đổi tiền tệ");
		System.out.println("Chuyển từ VND sang USD nhập số 1");
		System.out.println("Chuyển từ USD sang VND nhập số 2");
		System.out.println("Thoát chương trình nhập số 3");
		System.out.print("Nhập lựa chọn của bạn (1, 2 hoặc 3): ");

		int luaChon = scanner.nextInt();

		if (luaChon == 1) {
			System.out.print("Nhập số tiền VND cần chuyển đổi: ");
			double soTienVnd = scanner.nextDouble();
			double ketQuaUsd = soTienVnd / tiGia;
			System.out.println(soTienVnd + " VND = " + ketQuaUsd + " USD");
		} else if (luaChon == 2) {
			System.out.print("Nhập số tiền USD cần chuyển đổi: ");
			double soTienUsd = scanner.nextDouble();
			double ketQuaVnd = soTienUsd * tiGia;
			System.out.println(soTienUsd + " USD = " + ketQuaVnd + " VND");
		} else if (luaChon == 3) {
			System.out.println("Chương trình kết thúc. Cám ơn bạn đã sử dụng chương trình!");
			break;
		} else {
			System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
			
		}
	}
	}
}

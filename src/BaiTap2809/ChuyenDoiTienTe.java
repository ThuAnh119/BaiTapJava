package BaiTap2809;

import java.util.Scanner;

public class ChuyenDoiTienTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Chương trình chuyển đổi tiền tệ");
		System.out.println("Chuyển từ VND sang USD nhập số 1");
		System.out.println("Chuyển từ USD sang VND nhập số 2");
		System.out.print("Nhập lựa chọn của bạn (1 hoặc 2): ");
		int luaChon = input.nextInt();

		double soTien;
		double ketQua;

		final double TI_GIA = 23500;

		switch (luaChon) {
		case 1:
			System.out.print("Nhập số tiền VND cần chuyển đổi: ");
			soTien = input.nextDouble();
			ketQua = soTien / TI_GIA;
			System.out.println(soTien + " VND = " + ketQua + " USD");
			break;
		case 2:
			System.out.print("Nhập số tiền USD cần chuyển đổi: ");
			soTien = input.nextDouble();
			ketQua = soTien * TI_GIA;
			System.out.println(soTien + " USD = " + ketQua + " VND");
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ!");
			break;
		}
		System.out.println("Chương trình kết thúc");
	}
}

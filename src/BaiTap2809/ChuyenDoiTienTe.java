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


		switch (luaChon) {
		case 1:
			System.out.print("Nhập số tiền VND cần chuyển đổi: ");
			float soTienVnd = input.nextFloat();
			//float ketQuaUsd = soTienVnd / 23.500;
			System.out.println(soTienVnd + " VND = " + (soTienVnd / 23.500) + " USD");
			break;
		case 2:
			System.out.print("Nhập số tiền USD cần chuyển đổi: ");
			float soTienUsd = input.nextFloat();
			//float ketQuaVnd = soTienUsd * 23.500;
			System.out.println(soTienUsd + " USD = " + (soTienUsd * 23.500) + " VND");
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ!");
			break;
		}
		System.out.println("Chương trình kết thúc");
	}
}

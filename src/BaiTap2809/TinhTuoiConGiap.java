package BaiTap2809;

import java.util.Scanner;

public class TinhTuoiConGiap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập năm sinh: ");
		int namSinh = scanner.nextInt();

		int conGiap = (namSinh % 12);
		if (namSinh < 0) {
			conGiap = (namSinh % 12) + 12;
		}
		switch (conGiap) {
		case 0:
			System.out.println("Bạn tuổi con Khỉ");
			break;
		case 1:
			System.out.println("Bạn tuổi con Gà");
			break;
		case 2:
			System.out.println("Bạn tuổi con Chó");
			break;
		case 3:
			System.out.println("Bạn tuổi con Lợn");
			break;
		case 4:
			System.out.println("Bạn tuổi con Chuột");
			break;
		case 5:
			System.out.println("Bạn tuổi con Trâu");
			break;
		case 6:
			System.out.println("Bạn tuổi con Hổ");
			break;
		case 7:
			System.out.println("Bạn tuổi con Mèo");
			break;
		case 8:
			System.out.println("Bạn tuổi con Rồng");
			break;
		case 9:
			System.out.println("Bạn tuổi con Rắn");
			break;
		case 10:
			System.out.println("Bạn tuổi con Ngựa");
			break;
		case 11:
			System.out.println("Bạn tuổi con Dê");
			break;
		default:
			System.out.println("Giá trị không hợp lệ");
			break;
		}
	}
}

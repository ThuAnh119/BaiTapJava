package BaiTap0510;

import java.util.Scanner;

public class NgayTrongThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập năm: ");
		int nam = scanner.nextInt();

		System.out.print("Nhập 3 chữ cái đầu của tên tháng bằng tiếng Anh (viết hoa chữ cái đầu): ");
		String thang = scanner.next();
        //kiểm tra nhập tên tháng
		if (thang.length() != 3 || !Character.isUpperCase(thang.charAt(0))) {
			System.out.println("Tên tháng " + thang + " không hợp lệ");
			return;
		}

		int ngay = 0;

		switch (thang) {
		case "Jan":
			ngay = 31;
			System.out.println("Tháng 1 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Feb":
			if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
				ngay = 29;
				System.out.println("Tháng 2 năm " + nam + " có " + ngay + " ngày");
			} else {
				ngay = 28;
				System.out.println("Tháng 2 năm " + nam + " có " + ngay + " ngày");
			}
			break;

		case "Mar":
			ngay = 31;
			System.out.println("Tháng 3 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Apr":
			ngay = 30;
			System.out.println("Tháng 4 năm " + nam + " có " + ngay + " ngày");
			break;
		case "May":
			ngay = 31;
			System.out.println("Tháng 5 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Jun":
			ngay = 30;
			System.out.println("Tháng 6 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Jul":
			ngay = 31;
			System.out.println("Tháng 7 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Aug":
			ngay = 31;
			System.out.println("Tháng 8 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Sep":
			ngay = 30;
			System.out.println("Tháng 9 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Oct":
			ngay = 31;
			System.out.println("Tháng 10 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Nov":
			ngay = 30;
			System.out.println("Tháng 11 năm " + nam + " có " + ngay + " ngày");
			break;
		case "Dec":
			ngay = 31;
			System.out.println("Tháng 12 năm " + nam + " có " + ngay + " ngày");
			break;
		default:
			System.out.println("Tên tháng " + thang + " không hợp lệ");
		}
	}

}

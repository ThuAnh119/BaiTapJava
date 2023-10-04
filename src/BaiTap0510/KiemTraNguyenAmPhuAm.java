package BaiTap0510;

import java.util.Scanner;

public class KiemTraNguyenAmPhuAm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một chữ cái: ");
		char chuCai = scanner.next().charAt(0);
		
		// dùng toLowerCase() đổi chữ cái sang chữ thường
		chuCai = Character.toLowerCase(chuCai);
		
		// dùng isLetter() kiểm tra xem đầu vào có phải là chữ cái không
		if (!Character.isLetter(chuCai)) {
			System.out.println("Đầu vào không hợp lệ.");

		} else if (chuCai == 'a' || chuCai == 'e' || chuCai == 'i' || chuCai == 'o' || chuCai == 'u') {
			System.out.println(chuCai + " là nguyên âm");
		} else {
			System.out.println(chuCai + " là phụ âm");
		}

	}
}

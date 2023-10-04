package BaiTap0510;

import java.util.Scanner;

public class AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		// dùng charAt(0) của lớp String để lấy ký tự đầu tiên
		char kyTu = scanner.next().charAt(0);

		// đổi ký tự sang mã ASCII bằng cách ép kiểu sang int
		int asciiCode = (int)kyTu;

		System.out.println("The ASCII code for character " + kyTu + " is " + asciiCode);

	}
}

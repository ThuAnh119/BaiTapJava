package BaiTap1010;

import java.util.Scanner;

public class MauSoChungLonNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int a;
		int b;
		int mauSoChungLonNhat = 1; // Biến lưu kết quả USCLN, khởi tạo là 1

		
		System.out.print("Nhập số nguyên dương a: ");
		a = scanner.nextInt();
		System.out.print("Nhập số nguyên dương b: ");
		b = scanner.nextInt();

		// Kiểm tra điều kiện nhập 
		if (a <= 0 || b <= 0) {
			System.out.println("Hai số phải là số nguyên dương!");
			return; 
		}

		// Tìm USCLN theo thuật toán Euclid
		int x = a; 
		int y = b; 
		while (x != y) { 
			if (x > y) { 
				x = x - y; 
			} else { 
				y = y - x; 
			}
		}
		mauSoChungLonNhat = x; 

		// In ra kết quả
		System.out.printf("USCLN của %d và %d là %d\n", a, b, mauSoChungLonNhat);
	}

}

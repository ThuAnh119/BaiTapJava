package BaiTap1710;

import java.util.Scanner;

public class TinhTongMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Nhập số lượng phần tử của mảng
		System.out.print("Nhập số lượng phần tử của mảng: ");
		int n = scanner.nextInt();

		// Khai báo và khởi tạo mảng có n phần tử
		int[] mang = new int[n];
		// Nhập giá trị cho các phần tử của mảng
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
			mang[i] = scanner.nextInt();
		}
		scanner.close();

		// Khởi tạo biến tổng
		int tong = 0;
        // Tính tổng các phần tử của mảng
		for (int i = 0; i < n; i++) {
			tong += mang[i];
		}
		System.out.println("Tổng các phần tử của mảng là: " + tong);
	}
}

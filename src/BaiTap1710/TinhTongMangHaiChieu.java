package BaiTap1710;

import java.util.Scanner;

public class TinhTongMangHaiChieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Nhập số hàng và số cột
		System.out.print("Nhập số hàng: ");
		int hang = scanner.nextInt();
		System.out.print("Nhập số cột: ");
		int cot = scanner.nextInt();

		// Khai báo và khởi tạo số hàng và số cột
		int[][] mang = new int[hang][cot];
		

		// Nhập giá trị cho các phần tử 
		for (int i = 0; i < hang; i++) {
		for (int j = 0; j < cot; j++) {
		System.out.print("Nhập giá trị cho phần tử hàng " + (i + 1) + " cột " + (j + 1) + ": ");
		mang[i][j] = scanner.nextInt();
		}
		}
		scanner.close();

		// Khai báo và khởi tạo biến tổng
		int tong = 0;

		// Tính tổng
		for (int i = 0; i < hang; i++) {
		for (int j = 0; j < cot; j++) {
		tong += mang[i][j];
		}
		}
		System.out.println("Tổng giá trị các phần tử của mảng là: " + tong);
	}

}

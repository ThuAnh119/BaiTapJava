package BaiTap1710;

import java.util.Scanner;

public class GiaTriLonNhatMangMotChieu {

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

		// Giá trị lớn nhất
		int giaTriLonNhat = mang[0];
		for (int i = 1; i < n; i++) {
			if (mang[i] > giaTriLonNhat) {
			giaTriLonNhat = mang[i];
			}
		}
		System.out.println("Giá trị lớn nhất của mảng là: " + giaTriLonNhat);
	}

}

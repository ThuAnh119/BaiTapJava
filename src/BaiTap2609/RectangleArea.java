package BaiTap2609;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		double length = input.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		double width = input.nextDouble();
		double area = length * width;
		System.out.println("Diện tích hình chữ nhật là: " + area);
	}

}

package BaiTap2609;

import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập giá nhập hàng: ");
		double cost = input.nextDouble();
		System.out.print("Nhập thuế suất VAT (%): ");
		double vatRate = input.nextDouble();
		double price = cost * (1 + vatRate / 100);
		System.out.println("Giá tiền phải trả là: " + price);

	}

}

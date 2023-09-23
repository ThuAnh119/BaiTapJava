package BaiTap2609;

import java.util.Scanner;

public class GasolineCosts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập quãng đường (km): ");
		double distance = input.nextDouble();
		System.out.print("Nhập mức tiêu thụ xăng (lít/100km): ");
		double consumption  = input.nextDouble();
		System.out.print("Nhập giá xăng (đồng/lít): ");
		double gasolinePrice = input.nextDouble();
		double gasolineCosts = distance * consumption / 100 * gasolinePrice;
		System.out.println("Số tiền xăng cần trả là " + gasolineCosts + " đồng");
	}

}

package BaiTap2809;

import java.util.Scanner;

public class ChiSoKhoiCoThe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập cân nặng (kg): ");
		double canNang = input.nextDouble();
		System.out.print("Nhập chiều cao (m): ");
		double chieuCao = input.nextDouble();
		
		double bmi = canNang / (chieuCao * chieuCao);
		System.out.println("Chỉ số BMI: " + bmi);
		if (bmi < 18.5){
			System.out.println("Thiếu cân");
		}
		else if (bmi < 25.0){
		System.out.println("Bình thường");
	    }
		else if (bmi < 30.0){
			System.out.println("Thừa cân");
		}
		else {
			System.out.println("Béo phì");
		}
	}
}

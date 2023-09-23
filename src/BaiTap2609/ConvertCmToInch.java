package BaiTap2609;

import java.util.Scanner;

public class ConvertCmToInch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số cm: ");
		double cm = input.nextDouble();
		double inch = cm / 2.54;
		System.out.println(cm + " cm = " + inch + " inch");
	}

}

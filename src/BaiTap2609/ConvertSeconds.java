package BaiTap2609;

import java.util.Scanner;

public class ConvertSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số giây: ");
		int seconds = input.nextInt();
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(hours + " giờ " + minutes + " phút " + remainingSeconds + " giây ");
	}

}

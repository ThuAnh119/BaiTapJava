package BaiTap2809;

import java.util.Scanner;

public class XacDinhNamNhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập năm: ");
		int nam = input.nextInt();
		boolean namNhuan = (nam % 4 == 0);
		namNhuan = namNhuan && (nam % 100 != 0);
		namNhuan = namNhuan || (nam % 400 == 0);
		System.out.println(nam + " là năm nhuận ? " + namNhuan);

	}
}
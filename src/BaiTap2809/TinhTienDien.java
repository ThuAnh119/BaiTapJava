package BaiTap2809;

import java.util.Scanner;

public class TinhTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện tiêu thụ (kWh): ");
		float soDien = scanner.nextFloat();
		
		float tienDien;
		final float VAT = 0.1f;
		final float TIEN_DIEN_BAC_1 = 1.678f;
		final float TIEN_DIEN_BAC_2 = 1.734f;
		final float TIEN_DIEN_BAC_3 = 2.014f;
		final float TIEN_DIEN_BAC_4 = 2.536f;
		final float TIEN_DIEN_BAC_5 = 2.834f;
		final float TIEN_DIEN_BAC_6 = 2.927f;

		if(soDien <= 50){
		    tienDien = (soDien * TIEN_DIEN_BAC_1) * (1 + VAT);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		} else if (51 <= soDien && soDien <= 100) {
		    tienDien = ((50 *TIEN_DIEN_BAC_1) + (soDien - 50) * TIEN_DIEN_BAC_2) * (1 + VAT);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		} else if (101 <= soDien && soDien <= 200) {
		    tienDien = ((50 * TIEN_DIEN_BAC_1) + (50 * TIEN_DIEN_BAC_2) + (soDien - 100) * TIEN_DIEN_BAC_3) * (1 + VAT);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		} else if (201 <= soDien && soDien <= 300) {
		    tienDien = ((50 * TIEN_DIEN_BAC_1) + (50 * TIEN_DIEN_BAC_2) + 100 * TIEN_DIEN_BAC_3 + (soDien - 200) * TIEN_DIEN_BAC_4) * (1 + VAT);
		} else if (301 <= soDien && soDien <= 400) {
		    tienDien = ((50 * TIEN_DIEN_BAC_1) + (50 * TIEN_DIEN_BAC_2) + (100 * TIEN_DIEN_BAC_3) + (100 * TIEN_DIEN_BAC_4) + (soDien - 300) * TIEN_DIEN_BAC_5) * (1 + VAT);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		} else {
		    tienDien = ((50 * TIEN_DIEN_BAC_1) + (50 * TIEN_DIEN_BAC_2) + (100 * TIEN_DIEN_BAC_3) +  (100 * TIEN_DIEN_BAC_4) + (100 * TIEN_DIEN_BAC_5) + (soDien - 400) * TIEN_DIEN_BAC_6) * (1 + VAT);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		}
		}

}


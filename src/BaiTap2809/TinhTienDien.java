package BaiTap2809;

import java.util.Scanner;

public class TinhTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện tiêu thụ (kWh): ");
		float soDien = scanner.nextFloat();
		
		float tienDien;
		float vat = 0.1f;
		float tienDienBac1 = 1.678f;
		float tienDienBac2 = 1.734f;
		float tienDienBac3 = 2.014f;
		float tienDienBac4 = 2.536f;
		float tienDienBac5 = 2.834f;
		float tienDienBac6 = 2.927f;


		if(soDien <= 50){
		    tienDien = soDien * tienDienBac1 + (soDien * tienDienBac1 * vat);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		} else if (51 <= soDien && soDien <= 100) {
		    tienDien = (50 * tienDienBac1) + (soDien - 50) * tienDienBac2 + (((50 * tienDienBac1) + (soDien - 50) * tienDienBac2) * vat) ;
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		} else if (101 <= soDien && soDien <= 200) {
		    tienDien = (50 * tienDienBac1) + (soDien - 50) * tienDienBac2 + (soDien - 100) * tienDienBac3 + (((50 * tienDienBac1) + ((soDien - 50) * tienDienBac2) + ((soDien - 100) * tienDienBac3)) * vat);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		} else if (201 <= soDien && soDien <= 300) {
		    tienDien = (50 * tienDienBac1) + (soDien - 50) * tienDienBac2 + (soDien - 100) * tienDienBac3 + (soDien - 200) * tienDienBac4 + (((50 * tienDienBac1) + ((soDien - 50) * tienDienBac2) + ((soDien - 100) * tienDienBac3) + ((soDien - 200) * tienDienBac4)) * vat);
		} else if (301 <= soDien && soDien <= 400) {
		    tienDien = (50 * tienDienBac1) + (soDien - 50) * tienDienBac2 + (soDien - 100) * tienDienBac3 + (soDien - 200) * tienDienBac4 + (soDien - 300) * tienDienBac5 + (((50 * tienDienBac1) + ((soDien - 50) * tienDienBac2) + ((soDien - 100) * tienDienBac3) + ((soDien - 200) * tienDienBac4) + ((soDien - 300) * tienDienBac5)) * vat);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		} else {
		    tienDien = (50 * tienDienBac1) + (soDien - 50) * tienDienBac2 + (soDien - 100) * tienDienBac3 + (soDien - 200) * tienDienBac4 + (soDien - 300) * tienDienBac5 + (soDien - 400) * tienDienBac6 + (((50 * tienDienBac1) + ((soDien - 50) * tienDienBac2) + ((soDien - 100) * tienDienBac3) + ((soDien - 200) * tienDienBac4) + ((soDien - 300) * tienDienBac5) + ((soDien - 400) * tienDienBac6)) * vat);
		    System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
		}
		}

}


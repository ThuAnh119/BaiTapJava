package BaiTap0510;

import java.util.Scanner;

public class ThongTinVaBangLuong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// nhập tên nhân viên
		System.out.print("Enter employee's name: ");
		String name = scanner.nextLine();

		// nhập số giờ làm việc trong một tuần
		System.out.print("Enter number of hours worked in a week: ");
		double hours = scanner.nextDouble();

		// nhập mức lương hàng giờ
		System.out.print("Enter hourly pay rate: ");
		double payRate = scanner.nextDouble();

		// nhập tỷ lệ khấu trừ thuế liên bang
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = scanner.nextDouble();

		// tỷ lệ khấu trừ thuế của tiểu bang
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = scanner.nextDouble();

		// Tính lương bằng số giờ nhân với lương hàng giờ
		double grossPay = hours * payRate;

		// Tính khấu trừ thuế liên bang bằng lương nhân với tỷ lệ khấu trừ thuế liên
		// bang
		double federalWithholding = grossPay * federalTaxRate;

		// Tính khấu trừ thuế của tiểu bang bằng lương nhân với tỷ lệ khấu trừ thuế của
		// tiểu bang
		double stateWithholding = grossPay * stateTaxRate;

		// Tính tổng khấu trừ bằng tổng của khấu trừ thuế liên bang và khấu trừ thuế của
		// tiểu bang
		double totalDeduction = federalWithholding + stateWithholding;

		// Tính lương net bằng lương trừ đi tổng khấu trừ
		double netPay = grossPay - totalDeduction;

		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions:");
		System.out.println("  Federal Withholding (" + (federalTaxRate * 100) + "%): $" + federalWithholding);
		System.out.println("  State Withholding (" + (stateTaxRate * 100) + "%): $" + stateWithholding);
		System.out.println("  Total Deduction: $" + totalDeduction);
		System.out.println("Net Pay: $" + netPay);
	}
}

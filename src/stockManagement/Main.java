package stockManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *** created common object of service class to run multiple functions ***
		 */
		StockReport obj = new StockReport();

		/*
		 ** Loop to always ask for the options and call that function
		 */
		while (true) {
			System.out.println(" 1: To Add New Stock \n 2: To Display Stock Report \n 3: To Exit");
			System.out.println("Enter your choice: ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				obj.addStocks();
				break;
			case 2:
				obj.stockReport();
				break;
			case 3:
				System.out.println("Thank You");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}

	}

}

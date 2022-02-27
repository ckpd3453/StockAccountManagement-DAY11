package stockManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockReport {
	ArrayList<String> stockName = new ArrayList<String>(); // ArrayList to store
	ArrayList<Integer> numberOfShares = new ArrayList<Integer>(); // ArrayList to store
	ArrayList<Integer> sharePrice = new ArrayList<Integer>(); // ArrayList to store
	Scanner sc = new Scanner(System.in);
	int balance;

	/*
	 * method to Perform Add Stocks
	 */
	public void addStocks() {

		System.out.print("Enter the stock name: ");
		stockName.add(sc.next());

		System.out.print("Enter number of shares : ");
		numberOfShares.add(sc.nextInt());

		System.out.print("Enter price of each share: ");
		sharePrice.add(sc.nextInt());

	}

	/*
	 * method to perform Stock Report
	 */

	public void stockReport() {
		int sum = 0;
		System.out.println("******STOCK REPORT*****");
		for (int i = 0; i < stockName.size(); i++) {
			int total = (numberOfShares.get(i) * sharePrice.get(i));

			System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
					+ "\nTotal value of share= " + total);

		}
	}
}

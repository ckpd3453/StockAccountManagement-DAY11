package stockManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockReport2 {
	ArrayList<String> stockName = new ArrayList<String>(); // ArrayList to store
	ArrayList<Integer> numberOfShares = new ArrayList<Integer>(); // ArrayList to store
	ArrayList<Integer> sharePrice = new ArrayList<Integer>(); // ArrayList to store
	Scanner sc = new Scanner(System.in);
	int balance = 1000;
	
	/*
	 * public void currentBal() { System.out.println("Current balance: " +balance);
	 * }
	 */
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
			balance=balance-total;
			sum=sum+total;
			System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
					+ "\nTotal value of share= " + total);
			System.out.println("Balance Remaining: " +balance);
		}
	}
	
	/*
	 * methods to perform Withdraw 
	 */
	public void debit()
	{
		System.out.println("Enter the amount want to withdraw: ");
		int WD = sc.nextInt();
		if(WD<balance)
		{
			balance=balance-WD;
			System.out.println("****Debit is Successfull****");
			System.out.println("Remaining Balance: "+balance);
		}
		else
		{
			System.out.println("Sorry Debit amount exceeds account balance");
		}
	}
}

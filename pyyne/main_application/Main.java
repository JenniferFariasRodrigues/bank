package main_application;


import com.pyyne.challenge.bank.BankController;

/**
 * Created by Jennifer Rodrigues in November 2022.
 * The Main class provides an entry point for project.
 */
public class Main {
	public static void main(String[] args) {
		BankController bankPrintResults = new BankController();
		System.out.println("========BANK BALANCES========\n");
		bankPrintResults.printBalances();
		System.out.println("\n=======BANK TRANSACTIONS=======\n");
		bankPrintResults.printTransactions();
	}

}

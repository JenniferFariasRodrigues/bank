package com.pyyne.challenge.bank;

import java.util.List;
import java.util.Objects;

import com.domain.Balance;
import com.domain.Transaction;
import com.services.BalanceBankService;
import com.services.TransactionBankService;

/**
 * Controller that pulls information form multiple bank integrations and prints
 * them to the console.
 *
 * Created by Par Renyard on 5/12/21. 
 * Edited by Jennifer Rodrigues in November 2022.
 */
public class BankController {
	private final BalanceBankService bankService;
	private final TransactionBankService transactionService;

	public BankController() {
		this.bankService = new BalanceBankService();
		this.transactionService = new TransactionBankService();
	}

	public void printBalances() {
		List<Balance> listBalances = this.bankService.getBalances(1);
		if (Objects.nonNull(listBalances)) {
			for (Balance bal : listBalances) {
				System.out.println("Currency: " + bal.getCurrency());
				System.out.println("Balance: " + bal.getBalance());
				System.out.println("-------------------------------");

			}
		}
	}

	public void printTransactions() {
		List<Transaction> listTransactions = transactionService.getTransactions(1);
		if (Objects.nonNull(listTransactions)) {
			for (Transaction transaction : listTransactions) {
				System.out.println("Bank type: " + transaction.getType());
				System.out.println("Transaction description: " + transaction.getText());
				System.out.println("Bank amount: " + transaction.getAmount());
				System.out.println("-------------------------------");

			}
		}
	}

}
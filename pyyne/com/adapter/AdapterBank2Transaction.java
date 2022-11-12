package com.adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bank2.integration.Bank2AccountSource;
import com.bank2.integration.Bank2AccountTransaction;
import com.domain.Transaction;

/**
 * Created by Jennifer Rodrigues in November 2022. The development of the
 * project was based on the adapter code pattern. Due to the main idea of using
 * the data through inheritance or interface. I developed the project using the
 * interface pattern due to standardization and clarity throughout the project.
 */
public class AdapterBank2Transaction implements TransactionInterface {

	private final List<Bank2AccountTransaction> transactions;

	public AdapterBank2Transaction(Bank2AccountSource source, long id, Date start, Date end) {
		this.transactions = source.getTransactions(id, start, end);
	}

	public List<Transaction> getTransactions() {
		List<Transaction> transacts = new ArrayList<>();
		for (Bank2AccountTransaction t : transactions) {
			transacts.add(convert(t));
		}
		return transacts;
	}

	private Transaction convert(Bank2AccountTransaction bank2Transaction) {
		Transaction.TYPE type;
		if (bank2Transaction.getType() == Bank2AccountTransaction.TRANSACTION_TYPES.CREDIT) {
			type = Transaction.TYPE.DEBIT;
		} else {
			type = Transaction.TYPE.CREDIT;
		}
		Transaction transaction = new Transaction(bank2Transaction.getAmount(), type, bank2Transaction.getText());
		return transaction;
	}

}
package com.adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bank1.integration.Bank1AccountSource;
import com.bank1.integration.Bank1Transaction;
import com.domain.Transaction;

/**
 * Created by Jennifer Rodrigues in November 2022. The development of the
 * project was based on the adapter code pattern. Due to the main idea of using
 * the data through inheritance or interface. I developed the project using the
 * interface pattern due to standardization and clarity throughout the project.
 */
public class AdapterBank1Transaction implements TransactionInterface {
	private final List<Bank1Transaction> transactions;

	public AdapterBank1Transaction(Bank1AccountSource bankSource, long id, Date start, Date end) {
		this.transactions = bankSource.getTransactions(id, start, end);
	}

	public List<Transaction> getTransactions() {
		List<Transaction> transacts = new ArrayList<>();
		for (Bank1Transaction bT : transactions) {
			transacts.add(convert(bT));
		}
		return transacts;
	}

	private Transaction convert(Bank1Transaction bank1Transaction) {
		Transaction.TYPE type;
		if (bank1Transaction.getType() == 1) {
			type = Transaction.TYPE.DEBIT;
		} else {
			type = Transaction.TYPE.CREDIT;
		}
		Transaction transaction = new Transaction(bank1Transaction.getAmount(), type, bank1Transaction.getText());
		return transaction;
	}

}

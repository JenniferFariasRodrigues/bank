package com.service;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import com.bank1.integration.*;
import com.bank2.integration.Bank2AccountSource;
import com.domain.*;

import com.adapter.AdapterBank1Transaction;
import com.adapter.AdapterBank2Transaction;

/**
 * Created by Jennifer Rodrigues in November 2022.
 * In the TransactionBankService class are the user 
 * requests in the Balance interface and also the 
 * business logic part.
 */
public class TransactionBankService {

	public List<Transaction> getTransactions(long id) {
		Date START_DATE = new Date(1668032587889l);
		Date END_DATE = new Date(1668032587889l);

		ArrayList<Transaction> transactions = new ArrayList<>();
		AdapterBank1Transaction adapter1 = new AdapterBank1Transaction(new Bank1AccountSource(), id, START_DATE,
				END_DATE);
		AdapterBank2Transaction adapter2 = new AdapterBank2Transaction(new Bank2AccountSource(), id, START_DATE,
				END_DATE);

		transactions.addAll(adapter1.getTransactions());
		transactions.addAll(adapter2.getTransactions());
		return transactions;
	}

}

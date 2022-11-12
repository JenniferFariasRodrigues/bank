package com.adapter;

import java.util.List;

import com.domain.Transaction;

/**
 * Created by Jennifer Rodrigues in November 2022. The development of the
 * project was based on the adapter code pattern. Due to the main idea of using
 * the data through inheritance or interface. I developed the project using the
 * interface pattern due to standardization and clarity throughout the project.
 */
public interface TransactionInterface {
	List<Transaction> getTransactions();
}

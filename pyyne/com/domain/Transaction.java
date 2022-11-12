package com.domain;

import com.bank1.integration.Bank1Transaction;
import com.bank2.integration.Bank2AccountTransaction;

/**
 * Created by Jennifer Rodrigues in November 2022.
 * The Transaction  class was used to encapsulate the behavior 
 * of Balance and be used in the necessary assignments.
 */
public class Transaction {
	private double amount;
	private TYPE type;
	private String text;

	public Transaction(double amount, TYPE type, String text) {
		this.amount = amount;
		this.type = type;
		this.text = text;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public enum TYPE {
		DEBIT, CREDIT
	}

	private void setType(int type2) {
		// TODO Auto-generated method stub
	}

	private void setType(String name) {
		// TODO Auto-generated method stub
	}

	public static Transaction getDataBank(Bank1Transaction bank1) {
		Transaction transaction = new Transaction();
		transaction.setAmount(bank1.getAmount());
		transaction.setType(bank1.getType());
		transaction.setText(bank1.getText());
		return transaction;
	}

	public static Transaction getDataBank(Bank2AccountTransaction bank2) {
		Transaction transaction = new Transaction();
		transaction.setAmount(bank2.getAmount());
		transaction.setType(bank2.getType().name());
		transaction.setText(bank2.getText());
		return transaction;
	}

}

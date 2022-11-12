package com.domain;

/**
 * Created by Jennifer Rodrigues in November 2022.
 * The Balance class was used to encapsulate the behavior 
 * of Balance and be used in the necessary assignments.
 */
public class Balance {

	private Double balance;
	private String currency;

	public Balance(Double balance, String currency) {
		super();
		this.balance = balance;
		this.currency = currency;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}

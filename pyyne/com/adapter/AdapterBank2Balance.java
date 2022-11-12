package com.adapter;

import com.bank2.integration.Bank2AccountSource;
import com.domain.Balance;

/**
 * Created by Jennifer Rodrigues in November 2022. The development of the
 * project was based on the adapter code pattern. Due to the main idea of using
 * the data through inheritance or interface. I developed the project using the
 * interface pattern due to standardization and clarity throughout the project.
 */
public class AdapterBank2Balance implements AdapterBalance {

	private String balanceData;
	private double valueData;

	public AdapterBank2Balance(Long id, Bank2AccountSource data) {
		this.balanceData = data.getBalance(id).getCurrency();
		this.valueData = data.getBalance(id).getBalance();
	}

	public Balance getBalance() {
		return new Balance(this.valueData, this.balanceData);
	}

	public String getBalanceData() {
		return balanceData;
	}

	public void setBalanceData(String balanceData) {
		this.balanceData = balanceData;
	}

	public double getValueData() {
		return valueData;
	}

	public void setValueData(double valueData) {
		this.valueData = valueData;
	}

}

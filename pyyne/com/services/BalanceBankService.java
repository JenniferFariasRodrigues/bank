package com.services;

import java.util.ArrayList;
import java.util.List;

import com.adapter.AdapterBank1Balance;
import com.adapter.AdapterBank2Balance;
import com.bank1.integration.Bank1AccountSource;
import com.bank2.integration.Bank2AccountSource;
import com.domain.Balance;

/**
 * Created by Jennifer Rodrigues in November 2022.
 * In the BalanceBankService class are the user requests 
 * in the Balance interface and also the business 
 * logic part.
 */
public class BalanceBankService {

	public List<Balance> getBalances(long id) {
		ArrayList<Balance> balanceReturn = new ArrayList<>();
		AdapterBank1Balance adapterBank1 = new AdapterBank1Balance(id, new Bank1AccountSource());
		AdapterBank2Balance adapterBank2 = new AdapterBank2Balance(id, new Bank2AccountSource());
		balanceReturn.add(adapterBank1.getBalance());
		balanceReturn.add(adapterBank2.getBalance());
		return balanceReturn;
	}

}

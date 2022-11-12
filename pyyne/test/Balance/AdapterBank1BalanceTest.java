package test.Balance;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.adapter.AdapterBank1Balance;
import com.bank1.integration.Bank1AccountSource;

/**
 * Created by Jennifer Rodrigues in November 2022.
 * I used the JUnit framework to develop the unit tests.
 */
public class AdapterBank1BalanceTest {
	private Bank1AccountSource bank1AccountSource;

	@Before
	public void setup() {
		this.bank1AccountSource = new Bank1AccountSource();
	}

	@Test
	public void testAdapterBank1Balance() {
		AdapterBank1Balance testAdapterBank1Balance = new AdapterBank1Balance(1L, this.bank1AccountSource);
		assertEquals(testAdapterBank1Balance.getBalance().getCurrency(),
				this.bank1AccountSource.getAccountCurrency(1L));
	}

	@Test
	public void testGetSetBalanceData() {
		AdapterBank1Balance testAdapterBank1Balance = new AdapterBank1Balance(1L, this.bank1AccountSource);
		String test = "test";
		testAdapterBank1Balance.setBalanceData(test);
		assertEquals(test, testAdapterBank1Balance.getBalanceData());
	}

	@Test
	public void testGetSetValueData() {
		AdapterBank1Balance testAdapterBank1Balance = new AdapterBank1Balance(1L, this.bank1AccountSource);
		double test = 1.2;
		testAdapterBank1Balance.setValueData(test);
		assertEquals(test, testAdapterBank1Balance.getValueData(), 2);
	}

}

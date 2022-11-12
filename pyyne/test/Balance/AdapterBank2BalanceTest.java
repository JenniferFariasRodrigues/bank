package test.Balance;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.adapter.AdapterBank2Balance;
import com.bank2.integration.Bank2AccountSource;

/**
 * Created by Jennifer Rodrigues in November 2022. I used the JUnit framework to
 * develop the unit tests.
 */
public class AdapterBank2BalanceTest {
	private Bank2AccountSource bank2AccountSource;

	@Before
	public void setup() {
		this.bank2AccountSource = new Bank2AccountSource();
	}

	@Test
	public void testAdapterBank2Balance() {
		AdapterBank2Balance testAdapterBank2Balance = new AdapterBank2Balance(1L, this.bank2AccountSource);
		assertEquals(testAdapterBank2Balance.getBalance().getCurrency(), testAdapterBank2Balance.getBalanceData());
	}

	@Test
	public void testGetBalanceData() {
		AdapterBank2Balance testAdapterBank2Balance = new AdapterBank2Balance(1L, this.bank2AccountSource);
		String test = "test";
		testAdapterBank2Balance.setBalanceData(test);
		assertEquals(test, testAdapterBank2Balance.getBalanceData());
	}

	@Test
	public void testValueData() {
		AdapterBank2Balance testAdapterBank2Balance = new AdapterBank2Balance(1L, this.bank2AccountSource);
		double test = 1.2;
		testAdapterBank2Balance.setValueData(test);
		assertEquals(test, testAdapterBank2Balance.getValueData(), 2);
	}

}

package test.Domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.domain.Balance;

/**
 * Created by Jennifer Rodrigues in November 2022. I used the JUnit framework to
 * develop the unit tests.
 */
public class BalanceTest {
	private static final Double ID = 2d;
	private static final String test = "test";
	Balance balance = new Balance(ID, test);

	@Test
	public void testGetSetGetBalance() {
		double test = 1.2;
		balance.setBalance(test);
		assertEquals(test, balance.getBalance(), 2);
	}

	@Test
	public void testGetSetCurrency() {
		balance.setCurrency(test);
		assertEquals(test, balance.getCurrency());

	}

}

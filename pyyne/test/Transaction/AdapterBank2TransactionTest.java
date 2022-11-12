package test.Transaction;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.adapter.AdapterBank2Transaction;
import com.bank2.integration.Bank2AccountSource;

/**
 * Created by Jennifer Rodrigues in November 2022. I used the JUnit framework to
 * develop the unit tests.
 */
public class AdapterBank2TransactionTest {
	private static final long ID = 11;
	private static final Date START = new Date(1649282433689L);
	private static final Date END = new Date(1649285544790L);
	private Bank2AccountSource bank2AccountSource;
	private AdapterBank2Transaction adapterBank2Transaction;

	@Before
	public void setup() {
		this.bank2AccountSource = new Bank2AccountSource();
		this.adapterBank2Transaction = new AdapterBank2Transaction(this.bank2AccountSource, ID, START, END);
	}

	@Test
	public void AdapterBank1Transaction() {
		assertEquals(adapterBank2Transaction.getTransactions().size(),
				this.bank2AccountSource.getTransactions(ID, START, END).size());
	}

}

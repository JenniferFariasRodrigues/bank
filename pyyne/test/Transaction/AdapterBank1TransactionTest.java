package test.Transaction;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.adapter.AdapterBank1Transaction;
import com.bank1.integration.Bank1AccountSource;

/**
 * Created by Jennifer Rodrigues in November 2022. I used the JUnit framework to
 * develop the unit tests.
 */
public class AdapterBank1TransactionTest {
	private static final long ID = 11;
	private static final Date START = new Date(1649282433689L);
	private static final Date END = new Date(1649285544790L);
	private Bank1AccountSource bank1AccountSource;
	private AdapterBank1Transaction adapterBank1Transaction;

	@Before
	public void setup() {
		this.bank1AccountSource = new Bank1AccountSource();
		this.adapterBank1Transaction = new AdapterBank1Transaction(this.bank1AccountSource, ID, START, END);
	}

	@Test
	public void AdapterBank1Transaction() {
		assertEquals(adapterBank1Transaction.getTransactions().size(),
				this.bank1AccountSource.getTransactions(ID, START, END).size());
	}

}

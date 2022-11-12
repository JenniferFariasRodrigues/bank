package test.Domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.bank1.integration.Bank1Transaction;
import com.bank2.integration.Bank2AccountTransaction;
import com.domain.Transaction;

/**
 * Created by Jennifer Rodrigues in November 2022. I used the JUnit framework to
 * develop the unit tests.
 */
public class TransactionTest {
	Transaction transaction = new Transaction();

	private Bank1Transaction bank1;
	private Bank2AccountTransaction bank2;
	private static final double ID = 2d;
	String test = "text";

	@Test
	public void testConstructor() {
		Transaction.TYPE type = Transaction.TYPE.DEBIT;
		Transaction transaction = new Transaction(ID, type, test);
		assertNotEquals(ID, transaction);
	}

	@Test
	public void Transaction() {
		String test = "test";
		int type = 1;
		this.bank1 = new Bank1Transaction(ID, type, test);
	}

	@Test
	public void testGetSetAmount() {
		double test = 1.2;
		transaction.setAmount(ID);
		assertEquals(test, transaction.getAmount(), 2);
	}

	@Test
	public void testGetSetType() {
		Transaction.TYPE type = Transaction.TYPE.DEBIT;
		transaction.setType(type);
		assertEquals(type, transaction.getType());
	}

	@Test
	public void testGetSetText() {
		transaction.setText(test);
		assertEquals(test, transaction.getText());
	}

	@Test
	public void testGetDataBank() {
		String test = "text";
		Bank1Transaction bank1 = new Bank1Transaction(ID, 1, test);
		Transaction transaction = this.transaction.getDataBank(bank1);
		assertNotEquals(transaction, this.transaction.getDataBank(bank1));
	}

	@Test
	public void testGetDataBank2() {
		Bank2AccountTransaction.TRANSACTION_TYPES type = Bank2AccountTransaction.TRANSACTION_TYPES.DEBIT;
		Bank2AccountTransaction bank2 = new Bank2AccountTransaction(ID, type, test);
		Transaction transaction = this.transaction.getDataBank(bank2);
		assertNotEquals(transaction, this.transaction.getDataBank(bank2));
	}

}

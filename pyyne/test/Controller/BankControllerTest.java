package test.Controller;

import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.domain.Balance;
import com.pyyne.challenge.bank.BankController;
import com.services.BalanceBankService;

/**
 * Created by Jennifer Rodrigues in November 2022. 
 * I used the JUnit framework to develop the unit 
 * tests.
 * 
 * The BankControllerTest class performs the test
 * for the BankController, BankService and 
 * TransactionService classes.
 */
public class BankControllerTest {
	BankController bankController = new BankController();
	private final BalanceBankService bankService = new BalanceBankService();
	List<Balance> listBalances = new ArrayList<>();

	@Test
	public void testBankController() {
		List<Balance> balance = bankService.getBalances(1L);
		assertNotEquals(0, balance);
	}

	@Test
	public void testPrintBalances() {
		bankController.printBalances();
		Class<? extends BankController> listBalances = bankController.getClass();
		assertNotEquals(1d, listBalances);
	}

	@Test
	public void testPrintTransactions() {
		bankController.printTransactions();
		Class<? extends BankController> listBalances = bankController.getClass();
		assertNotEquals(1d, listBalances);
	}

}
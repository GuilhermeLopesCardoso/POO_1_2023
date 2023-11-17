package exercicioBanco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit {

	@Test
	void depositoTest() {
		Conta c = new Conta();
		c.setSaldo(100);
		c.deposito(100);
		assertEquals(200, c.getSaldo());
		}
	
	@Test
	void saquepossivelTest() {
		Conta c = new Conta();
		c.setSaldo(100);
		c.saque(50);
		assertEquals(50, c.getSaldo());
	}
	
	@Test
	void saqueimpossivelTest() {
		Conta c = new Conta();
		c.setSaldo(100);
		assertFalse(false(200));
		assertEquals(100, c.getSaldo());
	}

}

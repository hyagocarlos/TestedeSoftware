package banco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testDebitarSucesso() throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.debitar(10);
		assertEquals(10,c.getSaldo(),0.0);
	}
	@Test
	public void testDebitarSucesso1() throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		assertEquals(10,c.debitar(10),0.0);
	}
	@Test(expected=OperacaoIlegalException.class)
	public void testDebitarZero() throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.debitar(0);
	}
	
	@Test(expected=OperacaoIlegalException.class)
	public void testCreditarZero() throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.creditar(0);
	}
	
	@Test(expected=OperacaoIlegalException.class)
	public void testDebitarNegativo () throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.debitar(-10);
	}
	
	@Test(expected=OperacaoIlegalException.class)
	public void testCreditarNegativo () throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.creditar(-10);
	}
	
	@Test
	public void testSaqueUltrapassaLimite() throws OperacaoIlegalException{
		Conta c1 = new Conta("123", 50.00);
		c1.debitar(70.00);
		
	}
	
	@Test
	public void testTransferirSucesso() throws OperacaoIlegalException{
		Conta c = new Conta("123",15); // Conta origem com saldo de 20 reais
		Conta d = new Conta("456",10); // conta destino com saldo de 10 reais
		c.transferir(d, 10); // conta destino transfere para origem 10 reais
		assertEquals(20,d.getSaldo(),0.0); // o novo saldo da conta destino é 20
		assertEquals(5, c.getSaldo(),0.0);// o novo saldo da conta origem
	}
}

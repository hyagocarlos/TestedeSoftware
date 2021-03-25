package param;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoImpostoRendaTest { // classe parametizada 
	@Parameter(0)
	public double entrada;
	
	@Parameter(1)
	public double esperado;
	
//	private double valor; // valor
//	private double imposto; // imposto
	
//	public CalculoImpostoRendaTest(double valor, double imposto) {
//		super();
//		this.valor = valor;
//		this.imposto = imposto;
//	}

	
	
	@Parameters(name = "{index}: valor: {0} , valor total com imposto {1}")
	public static Iterable<Object[]> addedNumbers(){
		return Arrays.asList(new Object[][] {
			{-5.0, 0.0},
			{500.0, 0.0},
			{4000.0, 400.0},
			{9000.0, 1350.0},
		});
//		return new Object[][] {
//			{1201, 1201 *1.1}, // entre valores 1201 a 5000 será cobrado 10%
			//{5001, 5001 *1.15},
			//{10001, 10001 *1.2},
//			};
	}
	
//	@Test
//	public void calculoImposto_valido() { // teste de equivalência entrada válidas
//		double value = valor;			 // para valor >=1201 e valor <=5000
//		double result = value * 1.1;
//		double delta = 0.3;
//		assertEquals(imposto, result, delta);
//	}
	@Test
	public void test() {
		System.out.println("Para o valor R$:  " +esperado);
		System.out.println("valor total com imposto R$:  "+esperado);
		double delta = 0.01;
//		assertEquals(esperado, CalculoImpostoRenda.calculaImposto(entrada), 0.01 );
		
	}
//	@Test
//	public void calculaImpostotest() {
//		double delta = 0.0;
		//assertEquals(imposto, CalculoImpostoRenda.calculaImposto(valor), delta);
//	}


}

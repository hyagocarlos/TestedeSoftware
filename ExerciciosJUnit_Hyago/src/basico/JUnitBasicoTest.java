package basico;


import static org.junit.Assert.*;

import org.junit.Test;

/*
 * ExercÃ­cio - Introducao ao JUnit
 * 
 * Descomentar o teste, ver o teste falar e fazer 
 * a mudanÃ§a necessÃ¡ria para o teste passar.
 * 
 */

public class JUnitBasicoTest {

	@Test
	public void testAssertTrue() {
		assertTrue(true); // antes estava false, erro.
	}
	
	
	@Test
	public void testAssertFalse() {
	assertFalse(false); // antes estava passando o parametro True, erro.
	}

	/*
	 * O JUnit informa o resultado esperado e o obtido.
	 */
	@Test
	public void testAssertEqualInts() {
		assertEquals(1, 1);
	}	
	
	
	@Test
	public void testCheckingIntCalculation() {
		int value = 4;
		int doubled = value * 3; // multiplicação de 4 e 3
		assertEquals(12, doubled); // O resultado esperado estava "8" ,estava errado.
	}	
	
	
	@Test
	public void testAssertExactlyEqualDoubles() {
		double value = 12.0;
		double result = value / 3; // divisão de 12 por 3
		double delta = 0.0;
		assertEquals(4.0, result, delta); // o resultado esperado estava 6.0, errado.
	}
	
	
	/*
	 * Quando numeros flutuantes sao comparados previsamos 
	 * definit o delta de diferenca nas casas decimais
	 * que podem acontecer.
	 * 
	 */
	@Test // foi incluido o método 
	public void testAssertAlmostEqualDoubles() {
		double numerator = 10.0;
		double denominator = 3.0;
		double delta = 0.005;
		double expected = 3.333;
		double quotient = numerator/denominator;
		
		assertEquals(expected, quotient, delta);
	}
	
	/*
	 * Strings can be compared too. Make this test pass by fixing
	 * whatToSay.  Before you fix it, note how JUnit indicates where the
	 * expected and actual strings differ
	 */
	@Test
	public void testCompareStrings1() {
		String greeting = "Hello";
		String greetee = "World";
		
		String whatToSay = greeting + greetee;
		
		assertEquals("HelloWorld", whatToSay); // antes havia um espaço entre as palavras, erro.
	}
	
	@Test // foi incluido o método
	public void testCompareStrings() { // vai comparar se os dois arrays são iguais
		int[] array1 = {1,2,3,4};
		int[] array2 = {1,2,3,4}; // antes o array2 {5,1,2,3,4} tinha  tamanhos e elementos diferente
		assertArrayEquals(array1, array2);
	}
	
		
}

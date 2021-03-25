package fila;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class filaTest extends TestCase {
	
	IFila fila;

	@Before
	public void setUp() throws Exception {  //cria uma nova fila para cada teste
		fila = new Fila();
	}

	@Test
	public void testInsereNaFila() throws FilaCheiaException {
		int tamanhoInicial = fila.tamanho();  // tamanho da fila
		fila.insereNaFila(1); // elemento para inserir na fila
		assertEquals(fila.tamanho(), tamanhoInicial+1); // insere na fila e aumenta o tamanho
	}
	
	@Test
	public void testInsereNoFim() {
		fila.insereNaFila(2); // insere um elemento
		fila.insereNaFila(3); // insere outro elemento
		Object retorno = fila.removeDaFila();
		assertEquals(2, retorno); // a fila precisa remover o primeiro elemento
	}

	@Test
	public void testRemoveDaFila() {
		fila.insereNaFila(1);
		int tamanhoinicio = fila.tamanho();
		fila.removeDaFila();
		assertEquals(fila.tamanho(), tamanhoinicio-1); // verifica se o tamanho inicial é -1
	}
	
	@Test
	public void testRemoveNoInicio() {
		fila.insereNaFila(1); // insere 1 elementos
		fila.insereNaFila(2); // insere 1 elemento
		assertEquals(fila.removeDaFila(), 1); // verifica se o elemento removido foi o 1
	}

}

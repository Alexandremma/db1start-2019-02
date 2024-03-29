package com.db1.db1start;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperacaoParImparTest {

	@Test
	public void deveVerificarSePar() {
		OperacaoParImpar operacaoParImpar = new OperacaoParImpar(4);
		boolean verificaSePar = operacaoParImpar.verificarSePar();
		assertEquals(true, verificaSePar);
	}
	
	@Test
	public void deveContarImparesAteCem() {
		OperacaoParImpar operacaoParImpar = new OperacaoParImpar(31);
		int contaImparesAteCem = operacaoParImpar.quantidadeImparesAteCem();
		assertEquals(34, contaImparesAteCem);
	}
	
}

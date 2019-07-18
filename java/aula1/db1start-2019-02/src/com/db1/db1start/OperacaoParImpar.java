package com.db1.db1start;

public class OperacaoParImpar {

	private int valor1;
	
	public OperacaoParImpar(int valor1) {
		this.valor1 = valor1;
	}
	
	public boolean verificarSePar() {
		if (valor1 % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int quantidadeImparesAteCem() {
		int diferenca = (100 - valor1);
		
		if (valor1 % 2 == 0) {
			return diferenca / 2;
		} else {
			return (diferenca - 1) / 2;
		}
	}

}

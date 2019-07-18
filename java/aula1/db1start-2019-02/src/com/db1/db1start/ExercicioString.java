package com.db1.db1start;

public class ExercicioString {

	private String texto;
	
	public ExercicioString(String texto) {
		this.texto = texto;
	}
	
	public String deixarMaiusculo() {
		return texto.toUpperCase();
	}
	
	public String deixarMinusculo() {
		return texto.toLowerCase();
	}
	
	public int contarQuantidadeCaracteres() {
		return texto.length();
	}
	
	public int contarQuantidadeCaracteresComEspaco() {
		return texto.length();
	}
	
	public int contarQuantidadeCaracteresSemEspaco() {
		return texto.trim().length();
	}
	
	public String mostrarQuatroPrimeirasLetras() {
		return texto.substring(0, 4);
	}
	
}
package com.db1.db1start;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExercicioStringTest {
	
	@Test
	public void deveDeixarMaiusculo() {
		ExercicioString exercicioString = new ExercicioString("db1start");
		String textoMaiusculo = exercicioString.deixarMaiusculo();
		assertEquals("DB1START", textoMaiusculo);
	}
	
	@Test
	public void deveDeixarMinusculo() {
		ExercicioString exercicioString = new ExercicioString("DB1START");
		String textoMinusculo = exercicioString.deixarMinusculo();
		assertEquals("db1start", textoMinusculo);
	}
	
	@Test
	public void deveContarQuantidadeCaracteres() {
		ExercicioString exercicioString = new ExercicioString("DB1Start");
		int quantidadeCaracteres = exercicioString.contarQuantidadeCaracteres();
		assertEquals(8, quantidadeCaracteres);
	}
	
	@Test
	public void deveContarQuantidadeCaracteresComEspaco() {
		ExercicioString exercicioString = new ExercicioString(" DB1Start ");
		int quantidadeCaracteresComEspaco = exercicioString.contarQuantidadeCaracteres();
		assertEquals(10, quantidadeCaracteresComEspaco);
	}
	
	@Test
	public void deveContarQuantidadeCaracteresSemEspaco() {
		ExercicioString exercicioString = new ExercicioString(" DB1Start ");
		int quantidadeCaracteresSemEspaco = exercicioString.contarQuantidadeCaracteresSemEspaco();
		assertEquals(8, quantidadeCaracteresSemEspaco);
	}
	
	@Test
	public void deveMostrarQuatroPrimeirasLetras() {
		ExercicioString exercicioString = new ExercicioString("Alexandre Martins Maciel");
		String quatroPrimeirasLetras = exercicioString.mostrarQuatroPrimeirasLetras();
		assertEquals("Alex", quatroPrimeirasLetras);
	}
	
}
package cenfotec.kata.Primos.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cenfotec.kata.Primos.LogicaPrimos;

public class LogicaPrimosTest {
	
	static LogicaPrimos LF = new LogicaPrimos();


	@Test
	public void pruebaUno() {
		ArrayList<Integer> Factores = new ArrayList<>();
		Factores.add(2);
		assertEquals(Factores, LogicaPrimos.generate(2));
	}
	
	@Test 
	public void pruebaDos() {
		ArrayList<Integer> Factores = new ArrayList<>();
		Factores.add(1);
		assertEquals(Factores, LogicaPrimos.generate(0));
	}
	
	@Test 
	public void pruebaTres() {
		ArrayList<Integer> Factores = new ArrayList<>();
		Factores.add(2);
		Factores.add(3);
		assertEquals(Factores, LogicaPrimos.generate(6));
	}



	
	
}

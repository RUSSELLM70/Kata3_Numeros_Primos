package cenfotec.kata.Primos;

import java.util.ArrayList;

public class LogicaPrimos {

	public static ArrayList <Integer> generate (int numero) {
		ArrayList <Integer> Primos = new ArrayList <>();
		int factor = 2;

		do {
			if(numero % factor == 0) {
				Primos.add(new Integer(factor));
				numero = numero/factor;
			} else {
				factor++;
				}
			}
		while (factor <= numero);
		System.out.println("\b");
		
	return Primos;
	}
}



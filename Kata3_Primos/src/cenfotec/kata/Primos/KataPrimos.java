package cenfotec.kata.Primos;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;


public class KataPrimos {
	static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static LogicaPrimos LF = new LogicaPrimos();
	
	
	public static void main(String[] args) throws IOException{
		mostrarMenu();
	
	}
	
	 public static void mostrarMenu() throws java.io.IOException {
	        int opcion;
	        opcion = -1;
	        do {
	            out.println("---MENU PRINCIPAL---");
	            out.println("1. Ingresar números");
	            out.println("Digite la opcion");
	            opcion = Integer.parseInt(in.readLine());
	            procesarOpcion(opcion);
	            out.println("La opcion ingresada fue: " + opcion);
	        } while (opcion != 9);
	    }
	 
	 public static void procesarOpcion(int pOpcion) throws IOException {

	        switch (pOpcion) {
	            case 1:
	            	ingresar_numero();
	                break;


	            default:
	                out.println("Opción inválida");
	                }
	        }
	 
	 public static void ingresar_numero() {
		 int numero = 0;
		 System.out.println("Ingrese un número, para ver sus factores primos:");
		 try {
			 numero = Integer.parseInt(in.readLine());
			 imprimir_primos(numero);
		 } catch (IOException e) {
			 
		 }
	 }
	 
	 public static void imprimir_primos(int numero) {
		 ArrayList<Integer> factores_primos = LF.generate(numero);
		 System.out.print("Los factores primos son: ");
		 for (Iterator<Integer> i = factores_primos.iterator(); i.hasNext();) {
			 Integer factor = i.next();
			System.out.print("[");
			System.out.print(factor);
			System.out.print("]");
			 
		 }
		 System.out.println();
	 }
}


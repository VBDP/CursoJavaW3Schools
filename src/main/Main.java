/*
 * Este mini script de java son pruebas de java del curso de
 * w3schools. Con esto pretendo repasar y hacer mis proyectos 
 * para adquirir conocimientos y experiencia.
 */

package main;

public class Main {
	
	//Esto es un comentário
	
	/*
	 * Esto es un comentário largo, lo de abajo son
	 * pruebas con variables
	 */
	
	
	
	public static void main(String[] args) {
		
		String prueba = "Output de un String";
		int numero1 = 1;
		final int numero2 = 2;
		float numero3= 3.14f;
		float numero4 = 6.18f;
		boolean truefalse = false;
		
		//Declarando multiples variables con y sin valor
		int x,y,z;
		int a=1, b=2,c=3;
		
			//Text Outputs
		System.out.println("Pruebas con Strings:");
		System.out.println("Hello World!");
		System.out.println("I am learning Java.");
		System.out.println("It is awesome!");
		System.out.println("=========================================");
		//Number Outputs
		System.out.println("Pruebas con numeros");
		System.out.println(1);
		System.out.println(4.50);
		System.out.println("=========================================");
		System.out.println("Pruebas con variables");
		System.out.println(prueba);
		System.out.println("Suma de dos enteros = " + (numero1 + numero2));
		System.out.println("Suma de dos floats = " + (numero3 + numero4));
		System.out.println("Output de un Boolean: " + truefalse);
		System.out.println("Output de tres variables declaradas en una linea: " + a + b + c);
		System.out.println("=========================================");
	}
}

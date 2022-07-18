import java.io.*;
import java.util.Scanner;

public class Algoritmo4{
	public static void main(String[] args) {
		//La variable de numero en kilometros por hora, es doble porque
		//En casos cotidianos pasa que no son numeros enteros
		double numeroenkmxh;
		final double valordeconversion = 0.2777777778;
		//Escribi el valor de conversión como "0.2777777778" porque es una manera de simplificar
		//la operación de gran manera, y es más preciso
		double resultado;
		Scanner entradaDatos = new Scanner (System.in);
		System.out.println ("Ingrese cantidad en km x h para convertir a mt x s");
		numeroenkmxh = entradaDatos.nextDouble();
		System.out.println("La cantidad en km/h es: " + numeroenkmxh);
		resultado = numeroenkmxh * valordeconversion;
		//Operacion de "valor isertado" x 0.277777778
		System.out.println ("Respuesta: " + resultado);
		//Fin

	}
}
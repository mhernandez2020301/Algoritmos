import java.io.*;
import java.util.Scanner;

public class Algoritmo3v2 {
	public static void main(String[] args) {
		//Escribi el valor numerico con Double, porque tiene que ser preciso
		//En muchos casos son metros con decimales
		double numeroaconvertirenmetros;
		final double pies = 3.28;
		double resultado;
		Scanner entradaDatos = new Scanner (System.in);
		//Se ingresa el numero en metros para convertirlos a pies
		System.out.println ("Ingrese cantidad en metros para convertirlas a pies");
		numeroaconvertirenmetros = entradaDatos.nextInt();
		System.out.println ("La cantidad en metros es: " + numeroaconvertirenmetros);
		System.out.println ("Espere un momento, se esta procesando su conversion de: " + numeroaconvertirenmetros + " metros a pies");
		resultado = numeroaconvertirenmetros * pies ;
		//Se opera el numeroo insertado con el valor defecto que es 3.28
		System.out.println ("Respuesta: " + resultado);
		//Fin
	}
}
import java.io.*;
import java.util.Scanner;

public class Algoritmo1{
	public static void main(String[] args) {
		//Se ven las variables que utilizara el algoritmo
		int numero;
		int numero2;
		Scanner entradaDatos = new Scanner (System.in);
		Scanner entradaDatos1 = new Scanner (System.in);
		System.out.println("Inserte valor 1");
		numero = entradaDatos.nextInt();
		//Se ingresó el primer valor o "numero" como se llama la variable
		System.out.println("El valor 1 es " + numero);
		System.out.println("Inserte valor 2");
		numero2 = entradaDatos1.nextInt();
		//Se ingresó el segundo valor o "numero2" como se llama la variable
		System.out.println("El valor 2 es " + numero2);
		
		/*Aqui es donde pasa el algoritmo como tal, se ordenan las variabls utilizando
		"If" y "Else if"*/

		if(numero>numero2){
			System.out.println(numero + " > " + numero2 + " Orden de mayor a menor");
		} else if (numero<numero2){
			System.out.println(numero2 + " > " + numero + " Orden de mayor a menor" );
		}
	}
}
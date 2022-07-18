import java.io.*;
import java.util.Scanner;

public class Algoritmo5{
	public static void main(String[] args) {
		//En esta pequeña calculadora con 4 funciones puse que los valores fueran Double, para
		//que sea más precisa y así poder sumar tambien con decimales, como una calculadora normal
		//Lo hice porque quería una calculadora lo más pegada a la realidad posible
		String operacion;
		double valor1;
		double valor2;
		double resultado;
		Scanner	entradaDatos = new Scanner (System.in);
		System.out.println ("Escriba la operacíon que desea realizar [S para sumar, R para restas, M para multiplicacion o D para division]");
		operacion = entradaDatos.nextLine();
		//Usé Switch para que sean 4 casos, suma, resta, división y multiplicación
		//Asi mismo lleva un orden y bastante sentido y fácil compresnión
		switch (operacion){
			case "S":
			System.out.println("Escogio Suma");
			System.out.println("Inserte valor 1");
			valor1 = entradaDatos.nextDouble();
			System.out.println("El valor 1 es: " + valor1);
			System.out.println("Inserte valor 2");
			valor2 = entradaDatos.nextDouble();
			System.out.println("El valor 2 es: " + valor2);
			//Se operan los valores insertados, en este caso se suman
			resultado = valor1 + valor2;
			System.out.println("El resultado es: " + resultado);
			break;

			case "R":
			System.out.println("Escogio Resta");
			System.out.println("Inserte valor 1");
			valor1 = entradaDatos.nextDouble();
			System.out.println("El valor 1 es: " + valor1);
			System.out.println("Inserte valor 2");
			valor2 = entradaDatos.nextDouble();
			System.out.println("El valor 2 es: " + valor2);
			resultado = valor1 - valor2;
			//Se operan los valores insertados, en este caso se restan
			System.out.println("El resultado es: " + resultado);
			break;

			case "M":
			System.out.println("Escogio Multiplicacion");
			System.out.println("Inserte valor 1");
			valor1 = entradaDatos.nextDouble();
			System.out.println("El valor 1 es: " + valor1);
			System.out.println("Inserte valor 2");
			valor2 = entradaDatos.nextDouble();
			System.out.println("El valor 2 es: " + valor2);
			resultado = valor1 * valor2;
			//Se operan los valores insertados, en este caso se multiplican
			System.out.println("El resultado es: " + resultado);
			break;

			case "D":
			System.out.println("Escogio Division");
			System.out.println("Inserte valor 1");
			valor1 = entradaDatos.nextDouble();
			System.out.println("El valor 1 es: " + valor1);
			System.out.println("Inserte valor 2");
			valor2 = entradaDatos.nextDouble();
			System.out.println("El valor 2 es: " + valor2);
			resultado = valor1/valor2;
			//Se operan los valores insertados, en este caso se dividen
			System.out.println("El resultado es: " + resultado);			
			break;

			//Utilicé el default para que no falle el progeama, aun así es bastante importante
			default:
			System.out.println ("No inserto ningun valor que se le solicita");
			
		}
	}
}
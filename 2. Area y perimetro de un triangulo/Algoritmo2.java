//Importación de 
import java.io.*;
import java.util.Scanner;

public class Algoritmo2{
	public static void main(String[] args) {
		//Especifico las variables a utilizar en el algoritmo
		String operacion;
		int valor1;
		int valor2;
		int valor3;
		double resultado1;
		double resultado2;
		int valordefecto = 2;
		Scanner entradaDatos = new Scanner (System.in);
		//Selecciona la operacion a realizar en este caso "Area ó permietro"
		System.out.println("Escriba <<Area>> o <<Perimetro>> [Sin tildes y con mayuscula al inicio]");
		operacion = entradaDatos.nextLine();
		//Utilicé Switch para los 2 casos, para el caso Area y para el caso Perimetro
		switch (operacion){
			case "Perimetro":
			System.out.println("Escogio Perimetro");
			System.out.println("Inserte Valor 1");
			valor1 = entradaDatos.nextInt();
			System.out.println("El valor 1 es " + valor1);
			System.out.println("Inserte Valor 2");
			valor2 = entradaDatos.nextInt();
			System.out.println("El valor 2 es " + valor2);
			System.out.println("Inserte valor 3");
			valor3 = entradaDatos.nextInt();
			//Con los valores insertados, los opera con la siguiente instrucción
			resultado1 = valor1 + valor2 + valor3;
			System.out.println("El perimetro es: " + resultado1);
			//Resuelto el perimetro
			break;
			//Break se utiliza para no saltar al siguiente caos
			//Es para que tenga un mejor orden

			case "Area":
			System.out.println("Escogio Area");
			System.out.println("Inserte Valor 1");
			//Se inserta el valor 1
			valor1 = entradaDatos.nextInt();
			System.out.println("El valor 1 es " + valor1);
			System.out.println("Inserte Valor 2");
			//Se inserta el valor
			valor2 = entradaDatos.nextInt();
			System.out.println("El valor 2 es " + valor2);
			resultado1 = valor1*valor2;
			resultado2 = resultado1/valordefecto;
			//Se efectua la operacion, está así porque si se escribia
			// Valor1*valor2/valordefecto
			//Daba error y fue una solución rápida y eficiente
			System.out.println("El area es: " + resultado2);
			//Resultado, probado y siempre es satisfactorio

			break;
			default:
			System.out.println("Escriba algo porfa xd");
			//Caso default que sucede si escriben mal el dato de operacion
			//Sirve para que no se crashee el algoritmo
			//Y para que el usuario esté enterado
			}
		}
	}
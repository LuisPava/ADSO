package repasoJAVA;

import java.util.Scanner;
import static java.lang.String.format;

public class Ejercicio01 {
	//Lectura de datos por teclado.
	public static void main(String[] args) {
		var lector = new Scanner(System.in);

		System.out.print("Edad: ");
		var edad = lector.nextInt();

		System.out.println("Nota 1: ");
		var nota1 = lector.nextDouble();
		
		System.out.println("Nota 2: ");
		var nota2 = lector.nextDouble();
		
		System.out.println("Nota 3: ");
		var nota3 = lector.nextDouble();
		var definitiva = (nota1+nota2+nota3) / 3;
		
		var respuesta = definitiva >= 350 ? "APROBADO":"DESAPROBADO";
		var mensaje = format("Su nota es: %.2f y usted %s con %d años", definitiva, respuesta, edad);
		System.out.println(mensaje);
	}
}

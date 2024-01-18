package UI;

import java.util.Scanner;

import logica.Division;
import logica.Multiplicacion;
import logica.Resta;
import logica.Suma;

public class Menu {
	Scanner s = new Scanner(System.in);
	byte a, b;
	String op ="";
	
	Menu(){
		
	}
	
	String opciones () {
		System.out.println(" ######################################################### ");
		System.out.println(" Bienvenido a la calculadora.");
		System.out.println(" ######################################################### ");
		System.out.print("Ingrese primer número: "); a = s.nextByte();
		System.out.print("Ingrese segundo número: "); b = s.nextByte();
		System.out.print("para sumar +\n"
				+ "para restar -\n"
				+ "para dividir /\n"
				+ "para multiplicar *\n"
				+ "para salir s\n"
				+ "-> ");
		String o = s.next(); //Filtrar inputs solo admita +,-,/ y *
		return o;
	}
	
	void iniciar() {
		while (!op.contains("s")) {
			op = opciones();
			if (op.contains("+")) {
				Suma s = new Suma(a, b);
				System.out.println("La suma da: " + s.cuenta());
			} else if(op.contains("-")) {
				Resta r = new Resta(a, b);
				System.out.println("La resta da: " + r.cuenta());
			} else if (op.contains("*")) {
				Multiplicacion m = new Multiplicacion(a, b);
				System.out.println("La multiplicacion da: " + m.cuenta());
			} else if(op.contains("/")) {
				Division d = new Division(a, b);
				System.out.println("La division da: " + d.cuenta());
			} else if(op.contains("s")) {
				break;
			}
		}
	}

}

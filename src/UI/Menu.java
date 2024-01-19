package UI;

import java.util.Scanner;

import logica.Division;
import logica.Multiplicacion;
import logica.Resta;
import logica.Suma;

public class Menu {
	Scanner s;
	byte a, b;
	
	
	Menu(){
		
	}
	
	String opciones () {
		String o ="";
		System.out.println("\n ######################################################### ");
		System.out.println(" Bienvenido a la calculadora.");
		System.out.println(" ######################################################### ");
		System.out.print("Ingrese primer número: "); a = s.nextByte(); //validar numero
		System.out.print("Ingrese segundo número: "); b = s.nextByte();
		return o = operar();
	}
	
	String operar() {
		boolean bandera= true;
		String op ="";
		
		while(bandera) {
			System.out.print("para sumar +\n"
					+ "para restar -\n"
					+ "para dividir /\n"
					+ "para multiplicar *\n"
					+ "para salir s\n"
					+ "-> ");
			op = s.next().toString();
			if (op.matches("[+-/*s]")) {
				bandera = false;
			}
		}
		return op;
	}
	
	void iniciar() {
		s = new Scanner(System.in);
		String op ="";
		while (!op.contains("s")) {
			op = opciones();
			if (op.contains("+")) {
				Suma su = new Suma(a, b);
				System.out.println("La suma da: " + su.cuenta());
			} else if(op.contains("-")) {
				Resta r = new Resta(a, b);
				System.out.println("La resta da: " + r.cuenta());
			} else if (op.contains("*")) {
				Multiplicacion m = new Multiplicacion(a, b);
				System.out.println("La multiplicación da: " + m.cuenta());
			} else if(op.contains("/")) {
				Division d = new Division(a, b);
				System.out.println("La división da: " + d.cuenta());
			} else if(op.contains("s")) {
				break;
			}
		}
		s.close();
	}

}

package UI;

import java.util.Scanner;


import logica.OperacionA;
import logica.Suma;

public class Menu {
	Scanner s;
	Byte a, b;
	
	
	Menu(){
		
	}
	
	String opciones () {
		System.out.println("\n ######################################################### ");
		System.out.println(" Bienvenido a la calculadora.");
		System.out.println(" ######################################################### ");
		System.out.print("Ingrese primer número: "); a = Byte.valueOf(s.nextByte()); //falta validar numero
		System.out.print("Ingrese segundo número: "); b = Byte.valueOf(s.nextByte());
		return operar();
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
		OperacionA operacion;
		String op ="";
		while (!op.contains("s")) {
			op = opciones();
			if (op.contains("+")) {
				operacion = new Suma(a, b);
				System.out.println("La suma da: " + operacion.getResultado().toString());
			}/* else if(op.contains("-")) {
				operacion = new Resta(a, b);
				System.out.println("La resta da: " + r.cuenta());
			} else if (op.contains("*")) {
				operacion = new Multiplicacion(a, b);
				System.out.println("La multiplicación da: " + m.cuenta());
			} else if(op.contains("/")) {
				operacion = new Division(a, b);
				System.out.println("La división da: " + d.cuenta());
			} else if(op.contains("s")) {
				break;
			}*/
		}
		s.close();
	}

}

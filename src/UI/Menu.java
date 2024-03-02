package UI;

import java.util.Scanner;

import logica.Division;
import logica.Factorial;
import logica.Matriz;
import logica.Multiplicacion;
import logica.OperacionA;
import logica.Resta;
import logica.Suma;
import persistencia.PersistirArchivo;

public class Menu {
  Scanner s;
  Byte a, b;
  Matriz x, y, z;


  Menu() {

  }

  String menu1() { // Crear menú genérico con parámetros: String opciones, bienvenida.
    String op = "";
    boolean bandera = true;
    while (bandera) {
      System.out.println("\n ######################################################### "
          + "\n Bienvenido a la calculadora."
          + "\n ######################################################### ");
      System.out.print(
          "Vamos a trabajar con: " + "\na - números" + "\nb - matrices" + "\ns - salir" + "\n -> ");
      op = s.next().toString();
      if (op.matches("[abs]")) {
        bandera = false;
      }
    }

    return op;
  }

  void operacionesNumeros() {
    OperacionA operacion;
    String op = "";
    while (!op.contains("s")) {
      op = menuNumeros();
      if (op.contains("+")) {
        operacion = new Suma(a, b);
        System.out.println("La suma da: " + operacion.getResultado().toString());
        PersistirArchivo.alArchivo(operacion);
      } else if (op.contains("-")) {
        operacion = new Resta(a, b);
        System.out.println("La resta da: " + operacion.getResultado().toString());
        PersistirArchivo.alArchivo(operacion);
      } else if (op.contains("*")) {
        operacion = new Multiplicacion(a, b);
        System.out.println("La multiplicación da: " + operacion.getResultado().toString());
        PersistirArchivo.alArchivo(operacion);
      } else if (op.contains("/")) {
        operacion = new Division(a, b);
        System.out.println("La división da: " + operacion.getResultado().toString());
        PersistirArchivo.alArchivo(operacion);
      } else if(op.contains("!")) {
        operacion = new Factorial (a);
        System.out.println("El factorial da: " + operacion.getResultado().toString());
        PersistirArchivo.alArchivo(operacion);
      } else if (op.contains("s")) {
        break;
      }
    }
  }

  String menuNumeros() {
    boolean bandera = true;
    String op = "";
    System.out.print("Ingrese primer número: ");
    a = Byte.valueOf(s.nextByte()); //PENDIENTE: falta validar numero
    System.out.print("Ingrese segundo número: ");
    b = Byte.valueOf(s.nextByte());
    while (bandera) {
      System.out.print("para sumar +\n" + "para restar -\n" + "para dividir /\n"
          + "para multiplicar *\n" + "para factorial!\n" +"para salir s\n" + "-> ");
      op = s.next().toString();
      if (op.matches("[+-/*s!]")) {
        bandera = false;
      }
    }
    return op;
  }

  void operacionMatrices() {
    System.out.println("MATRICES");
  }

  void iniciar() {
    s = new Scanner(System.in);
    String op = "";

    while (!op.contains("s")) {
      op = menu1();
      if (op.contains("a")) {
        operacionesNumeros();
      } else if (op.contains("b")) {
        operacionMatrices();
      } else if (op.contains("s")) {
        break;
      }
    }
    s.close();
  }

}

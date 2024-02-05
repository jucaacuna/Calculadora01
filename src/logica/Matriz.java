package logica;

import java.util.Scanner;

public class Matriz {

  private byte[][] m;

  Matriz(Matriz a) {
    m = a.clonar();
  }

  Matriz(byte f, byte c) { // debe ser mayor que 0
    m = new byte[f][c];
  }

  public void cargarValores() {
    Scanner s = new Scanner(System.in);
    for (byte f = 0; f < m.length; f++) {
      for (byte c = 0; c < m[f].length; c++) {
        System.out.printf("Ingrese valor[%d][%d]: ", f + 1, c + 1); // Java cuenta desde 0, en
                                                                    // Álgebra desde 1.
        byte valor = s.nextByte();
        m[f][c] = valor;
      }

    }
    s.close();
  }

  public void mostrarValores() {
    for (byte f = 0; f < m.length; f++) {
      for (byte c = 0; c < m[f].length; c++) {
        System.out.print("[" + m[f][c] + "] ");
      }
      System.out.println();
    }
  }

  public byte calcularDeterminante() {

    return 0; // TODO
  }

  public boolean esInvertible() {

    return true; // TODO
  }

  public String tamaño() {
    return ("Tamaño: [" + m.length + "]x[" + m[0].length + "]");
  }

  public byte[][] clonar() {
    return m.clone();
  }
}

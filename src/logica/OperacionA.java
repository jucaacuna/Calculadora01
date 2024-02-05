package logica;

public abstract class OperacionA implements Operacion {

  protected Byte numero1, numero2, resultado;

  OperacionA() {

  }
  
  OperacionA(Byte a) {
    setOperador(a);
  }

  OperacionA(Byte a, Byte b) {
    setOperadores(a, b);
  }

  /*
   * Recibe los operadores como parámetros y los carga en las variables locales.
   */
  public void setOperadores(Byte a, Byte b) {
    numero1 = Byte.valueOf(a.byteValue());
    numero2 = Byte.valueOf(b.byteValue());
  }
  
  /*
   * Constructor necesario para operaciones con un único término. Por ejemplo: factorial.
   * */
  public void setOperador(Byte a) {
    numero1 = Byte.valueOf(a.byteValue());
  }

  /*
   * Devuelve el resultado almacenado en la variable homónima.
   */
  public Byte getResultado() {
    cuenta();
    return resultado;
  }
}

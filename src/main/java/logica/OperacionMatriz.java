package logica;

public abstract class OperacionMatriz implements Operacion {

  protected Matriz m1, m2, resultado;

  public OperacionMatriz() {

  }

  public OperacionMatriz(Matriz a, Matriz b) {
    setOperadores(a, b);
  }

  /*
   * Carga los elementos (de tipo Matriz) a operar.
   */
  public void setOperadores(Matriz a, Matriz b) {
    m1 = new Matriz(a);
    m1 = new Matriz(b);
  }

  /*
   * Devuelve el resultado almacenado en la variable homónima.
   */
  public Matriz getResultado() {
    cuenta();
    return resultado;
  }
}

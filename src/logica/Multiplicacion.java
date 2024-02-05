package logica;

public class Multiplicacion extends OperacionA {

  public Multiplicacion() {
    super();
  }

  public Multiplicacion(Byte a, Byte b) {
    super(a, b);

  }

  @Override
  public void cuenta() {
    resultado = Byte.valueOf((byte) (numero1.byteValue() * numero2.byteValue()));

  }

}

package logica;

public class Multiplicacion extends OperacionA {

  public Multiplicacion() {
    super();
    this.tipo = '*';
  }

  public Multiplicacion(Byte a, Byte b) {
    super(a, b);
    this.tipo = '*';
    cuenta();

  }

  @Override
  public void cuenta() {
    setResultado(Byte.valueOf((byte) (numero1.byteValue() * numero2.byteValue())));

  }

}

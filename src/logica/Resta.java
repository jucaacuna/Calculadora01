package logica;

public class Resta extends OperacionA {

  Resta() {
    super();
    this.tipo = '-';
  }

  public Resta(Byte a, Byte b) {
    super(a, b);
    cuenta();
    this.tipo = '-';
  }

  @Override
  public void cuenta() {
    setResultado( Byte.valueOf((byte) (numero1.byteValue() - numero2.byteValue())));
  }
}

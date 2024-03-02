package logica;

public class Resta extends OperacionA {

  Resta() {
    super();
  }

  public Resta(Byte a, Byte b) {
    super(a, b);
    cuenta();
  }

  @Override
  public void cuenta() {
    setResultado( Byte.valueOf((byte) (numero1.byteValue() - numero2.byteValue())));
  }
}

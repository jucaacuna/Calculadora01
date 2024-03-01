package logica;

public class Suma extends OperacionA {

  Suma() {
    super();
  }

  public Suma(Byte a, Byte b) {
    super(a, b);
  }

  @Override
  public void cuenta() {
    setResultado (Byte.valueOf((byte) (numero1.byteValue() + numero2.byteValue())));
  }
}

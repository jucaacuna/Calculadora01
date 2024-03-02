package logica;

public class Suma extends OperacionA {

  Suma() {
    super();
    this.tipo = '+';
  }

  public Suma(Byte a, Byte b) {
    super(a, b);
    cuenta();
    this.tipo = '+';
  }

  @Override
  public void cuenta() {
    setResultado (Byte.valueOf((byte) (numero1.byteValue() + numero2.byteValue())));
  }
}

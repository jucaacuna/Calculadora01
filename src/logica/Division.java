package logica;

public class Division extends OperacionA {

  public Division() {
    super();
  }

  public Division(Byte a, Byte b) {
    super(a, b);
    cuenta();
  }

  @Override
  public void cuenta() {
    setResultado(Byte.valueOf((byte) (numero1.byteValue() / numero2.byteValue())));
  }

}

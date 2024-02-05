package logica;

public class Division extends OperacionA {

  public Division() {
    super();
  }

  public Division(Byte a, Byte b) {
    super(a, b);
  }

  @Override
  public void cuenta() {
    resultado = Byte.valueOf((byte) (numero1.byteValue() / numero2.byteValue()));
  }

}

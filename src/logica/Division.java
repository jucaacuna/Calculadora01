package logica;

public class Division extends OperacionA {

  public Division() {
    super();
    this.tipo = '/';
  }

  public Division(Byte a, Byte b) {
    super(a, b);
    this.tipo = '/';
    cuenta();
  }

  @Override
  public void cuenta() {
    setResultado(Byte.valueOf((byte) (numero1.byteValue() / numero2.byteValue())));
  }

}

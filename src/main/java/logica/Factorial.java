package logica;

public class Factorial extends OperacionA {

  public Factorial() {
    super();
    this.tipo = '!';
  }

  public Factorial(Byte a) {
    super(a);
    this.tipo = '!';
    cuenta();
  }

  @Override
  public void cuenta() {
    setResultado(Byte.valueOf(cuentaAux(numero1.byteValue())));
  }

  public byte cuentaAux(byte a) {
    byte aux = 0;
    if (a == 0 || a ==1) {
      aux = 1;
    } else {
      aux = (byte) (a * cuentaAux(--a));
    }
    return aux;

  }
}

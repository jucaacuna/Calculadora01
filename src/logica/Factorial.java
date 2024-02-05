package logica;

public class Factorial extends OperacionA {

  public Factorial() {
    // TODO Auto-generated constructor stub
  }

  public Factorial(Byte a) {
    super(a);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void cuenta() {
    resultado = Byte.valueOf(cuentaAux(numero1.byteValue()));
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

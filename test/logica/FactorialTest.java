package logica;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {
  private OperacionA o;
  private byte a, resultadoEsperado;
  private Byte x, y;  

  @Test
  public void Factorial4test() {
    a = (byte) 4;
    resultadoEsperado = (byte) 24;
    x = Byte.valueOf(a);
    o = new Factorial(x);
    assertEquals(o.getResultado().byteValue(), resultadoEsperado);
    
  }

}

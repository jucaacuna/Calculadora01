package persistencia;

import org.junit.Test;
import logica.OperacionA;
import logica.Suma;

public class PersistirJSON {
  private OperacionA o;
  private byte a, b;
  private Byte x, y, z;

  @Test
  public final void test1() {
    a = 2;
    b = 1;
    x = Byte.valueOf(a);
    y = Byte.valueOf(b);
    o = new Suma(x, y);
    o.cuenta();
    String salida = PersistirArchivo.alJson(o);
    System.out.println("Resultado:" + o.getResultado());
    System.out.println("La salida es:" + salida);
    PersistirArchivo.alArchivo(o);
  }

  @Test
  public final void test2() {
    a = 2;
    b = 1;
    x = Byte.valueOf(a);
    y = Byte.valueOf(b);
    o = new Suma(x, y);
    o.cuenta();
    PersistirArchivo.alArchivo(o);
    System.out.println("LISTO");
  }

}

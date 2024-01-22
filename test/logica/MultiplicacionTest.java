package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicacionTest {
	private OperacionA o;
	private byte a,b,resultadoEsperado;
	private Byte x, y, z;
	
	@Test
	public void multi2y1test() {
		a=2; b=1; resultadoEsperado=2;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		z = Byte.valueOf(resultadoEsperado);
		o = new Multiplicacion(x,y);
		assertEquals(o.getResultado().byteValue(),z.byteValue());
	}
	
	@Test (expected = Exception.class)
	public void multiBORDEtest() {
		a=127; b=2;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		o = new Multiplicacion(x,y);
	}

	@Test
	public void multi0y0test() {
		a=0; b=0; resultadoEsperado=0;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		z = Byte.valueOf(resultadoEsperado);
		o = new Multiplicacion(x,y);
		assertEquals(o.getResultado().byteValue(),z.byteValue());
	}
}

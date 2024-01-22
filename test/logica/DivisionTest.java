package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {
	private OperacionA o;
	private byte a,b,resultadoEsperado;
	private Byte x, y, z;
	
	@Test
	public void divi2y2test() {
		a=2; b=2; resultadoEsperado=1;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		z = Byte.valueOf(resultadoEsperado);
		o = new Division(x,y);
		assertEquals(o.getResultado().byteValue(),z.byteValue());
	}
	
	@Test (expected = Exception.class)
	public void diviporCerotest() {
		a=127; b=0;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		o = new Division(x,y);
	}

	@Test
	public void diviBajatest() {
		a=-128; b=2; resultadoEsperado=-64;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		z = Byte.valueOf(resultadoEsperado);
		o = new Division(x,y);
		assertEquals(o.getResultado().byteValue(),z.byteValue());
	}
}

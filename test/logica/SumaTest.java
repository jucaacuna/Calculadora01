package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumaTest {
	private Suma s;
	private byte a,b,resultadoEsperado;
	private Byte x, y, z;
	
	@Test
	public void Suma2y1test() {
		a=2; b=1; resultadoEsperado=3;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		z = Byte.valueOf(resultadoEsperado);
		s = new Suma(x,y);
		assertEquals(s.getResultado().byteValue(),z.byteValue());
	}
	
	@Test (expected = Exception.class)
	public void SumaGRANDEtest() {
		a=127; b=1;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		s = new Suma(x,y);
	}

	@Test
	public void SumaBajatest() {
		a=-127; b=-1; resultadoEsperado=-128;
		x = Byte.valueOf(a);
		y = Byte.valueOf(b);
		z = Byte.valueOf(resultadoEsperado);
		s = new Suma(x,y);
		assertEquals(s.getResultado().byteValue(),z.byteValue());
	}
	
	
}
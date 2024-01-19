package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumaTest {
	
	Suma s = new Suma();
	byte resultadoEsperado;

	@Test
	public void Suma2y1test() {
		s.setNum((byte) 2, (byte) 1);
		resultadoEsperado=3;
		assertEquals(s.cuenta(), resultadoEsperado);
		
	}
	
	@Test (expected = Exception.class)
	public void SumaGRANDEtest() {
		s.setNum((byte) 127, (byte) 10);
		s.cuenta();
	}
	
	@Test
	public void SumaBajatest() {
		s.setNum((byte) -127, (byte) -1);
		resultadoEsperado=-128;
		assertEquals(s.cuenta(), resultadoEsperado);
		
	}
	
	
}
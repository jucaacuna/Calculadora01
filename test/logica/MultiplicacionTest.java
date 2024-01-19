package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicacionTest {

	Multiplicacion m = new Multiplicacion();
	byte resultadoEsperado;

	@Test
	public void Multiplicacion5y4test() {
		m.setNum((byte) 5, (byte) 4);
		resultadoEsperado = 20;
		assertEquals(m.cuenta(), resultadoEsperado);
	}
	
	@Test
	public void Multiplicacion0y0test() {
		m.setNum((byte) 0, (byte) 0);
		resultadoEsperado = 0;
		assertEquals(m.cuenta(), resultadoEsperado);
	}
	
	@Test (expected = Exception.class)
	public void MultiplicacionGrandetest() {
		m.setNum((byte) 127, (byte) 127);
		m.cuenta();
	}
}

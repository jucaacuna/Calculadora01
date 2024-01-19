package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {

	Division d = new Division();
	byte resultadoEsperado;
	
	@Test
	public void Division8y2test() {
		d.setNum((byte) 8, (byte) 2);
		resultadoEsperado= 4;
		assertEquals(d.cuenta(), resultadoEsperado);
	}
	
	@Test
	public void Division0yNtest() {
		for (byte b=-128; b<=126; b++ ) {
			if(b==0) {
				continue;
			}
			d.setNum((byte) 0, b);
			resultadoEsperado= 0;
			assertEquals(d.cuenta(), resultadoEsperado);
		}

	}
	
	@Test (expected = ArithmeticException.class)
	public void DivisionCerotest() {
		d.setNum((byte) 1, (byte) 0);
		d.cuenta();
	}

}

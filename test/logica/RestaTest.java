package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestaTest {

	Resta r = new Resta();
	byte resultadoEsperado;

	@Test
	public void Resta2y1test() {
		r.setNum((byte) 2, (byte) 1);
		resultadoEsperado = 1;
		assertEquals(r.cuenta(), resultadoEsperado);
	}
	
	@Test (expected = Exception.class)
	public void RestaLimiteInferiortest() {
		r.setNum((byte) -128, (byte) -1);
	}
}
package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicacionTest {

	Multiplicacion m = new Multiplicacion();

	@Test
	public void Multiplicacion5y4test() {
		m.setNum((byte) 5, (byte) 4);
		assertEquals(m.cuenta(), (byte) 20);
		
	}
}

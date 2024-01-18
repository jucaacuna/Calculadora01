package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumaTest {
	
	Suma s = new Suma();

	@Test
	public void Suma2y1test() {
		s.setNum((byte) 2, (byte) 1);
		assertEquals(s.cuenta(), (byte) 3);
		
	}
}
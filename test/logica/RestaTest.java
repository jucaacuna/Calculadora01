package logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestaTest {

	Resta r = new Resta();

	@Test
	public void Resta2y1test() {
		r.setNum((byte) 2, (byte) 1);
		assertEquals(r.cuenta(), (byte) 1);
		
	}
}
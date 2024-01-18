package logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	Division d = new Division();

	@Test
	public void Division8y2test() {
		d.setNum((byte) 8, (byte) 2);
		assertEquals(d.cuenta(), (byte) 4);
		
	}

}

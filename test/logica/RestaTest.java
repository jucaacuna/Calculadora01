package logica;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestaTest {
		private OperacionA o;
		private byte a,b,resultadoEsperado;
		private Byte x, y, z;
		
		@Test
		public void Resta2y1test() {
			a=2; b=1; resultadoEsperado=1;
			x = Byte.valueOf(a);
			y = Byte.valueOf(b);
			z = Byte.valueOf(resultadoEsperado);
			o = new Resta(x,y);
			assertEquals(o.getResultado().byteValue(),z.byteValue());
		}
		
		@Test (expected = Exception.class)
		public void restaBORDEtest() {
			a=-128; b=1;
			x = Byte.valueOf(a);
			y = Byte.valueOf(b);
			o = new Resta(x,y);
		}

		@Test
		public void restaBajatest() {
			a=-127; b=1; resultadoEsperado=-128;
			x = Byte.valueOf(a);
			y = Byte.valueOf(b);
			z = Byte.valueOf(resultadoEsperado);
			o = new Resta(x,y);
			assertEquals(o.getResultado().byteValue(),z.byteValue());
		}
}

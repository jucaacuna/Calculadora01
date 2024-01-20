package logica;


import org.junit.Test;

public class MatrizTest {
	
	Matriz m = new Matriz((byte) 2, (byte)2);


	@Test
	public void testCargarValores() {
		m.cargarValores();
	}
	
	@Test
	public void testMostrarValores() {
		m.cargarValores();
		m.mostrarValores();
	}
	
	@Test
	public void testTamaño() {
		System.out.print(m.tamaño());
	}
}

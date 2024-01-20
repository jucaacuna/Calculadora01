package logica;

public abstract class OperacionMatriz implements Operacion {
	protected Matriz m1, m2;

	public OperacionMatriz() {
		
	}
	
	public OperacionMatriz(Matriz a, Matriz b) {
		setOperadores(a,b);
	}
	
	/* Carga los elementos (de tipo Matriz) a operar.
	 * */
	public void setOperadores(Matriz a, Matriz b) {
		m1 = a;
		m1 = b;
	}

	@Override
	public byte cuenta() {

		return 0;
	}

}

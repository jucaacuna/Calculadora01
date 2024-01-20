package logica;

public abstract class OperacionA implements Operacion {
	
	protected byte numero1, numero2;
	
	OperacionA(){
		
	}
	
	OperacionA (byte a, byte b){
		setNum(a, b);
	}

	/* Carga los números a operar.
	 * */
	public void setNum(byte a, byte b) {
		numero1 = a;
		numero2 = b;
	}

	@Override
	public byte cuenta() {
		byte resultado = 0;
		return  resultado;
	}

}

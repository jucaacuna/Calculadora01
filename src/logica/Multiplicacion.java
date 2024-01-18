package logica;

public class Multiplicacion extends OperacionA {
	
	Multiplicacion(){
		super();
	}

	Multiplicacion(byte a, byte b){
		super(a, b);
	}
	
	@Override
	public byte cuenta() {
		return (byte) (numero1 * numero2);
	}
}

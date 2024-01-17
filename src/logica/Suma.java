package logica;

public class Suma extends OperacionA {

	Suma(){
		super();
	}
	
	Suma(byte a, byte b) {
		super(a, b);

	}

	@Override
	public byte cuenta() {
		return (byte) (numero1 + numero2);
	}

}

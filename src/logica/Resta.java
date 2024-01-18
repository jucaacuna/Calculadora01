package logica;

public class Resta extends OperacionA {

	Resta() {
		super();
	}

	Resta(byte a, byte b) {
		super(a, b);
	}

	@Override
	public byte cuenta() {
		return (byte) (numero1 - numero2);
	}
}
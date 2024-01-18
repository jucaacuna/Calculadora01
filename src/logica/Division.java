package logica;

public class Division extends OperacionA {

	Division() {
		super();
	}

	Division(byte a, byte b) {
		super(a, b);
	}
	
	public byte cuenta() {
		return (byte) (numero1 / numero2);
	}

}

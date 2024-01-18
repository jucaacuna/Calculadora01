package logica;

public class Division extends OperacionA {

	Division() {
		super();
	}

	public Division(byte a, byte b) {
		super(a, b);
	}
	
	@Override
	public byte cuenta() {
		return (byte) (numero1 / numero2);
	}

}

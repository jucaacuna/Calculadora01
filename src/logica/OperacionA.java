package logica;

public abstract class OperacionA implements Operacion {
	
	public byte numero1;
	public byte numero2;
	
	OperacionA(){
		
	}
	
	OperacionA (byte a, byte b){
		setNum(a, b);
	}

	@Override
	public void setNum(byte a, byte b) {
		numero1 = a;
		numero2 = b;
	}

	@Override
	public byte cuenta() {
		// TODO Auto-generated method stub
		byte valor = 0;
		return  valor;
	}

}

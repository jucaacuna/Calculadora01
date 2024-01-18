package logica;

interface Operacion {


	/* Carga los números a operar.
	 * */
	public void setNum(byte a, byte b);

	//public byte[] getNums();

	/* Realiza la operación y retorna el valor.
	 * */
	public byte cuenta();

}

package logica;

interface Operacion {


	/* Cargar los números a operar.
	 * */
	public void setNum(byte a, byte b);

	//public byte[] getNums();

	/* Realiza la operación y retorna el valor.
	 * */
	public byte cuenta();

}

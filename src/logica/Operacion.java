package logica;

/*
 * Se espera de todas las operaciones que tengan un método para el cálculo y un vaor de retorno del tipo byte. Esto limitará a todo el sistema respecto al rango de valor que podrá manejar.
 * */
interface Operacion {

	/* Realiza la operación y retorna el resultado.
	 * */
	public byte cuenta();

}

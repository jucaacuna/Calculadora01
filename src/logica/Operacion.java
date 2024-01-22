package logica;

/*
 * Se debe contar con 3 variables de clase: operador1, operador2 y resultado. Ajustando su tipo según corresponda.
 * 
 * */
interface Operacion {

	
	/* Realiza la operación y asigna el resultado a una variable miembro de clase.
	 * */
	public void cuenta();
	
	/*
	 * Devuelve el resultado almacenado en la variable.
	 * */
	public Object getResultado();

}

/*
 *	CONSTANTES
 */
public class Constantes {
	
	public static final double VELOCIDAD_LUZ = 300_000;
	
	public static void main (String[] args) {
		
		final double PI = 3.14;
		//PI = 8; imposible cambiar el valor a una constante
		//VELOCIDAD_LUZ = 0; Tampoco se puede cambiar
		System.out.println("El valor del nº PI es " + PI);
		System.out.println("El valor de la velocidad de la luz es " + VELOCIDAD_LUZ);

	}
	
	public static void funcion () {
		//System.out.println("El valor del nº PI es " + PI); //no se ve en este ámbito
		System.out.println("El valor de la velocidad de la luz es " + VELOCIDAD_LUZ);

	}
}


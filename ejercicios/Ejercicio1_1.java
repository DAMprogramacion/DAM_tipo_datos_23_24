/*
 * EJERCICIO 1: convertir millas a kilómetros
 */


public class Ejercicio1_1{
	
	public static void main (String[] args) {
		
		float millasRecorridadas = 100;
		final float MILLAS_POR_KILOMETRO = 1.609F;
		double kilometrosRealizados = millasRecorridadas * MILLAS_POR_KILOMETRO;
		System.out.println( millasRecorridadas + " millas son " + kilometrosRealizados + " km");
	}
}


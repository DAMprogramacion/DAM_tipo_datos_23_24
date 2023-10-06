/*
 * EJERCICIO 1: convertir millas a kilómetros
 */


public class Ejercicio1_2{
	
	public static void main (String[] args) {
		
		double millasRecorridadas = 100;
		final double MILLAS_POR_KILOMETRO = 1.609F;
		
		float kilometrosRealizados = 
			(float) (millasRecorridadas * MILLAS_POR_KILOMETRO);
			
		System.out.println( millasRecorridadas + " millas son " + kilometrosRealizados + " km");
	}
}

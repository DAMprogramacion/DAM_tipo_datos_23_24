/*
 * Ejercicio 3.4, de la gravedad
 * Versión 2, usamos tipado de datos (int, double, ...)
 * Creamos un método para que realice el cálculo
 * Ese método lo vamos a llamar calcularAtraccionGravitatoria
 * se usan verbos para definir los métodos (calcular, esMayorDeEdad, deducir, etc)
 */


public class AtraccionGravitatoriaV2 {
	public static void main (String[] args) {
			
		System.out.println("ATRACCIÓN TIERRA-SOL");
		calcularAtraccionGravitatoria(5.97E24, 1.99E30, 150_000_000);
		System.out.println("ATRACCIÓN TIERRA-LUNA");
		calcularAtraccionGravitatoria(5.97E24, 7.35E22, 384_000);	
		System.out.println("ATRACCIÓN SOL-MERCURIO");
		calcularAtraccionGravitatoria(1.99E30, 3.285E23, 58_000_000);		
	}

    //cambio distanca a long, porque en el caso de planetas mas distantes el tipo int se nos queda corto
	public static void calcularAtraccionGravitatoria(double masa1, double masa2, long distancia) {
		final var GRAVITACION_UNIVERSAL = 6.67E-11;
		double atraccionGravitatoria = 
			GRAVITACION_UNIVERSAL * masa1 * masa2 / Math.pow (distancia, 2);
		System.out.println("La atracción vale " + atraccionGravitatoria + 'N');

	}
}

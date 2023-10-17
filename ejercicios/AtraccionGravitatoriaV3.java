 /* Creamos un método para que realice el cálculo
 * Ese método lo vamos a llamar calcularAtraccionGravitatoria
 * se usan verbos para definir los métodos (calcular, esMayorDeEdad, deducir, etc)
 * En esta clase el método calcularAtraccionGravitatoria también se le pase le mensaje:
 * ATRACCIÓN TIERRA-SOL, ATRACCIÓN TIERRA-LUNA o ATRACCIÓN SOL-MERCURIO
 */


public class AtraccionGravitatoriaV3 {
	public static void main (String[] args) {
			
		calcularAtraccionGravitatoria("ATRACCIÓN TIERRA-SOL: ", 5.97E24, 1.99E30, 150_000_000);
		calcularAtraccionGravitatoria("ATRACCIÓN TIERRA-LUNA: ", 5.97E24, 7.35E22, 384_000);	
		calcularAtraccionGravitatoria("ATRACCIÓN SOL-MERCURIO: ", 1.99E30, 3.285E23, 58_000_000);		
	}

    //cambio distanca a long, porque en el caso de planetas mas distantes el tipo int se nos queda corto
	public static void calcularAtraccionGravitatoria(String mensaje, double masa1, double masa2, long distancia) {
		final double GRAVITACION_UNIVERSAL = 6.67E-11;
		double atraccionGravitatoria = 
			GRAVITACION_UNIVERSAL * masa1 * masa2 / Math.pow (distancia, 2);
		System.out.println(mensaje + atraccionGravitatoria + 'N');

	}
}

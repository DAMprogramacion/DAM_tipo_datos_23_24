/*
 * Ejercicio 3.4, de la gravedad
 * Versión 1, donde usamos var (Java 17)
 * Esto no funciona en versiones inferiores
 */


public class AtraccionGravitatoriaV1 {
	public static void main (String[] args) {
		
		final var GRAVITACION_UNIVERSAL = 6.67E-11; //constante (final) inferencia de tipos: double por el literal 
		// double masa1, masa2, distancia; está permitido, pero vamos a usar var
		// var masa1, masa2, distancia; NO ESTÁ PERMITIDO, porque no hay literal, no se puede inferir el tipo
		//HACEMOS PRIMERO ATRACCIÓN TIERRA-SOL
		var masa1     = 5.97E24;      // masa de la Tierra
		var masa2     = 1.99E30;      // masa del Sol
		var distancia = 150_000_000;  // distancia Tierra-Sol
		var atraccionGravitatoria = 
			GRAVITACION_UNIVERSAL * masa1 * masa2 / Math.pow (distancia, 2);
		System.out.println("La atracción entre el Sol y la Tierra vale " + atraccionGravitatoria + 'N');
	
		//CÁLCULO DE ATRACCIÓN TIERRA-LUNA
		//aprovechamos masa1 porque la variable contiene el valor de la masa de la Tierra
		masa2     = 7.35E22;          // masa de la Luna
		distancia = 384_000;          // distancia Tierra-Luna
		atraccionGravitatoria = 
			GRAVITACION_UNIVERSAL * masa1 * masa2 / Math.pow (distancia, 2);
		System.out.println("La atracción entre la Luna y la Tierra vale " + atraccionGravitatoria + 'N');
		
		//NO LO PIDE EL EJERCICIO, ES UNA PARTE ADICIONAL QUE HEMOS AÑADIDO
		//ATRACCIÓN SOL-MERCURIO
		masa1     = 1.99E30;         // masa del Sol
		masa2     = 3.285E23;        // masa de Mercurio   
		distancia = 58_000_000;      // distancia Sol-Mercurio
		atraccionGravitatoria = 
			GRAVITACION_UNIVERSAL * masa1 * masa2 / Math.pow (distancia, 2);
		System.out.println("La atracción entre Mercurio y el Sol vale " + atraccionGravitatoria + 'N');
		
		
	}
}


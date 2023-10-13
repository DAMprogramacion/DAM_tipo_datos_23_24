/* Creamos una versión mimimalista
* A este proceso se le llama REFACTORIZACIÓN
* lo vamos a hacer bastante a lo largo del curso
* Se hace siempre
* No declaramos ni la constante GRAVITACION_UNIVERSAL ni la variable atraccionGravitatoria
* lo hacemos TODO dentro del System.out.println
*/


public class AtraccionGravitatoriaV4 {
	public static void main (String[] args) {
			
		calcularAtraccionGravitatoria("ATRACCIÓN TIERRA-SOL: ", 5.97E24, 1.99E30, 150_000_000);
		calcularAtraccionGravitatoria("ATRACCIÓN TIERRA-LUNA: ", 5.97E24, 7.35E22, 384_000);	
		calcularAtraccionGravitatoria("ATRACCIÓN SOL-MERCURIO: ", 1.99E30, 3.285E23, 58_000_000);		
	}

	public static void calcularAtraccionGravitatoria(String mensaje, double masa1, double masa2, long distancia) {
		
		System.out.println(mensaje + (6.67E-11 * masa1 * masa2 / Math.pow (distancia, 2)) + 'N');
	}
}

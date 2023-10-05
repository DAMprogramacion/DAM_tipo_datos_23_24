//EJERCICIO 0



public class Ejercicio0 {
	
	public static void main (String[] args) {
		
		final int VELOCIDAD_LUZ     = 300_000;  // km/s constante (final)
		float notaCursoActual       = 3.5F; // también encaja un double
		boolean perteneceEspannaUE  = true;
		short equiposAula_1_8       = 20;  //un int tampo está mal
		double moneda               = 35;
		double cifra                = Math.pow(2,65); 
		
		System.out.println("Velocidad de la luz: " + VELOCIDAD_LUZ + " km/s");
		System.out.println("Nota actual: " + notaCursoActual);
		System.out.println("¿Pertenence España a la UE? " + perteneceEspannaUE);
		System.out.println("Nº equipos en el aula: " + equiposAula_1_8);
		System.out.println("Valor de moneda: " + moneda + " $");
		System.out.println("Cifra: " + cifra);
				
	}
}


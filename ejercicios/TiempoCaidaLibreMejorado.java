/*
 * Programa que calcula el tiempo en caer un cuerpo 
 * desde una altura dada.
 */


public class TiempoCaidaLibreMejorado {
	
	 
	public static void main (String[] args) {
	
		float altura;
		
		altura = 1;
		mostrarTiempoCaida(altura);
	
		altura = 2.5F;
		mostrarTiempoCaida(altura);
		
		altura = 22.5F;
		mostrarTiempoCaida(altura);
		
	}

    public static void mostrarTiempoCaida(float altura) {
		
		final float CONSTANTE_GRAVEDAD =  9.8F;
		float tiempo = (float) Math.sqrt(2 * altura / CONSTANTE_GRAVEDAD);
		System.out.println(
		    "Un cuerpo que cae desde una altura " + altura + "m tarda en caer " + tiempo + 's');
	}

}

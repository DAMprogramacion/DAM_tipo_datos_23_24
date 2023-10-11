/*
 * Programa que calcula el tiempo en caer un cuerpo 
 * desde una altura dada.
 */


public class TiempoCaidaLibre {
	
	public static void main (String[] args) {
		
		final float CONSTANTE_GRAVEDAD =  9.8F;
		float altura = 1;
		float tiempo = (float) Math.sqrt(2 * altura / CONSTANTE_GRAVEDAD);
		System.out.println(
		    "Un cuerpo que cae desde una altura " + altura + "m tarda en caer " + tiempo + 's');
	
		altura = 2.5F;
		tiempo = (float) Math.sqrt(2 * altura / CONSTANTE_GRAVEDAD);
		System.out.println(
		    "Un cuerpo que cae desde una altura " + altura + "m tarda en caer " + tiempo + 's');
	}
}


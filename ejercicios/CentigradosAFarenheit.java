/*
 Convertir grados centígrados a 
 * grados Farenheit 
 */


public class CentigradosAFarenheit {
	
	public static void main (String[] args) {
		
		int gradosCentigrados = 25;
		int gradosFarenheit = (int) (gradosCentigrados * 9.0 / 5 + 32);
		System.out.print(gradosCentigrados + "ºC son " + gradosFarenheit + "ºF\n"); 
		
	}
}


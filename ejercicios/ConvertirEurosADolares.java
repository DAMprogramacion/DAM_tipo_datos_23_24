/*
 Programa que convierte euros a dolares 
 */

public class ConvertirEurosADolares {
	
	public static void main (String[] args) {
		
		final float EUROS_A_DOLARES = 1.06F;
		float euros = 25.2F;
		float dolares = euros * EUROS_A_DOLARES;
		System.out.println(euros + "€ son " + dolares + '$'); 		
	}
}


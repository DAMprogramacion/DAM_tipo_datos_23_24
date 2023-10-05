/*
 Ejercicio de literales, sobre todo
 * binario, octal y hexadecimal
 */


public class Literales {
	
	public static void main (String[] args) {
		
		char variableCaracter    = 'a';
		boolean variableBoolean  = true;
		byte variableByte        = 100;
		short variableShort      = 1_000;
		int variableInt          = 1_000_000_000;
		long variableLong        = 1_000_000_000_000L;
		float variableFloat      = 2.5F;
		double variableDouble    = 2.5e-15;
		
		int variableLiteralBinario     = 0b111111;
		System.out.println("valor 1: " + variableLiteralBinario);
		int variableLiteralOctal       = 017;
		System.out.println("valor 2: " + variableLiteralOctal);
		int variableLiteralHexadecimal = 0x12f;
		System.out.println("valor 3: " + variableLiteralHexadecimal);
		
		String cadena = "hola mundo";


	}
}


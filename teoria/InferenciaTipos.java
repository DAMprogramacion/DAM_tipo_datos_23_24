/*
 * INFERENCIA DE TIPOS EN JAVA 10
 */


public class InferenciaTipos{
	
	public static void main (String[] args) {
		
		int numero1 = 12;
		var numero2 = 13.3;
		var numero3 = 12.2F;
		numero3 = (float) numero2; //numero2 inferido como double, numero3 como float
		var caracter = 'a';
		var cadena   = "hola";
		
	}
}


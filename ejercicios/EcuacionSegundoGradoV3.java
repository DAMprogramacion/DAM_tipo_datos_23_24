/*
 * Refactorizando, versión minimalista
*/


 //PENDIENTE PARA HACER EN CASA, CORREGIMOS EL MARTES 17 DE OCTUBRE

public class EcuacionSegundoGradoV3 {
	
	public static void main (String[] args) {
		//Primera ecuación 3 · x² -15 · x + 5 = 0
		calcularEcuacionSegundoGrado("3 · x² -15 · x + 5 = 0", 3, -15, 5);
		
		//Segunda ecuación -5 · x² + x - 3 = 0
		calcularEcuacionSegundoGrado("-5 · x² +x - 3 = 0", -5, 1, -3 );
		
		//Terecera ecuación -5 · x² + x + 3 = 0
		calcularEcuacionSegundoGrado("-5 · x² +x + 3 = 0", -5, 1, 3);
	}
	//MÉTODO QUE RESUELVA LA ECUACIÓN Y MUESTRE LOS DATOS
	public static void calcularEcuacionSegundoGrado(String mensaje, int a, int b, int c) {
		System.out.println(mensaje + "\nX1: " + (-b + Math.sqrt(b * b - 4 * a *c) / (2 * a)) +
		 ", X2: " + (-b - Math.sqrt(b * b - 4 * a *c) / (2 * a)) + '\n');
	}
}

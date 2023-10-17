/*
 * VERSION 2
 * Usando métodos
*/

 //PENDIENTE PARA HACER EN CASA, CORREGIMOS EL MARTES 17 DE OCTUBRE

public class EcuacionSegundoGradoV2 {
	
	public static void main (String[] args) {
		//Primera ecuación 3 · x² -15 · x + 5 = 0
		int a = 3, b = -15, c = 5;
		String mensaje = "3 · x² -15 · x + 5 = 0";
		calcularEcuacionSegundoGrado(mensaje, a, b, c);
		
		//Segunda ecuación -5 · x² +x - 3 = 0
		a = -5; b = 1; c = -3;
		mensaje = "-5 · x² +x - 3 = 0";
		calcularEcuacionSegundoGrado(mensaje, a, b, c );
		
		//Terecera ecuación -5 · x² +x + 3 = 0
		a = -5; b = 1; c = +3;
		mensaje = "-5 · x² +x + 3 = 0";
		calcularEcuacionSegundoGrado(mensaje, a, b, c);
		
	}
	
	//MÉTODO QUE RESUELVA LA ECUACIÓN Y MUESTRE LOS DATOS
	public static void calcularEcuacionSegundoGrado(String mensaje, int a, int b, int c) {
		float x1 = (float) (-b + Math.sqrt(b * b - 4 * a *c) / (2 * a));
		float x2 = (float) (-b - Math.sqrt(b * b - 4 * a *c) / (2 * a));
		System.out.println(mensaje);
		System.out.println("X1: " + x1 + ", X2: " + x2 + '\n');
	}
}

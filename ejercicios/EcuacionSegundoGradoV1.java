/*
 * En este ejercicio vamos a resolver ecuaciones de segundo grado
 * a·x² + b·x + c = 0
 * x = (-b +- sqrt(b² - 4·a·c)) / 2·a (En caso de duda miramos Internet)
 * Las variables son a, b y c
 * ¿Qué tipo?  Lo suyo sería double y admitiría cualquier tipo de número
 * EN ESTE EJERCICO SOLO TRABAJAMOS CON Nº ENTEROS, LA SOLUCIÓN LA QUIERO DE TIPO FLOAT
 * Tiene dos soluciones, una sumando y otra restando (+-) que aparece en la ecuación 
 * VERSIÓN 1: sin usar un método que haga el cálculo
 */
 
 
 //PENDIENTE PARA HACER EN CASA, CORREGIMOS EL MARTES 17 DE OCTUBRE


public class EcuacionSegundoGradoV1 {
	
	public static void main (String[] args) {
		
		//Resolvemos por lo menos tres ecuaciones
		
		//Primera ecuación 3 · x² -15 · x + 5 = 0
		int a = 3, b = -15, c = 5;
		float x1 = (float) (-b + Math.sqrt(b * b - 4 * a *c) / (2 * a));
		float x2 = (float) (-b - Math.sqrt(b * b - 4 * a *c) / (2 * a));
		System.out.println("Ecuación: 3 · x² -15 · x + 5 = 0");
		System.out.println("X1: " + x1 + ", X2: " + x2 + '\n');
		
		//Segunda ecuación -5 · x² +x - 3 = 0
		a = -5; b = 1; c = -3;
		x1 = (float) (-b + Math.sqrt(b * b - 4 * a *c) / (2 * a));
		x2 = (float) (-b - Math.sqrt(b * b - 4 * a *c) / (2 * a));
		System.out.println("Ecuación: -5 · x² +x -3 = 0");
		System.out.println("X1: " + x1 + ", X2: " + x2 + '\n');
		
		//Terecera ecuación -5 · x² +x + 3 = 0
		a = -5; b = 1; c = +3;
		x1 = (float) (-b + Math.sqrt(b * b - 4 * a *c) / (2 * a));
		x2 = (float) (-b - Math.sqrt(b * b - 4 * a *c) / (2 * a));
		System.out.println("Ecuación: -5 · x² +x + 3 = 0");
		System.out.println("X1: " + x1 + ", X2: " + x2 + '\n');
		
	}
}


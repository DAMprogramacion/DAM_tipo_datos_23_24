// Programa para evaluar la precisión 
//de variables en coma flotante
 


public class Precision {
	
	public static void main (String[] args) {
		
		double precioUnitario = 4.35;
		double cantidad       = 100;
		System.out.println("Precio total " + precioUnitario * cantidad);
		System.out.printf("Precio total %.1f%n", precioUnitario * cantidad);
		
	}
}


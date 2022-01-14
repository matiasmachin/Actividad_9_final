package Actividad_9_Ejercicios;

public class Ejercicio_3 {
	/*. Crear un método llamado imprimirPares() que imprima los números pares que existen del 1 al 20.
	 * 
	 */

	public static void main(String[] args) {
		// Declarar variables
		int num=0;
		System.out.println("Los números pares entre el 1 y el 20 son:\n");
		for(int i=1;i<=20;i++) {
			if (i % 2 == 0){
				num=i;
				imprimirPares(num);
			}
		}

	}

	public static int imprimirPares(int num1){
			System.out.println("El numero: "+ num1 +"Es par");
			return num1;
		
		}
		
}


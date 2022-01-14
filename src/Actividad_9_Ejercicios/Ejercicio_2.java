package Actividad_9_Ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
	/*Crear un método llamado sumarNumeros() que llamaremos	desde el método main()
	 *  y que obtenga el sumatorio entre los números 1	y n, siendo n un número entero introducido por teclado.
	 *   El número n ha	de pasarse como parámetro al método _sumarNumeros().
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Introduzca un número N: ");
		Scanner Lectura= new Scanner(System.in);
		num= Lectura.nextInt();
		System.out.println("La sumatoria de los números de 1 hasta " + num + " es: " + sumarNumeros(num));	
		Lectura.close();
	}

	public static int sumarNumeros(int numero) {
		int suma=0;
		for(int i=1;i<=numero; i++) {
			suma=suma+i;
		
		}
		return suma;
	}
}

package Actividad_9_Ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
	/*Crear un m�todo llamado sumarNumeros() que llamaremos	desde el m�todo main()
	 *  y que obtenga el sumatorio entre los n�meros 1	y n, siendo n un n�mero entero introducido por teclado.
	 *   El n�mero n ha	de pasarse como par�metro al m�todo _sumarNumeros().
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Introduzca un n�mero N: ");
		Scanner Lectura= new Scanner(System.in);
		num= Lectura.nextInt();
		System.out.println("La sumatoria de los n�meros de 1 hasta " + num + " es: " + sumarNumeros(num));	
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

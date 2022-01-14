package Actividad_9_Ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
	/*Crear un método llamado imprimirImpares() que imprima los números impares que existen del 1 al 20. Aparte, crear un menú para
	permitir al usuario si quiere imprimir los números impares del 1 al 20 o si por el contrario desea imprimir los números pares del 1 al 20 mediante
	el método desarrollado en el Ejercicio 3.
		 */

	public static void main(String[] args) {
		// Declaracion de variales
		boolean bandera=true;
		int opcion;
		while(bandera!=false) {
			System.out.println("MENÚ:");
			System.out.println("1.- Imprimir numeros pares del 1 al 20 ");
			System.out.println("2.- Imprimir numeros impares del 1 al 20 ");
			System.out.println("0.- Salir: ");
			System.out.println("Elija una opción: ");
			Scanner Lectura= new Scanner(System.in);
			opcion= Lectura.nextInt();
			switch(opcion){
			case 0: 
				bandera=false;
				System.out.println("Gracias por utilizar este programa ");
				break;
			case 1:
				int num=0;
				System.out.println("Los números pares entre el 1 y el 20 son:\n");
				for(int i=1;i<=20;i++) {
					if (i % 2 == 0){
						num=i;
						imprimirPares(num);
					}
				}
				break;
			case 2:
				int num1=0;
				System.out.println("Los números impares entre el 1 y el 20 son:\n");
				for(int i=1;i<=20;i++) {
					if (i % 2 != 0){
						num1=i;
						imprimirImpares(num1);
					}
				}
				break;


			}
		}
}
			public static int imprimirImpares(int num1){
				System.out.println("El numero: "+ num1 +" Es Impar\n");
				return num1;
			
			}
			public static int imprimirPares(int num1){
				System.out.println("El numero: "+ num1 +" Es Par\n");
				return num1;
			
			}

		}

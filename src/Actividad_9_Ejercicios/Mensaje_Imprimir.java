package Actividad_9_Ejercicios;

import java.util.Scanner;



public class Mensaje_Imprimir {

	public static void main(String[] args) {
		//Declaracion de variables
	  
		String mensaje="";
		System.out.println(" Mensaje enviado por el usuario es: \n\n" + imprimirMensaje(mensaje));
		

	}


	private static String imprimirMensaje(String mensaje) {
		System.out.println("Introduzca el Mensaje a Enviar:\n");
		Scanner Lectura3=new Scanner(System.in);
		String mensaje2 = Lectura3.nextLine();
		Lectura3.close();
		return mensaje2;
	}



}
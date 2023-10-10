package ahorcado.reyes;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		String letra;
		String[] palabras= {"Perro", "Raton", "Pollo", "Silla", "Bicha"};
		String palabraEscogida;
		byte vidas=0;
		
		
		
		System.out.println("Vamos a jugar al a ahorcado. En este juego tendras 5"
				+ " vidas para tratar de adivinar la palabra oculta. Buena suerte.");
		
		
		for(byte i=0; vidas<=4; i++) {
		System.out.println("Escribe una letra a ver si esta.");
		letra=sc.nextLine();
		vidas++;
		}
		
		if(vidas>=4) {
			System.out.println("Has perdido. Inténtalo otra vez.");
		}if (palabraEscogida=("Perro"||"Raton"||"Pollo"||"Silla"||"Bicha")) {
			System.out.println("Acertaste.");
		}
		
		//if (palabraEscogida.contains(letra)) {
			
		//};
		
		sc.close();
	}

}

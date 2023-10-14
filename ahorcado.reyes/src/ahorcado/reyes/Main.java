package ahorcado.reyes;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String letter;
		String[] words = { "spider", "frog", "chicken", "shark", "pangolin" };
		byte lives = 5;
		String chosenWord = words[r.nextInt(0, 4)];
		String[] gap = new String[chosenWord.length()];

		for (byte i = 0; chosenWord.length() > i; i++) {
			gap[i] = "_ ";
		}

		System.out.println("Vamos a jugar al a ahorcado. En este juego tendrás 5"
				+ " vidas para tratar de adivinar la palabra oculta. Buena suerte.");

		for (byte i = 0; gap.length > i; i++) {
			System.out.print(gap[i]); // Esto es para imprimir los huecos
		}
		// for(byte i=0; lives<=4; i++) {
		System.out.println("\nEscribe una letra a ver si está.");
		letter = sc.nextLine().toLowerCase(); //escribe en minúscula todo
		if (chosenWord.contains(letter)) {
			for (byte i = 0; chosenWord.length() > i; i++) {
				if (chosenWord.charAt(i) == letter.charAt(0)) {
					gap[i] = letter + " "; // Esto es para que no se empiece a pegar la palabra
				}
			}
			for (byte i = 0; gap.length > i; i++) {
				System.out.print(gap[i]);
			}
		} else {
			lives--;

		}

		sc.close();
	}

}

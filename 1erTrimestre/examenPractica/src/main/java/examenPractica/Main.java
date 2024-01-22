package examenPractica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreCompeticion;
		Scanner sc = new Scanner(System.in);

		System.out.println("¡Hola, vamos a crear una competición ciclista! ¿Qué nombre te gustaría que tuviera? "
				+ "\nEs importante que empiece por Vuelta y que el nombre tenga al menos dos espacios. "
				+ "\nSi intentas trolear, te volveré a preguntar varias veces, así que sé bueno :)");
		do {
			nombreCompeticion = sc.nextLine();
			if (nombreCompeticion.startsWith("Vuelta") && (nombreCompeticion.split(" ").length > 2)) {
				System.out.println("Este me gusta.");
			} else {
				System.out.println("Nop, pon otro, anda.");
			}

		} while (!nombreCompeticion.startsWith("Vuelta") || !(nombreCompeticion.split(" ").length > 2));

		nombreCompeticion=nombreCompeticion.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I")
				.replaceAll("o", "O").replaceAll("u", "U").replaceAll("á", "Á").replaceAll("é", "É")
				.replaceAll("í", "Í").replaceAll("ó", "Ó").replaceAll("ú", "Ú");
		
		System.out.println("Al final nos ha quedado el nombre "+nombreCompeticion);
		
		
	}

}

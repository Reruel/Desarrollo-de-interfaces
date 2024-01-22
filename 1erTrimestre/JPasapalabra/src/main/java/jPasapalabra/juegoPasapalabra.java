package jPasapalabra;

import java.util.Scanner;

public class juegoPasapalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		
		//En esta matriz incluimos la letra de la pregunta, la definición y la respuesta.
		String[][] infoJuego = {
				{ "a", "Planta comestible con tallos blancos y hojas verdes. También está en la ducha", "alcachofa" },
				{ "b", "Caja en la que se guardan medicinas.", "botiquin" },
				{ "c", "Cama en la que se llevan de un lado a otro heridos o enfermos", "camilla" },
				{ "d", "Palabras que se escriben y se dicen como regalo a alguien", "dedicatoria" },
				{ "e", "Mancharse un cristal con el vapor de agua.", "empañar" },
				{ "f", "Cuento en el que los personajes son animales, con el que se aprende algo a "
						+ "través de una moraleja.", "fabula" },
				{ "g", "Preparar alimentos cocinándolos con calor", "guisar" }
				// Qué pereza. Continuará... que me quedan 2 horas para entregarlo.
		};
		//En este byte guardamos la puntuación.
		byte puntuacion = 0;
		//En este byte guardamos el número de preguntas que hay en el juego. Está hecho así por si se modifica y se añaden más.
		byte preguntasTotales = (byte) infoJuego.length;
		
		System.out.println("Bienvenido al juego de Pasapalabra. " + "\n-Si aciertas una pregunta, se sumará un punto. "
				+ "\n-Si fallas, se te restará."
				+ "\n-Si no lo sabes y no te la quieres jugar, sé prudente y ¡pasapalabra!");

		//Bucle de juego donde defino los 3 componentes de la matriz y se van sucediendo las preguntas y cotejando
		//con las respuestas. También se actualiza la puntuación.
		for (String[] datos : infoJuego) {
			String letra = datos[0];
			String definicion = datos[1];
			String respuestaCorrecta = datos[2];

			System.out.println("\nDefinición: " + definicion);
			System.out.print(
					"¿Adivinas la palabra que comienza con '" + letra + "'? (Escribe la respuesta o 'pasapalabra'): ");
			String respuesta = scanner.nextLine().trim().toLowerCase();

			if (respuesta.equals(respuestaCorrecta)) {
				System.out.println("¡Correcto!");
				puntuacion++;
			} else if (respuesta.equals("pasapalabra")) {
				System.out.println("Has pasado la palabra. La respuesta correcta era: " + respuestaCorrecta);
			} else {
				System.out.println("Incorrecto. La respuesta correcta es: " + respuestaCorrecta);
				puntuacion--;
			}
		}

		System.out.println("Fin del juego. Puntuación final: " + puntuacion + " de " + preguntasTotales);

	}

}

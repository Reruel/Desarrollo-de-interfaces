package ejercicio4y5;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.Button;

public class Controller4 {
	
	@FXML
	private Button boton1, boton2, boton3, boton4;
	
	@FXML
	private void pulsame2(ActionEvent event) {
		String idBotonPulsado = ((Button) event.getSource()).getId();
		System.out.println("Botón pulsado: " + idBotonPulsado);
		
		
		//El swich es para meterle más funcionalidad, pero ambas cosas hacen lo mismo en este código.
		switch (idBotonPulsado) {
		case "Pulsame1":
			System.out.println("¡Has pulsado el botón 1!");
			break;
		case "Pulsame2":
			System.out.println("¡Has pulsado el botón 2!");
			break;
		case "Pulsame3":
			System.out.println("¡Has pulsado el botón 3!");
			break;
		case "Pulsame4":
			System.out.println("¡Has pulsado el botón 4!");
			break;
		}
	}
}
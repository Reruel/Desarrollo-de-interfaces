package ejercicio4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField importeTextField;
	@FXML
	private Label resultadoLabel;

	@FXML
	private void iva4() {
		// Lógica para hacer el iva al 4%
		double operando = Double.parseDouble(importeTextField.getText());
		double resultado = operando + operando*0.04;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML
	private void iva10() {
		// Lógica para hacer el iva al 10%
		double operando = Double.parseDouble(importeTextField.getText());
		double resultado = operando + operando*0.10;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML
	private void iva21() {
		// Lógica para hacer el iva al 21%
		double operando = Double.parseDouble(importeTextField.getText());
		double resultado = operando + operando*0.21;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML

	private void limpiar() {
	// Lógica para limpiar los campos
		importeTextField.clear();
		importeTextField.clear();
	resultadoLabel.setText("Resultado: ");
	}

	@FXML
	private void salir() {
		// Lógica para cerrar la aplicación
		System.exit(0);

	}
}
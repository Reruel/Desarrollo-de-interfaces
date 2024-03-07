package ejercicio10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio10 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Parent root = FXMLLoader.load(getClass().getResource("Ej10.fxml"));
		primaryStage.setTitle("Mi Aplicación JavaFX");
		primaryStage.setScene(new Scene(root, 700, 500));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}
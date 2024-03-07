module proyectoHilosInterfaces {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ejercicioHilo to javafx.graphics, javafx.fxml;

}

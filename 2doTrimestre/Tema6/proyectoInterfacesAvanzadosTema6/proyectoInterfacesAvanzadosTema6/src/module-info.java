module proyectoInterfacesAvanzadosTema6 {
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ej1 to javafx.graphics, javafx.fxml;
}

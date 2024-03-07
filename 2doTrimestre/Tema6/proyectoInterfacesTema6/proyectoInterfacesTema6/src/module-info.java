module proyectoInterfacesTema6 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ej1 to javafx.graphics, javafx.fxml;
	opens ej2 to javafx.graphics, javafx.fxml;
	opens ej3 to javafx.graphics, javafx.fxml;
	opens ej4 to javafx.graphics, javafx.fxml;
}

module JavaFXBBDD {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.base;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ej1 to javafx.graphics, javafx.fxml;
	opens ej2 to javafx.graphics, javafx.fxml;
	opens ej3 to javafx.graphics, javafx.fxml;
	opens ej4 to javafx.graphics, javafx.fxml;
}

package ej2;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.SQLException;
import java.util.List;

public class Controller {

    @FXML
    private TableView<Productos> tableViewVideojuegos;

    @FXML
    private TableColumn<Productos, Integer> codigoColumn;
    
    @FXML
    private TableColumn<Productos, String> nombreColumn;

    @FXML
    private TableColumn<Productos, Double> precioColumn;
    
    @FXML
    private TableColumn<Productos, Integer> codigoFColumn;


    private ProductosModel model;

    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new ProductosModel(dbURL, dbUser, dbPassword);

        // Configura las columnas de la TableView utiliza instrucciones tipo lambda, cada columna de la tabla le //corresponde un campo de la base de datos
        codigoColumn.setCellValueFactory(cellData -> cellData.getValue().codigoProperty().asObject());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        precioColumn.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
        codigoFColumn.setCellValueFactory(cellData -> cellData.getValue().codigoProperty().asObject());
      

        // Al inicializar el controlador, carga los juegos desde la base de datos
        try {
            cargarJuegos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cargarJuegos() throws SQLException {
        // Limpiar la TableView antes de cargar nuevos datos
        tableViewVideojuegos.getItems().clear();

        List<Productos> productos = model.getAllVideoJuegos();
    
        // Agrega los datos a la TableView
        tableViewVideojuegos.getItems().addAll(productos);
    }

    @FXML
    private void cerrarConexion() {
        // Cierra la conexión a la base de datos
        try {
            model.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

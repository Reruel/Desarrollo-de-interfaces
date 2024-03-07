package ej2;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.SQLException;
import java.util.List;


public class Controller {


    @FXML
    private TableView<Producto> tableProducto;


    @FXML
    private TableColumn<Producto, Integer> codigoColumn;
    
    
    @FXML
    private TableColumn<Producto, String> nombreColumn;


    @FXML
    private TableColumn<Producto, Double> precioColumn;


    @FXML
    private TableColumn<Producto, Integer> codigo_fabColumn;



    private ProductoModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new ProductoModel(dbURL, dbUser, dbPassword);


        // Configura las columnas de la TableView utiliza instrucciones tipo lambda, cada columna de la tabla le //corresponde un campo de la base de datos
        codigoColumn.setCellValueFactory(cellData -> cellData.getValue().getCodigo().asObject());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().getNombre());
        precioColumn.setCellValueFactory(cellData -> cellData.getValue().getPrecio().asObject());
        codigo_fabColumn.setCellValueFactory(cellData -> cellData.getValue().getCodigo_fab().asObject());


        // Al inicializar el controlador, carga los juegos desde la base de datos
        try {
            cargarJuegos();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void cargarJuegos() throws SQLException {
        // Limpiar la TableView antes de cargar nuevos datos
    	tableProducto.getItems().clear();


        List<Producto> productos = model.getAllProductos();
    
        // Agrega los datos a la TableView
        tableProducto.getItems().addAll(productos);
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
package ej1;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.SQLException;
import java.util.List;

public class Controller {

    @FXML
    private TableView<Alumno> tableViewVideojuegos;
    
    @FXML
    private TableColumn<Alumno, Integer> idColumn;

    @FXML
    private TableColumn<Alumno, String> nombreColumn;

    @FXML
    private TableColumn<Alumno, String> apellido1Column;
    @FXML
    private TableColumn<Alumno, String> apellido2Column;
    @FXML
    private TableColumn<Alumno, String> fechaColumn;
    @FXML
    private TableColumn<Alumno, String> esrepetidorColumn;
    @FXML
    private TableColumn<Alumno, String> telefonoColumn;

    private AlumnoModel model;

    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new AlumnoModel(dbURL, dbUser, dbPassword);

        // Configura las columnas de la TableView utiliza instrucciones tipo lambda, cada columna de la tabla le //corresponde un campo de la base de datos
        idColumn.setCellValueFactory(cellData -> cellData.getValue().getId().asObject());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().getNombre());
        
        apellido1Column.setCellValueFactory(cellData -> cellData.getValue().getApellido1());
        apellido2Column.setCellValueFactory(cellData -> cellData.getValue().getApellido2());
        fechaColumn.setCellValueFactory(cellData -> cellData.getValue().getFecha_nacimiento());
        esrepetidorColumn.setCellValueFactory(cellData -> cellData.getValue().getEs_repetidor());
        telefonoColumn.setCellValueFactory(cellData -> cellData.getValue().getTelefono());

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

        List<Alumno> alumnos = model.getAllAlumnos();
    
        // Agrega los datos a la TableView
        tableViewVideojuegos.getItems().addAll(alumnos);
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

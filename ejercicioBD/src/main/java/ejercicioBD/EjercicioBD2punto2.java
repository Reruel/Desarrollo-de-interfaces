package ejercicioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjercicioBD2punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		Statement stmt = null;
		String sql = "INSERT INTO clientes (id, nif, nombre, edad) VALUES (1, '12345678', 'Reyes', '31')";

		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "admin");
			stmt = conect.createStatement();
			stmt.execute(sql);
			System.out.println("Cliente insertado correctamente");
		} catch (SQLException e) {
			System.out.println("Fallo en la inserción del cliente");
			e.printStackTrace();
		}
	}

}

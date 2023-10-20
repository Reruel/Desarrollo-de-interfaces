package ejercicioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjercicioBD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		Statement stmt = null;
		String sql="CREATE TABLE clientes (id INT PRIMARY KEY,"
		+"nif VARCHAR(10) NOT NULL,"
		+"nombre VARCHAR(60) NOT NULL,"
		+"edad VARCHAR(2))";
		
		sql="CREATE TABLE producto (id INT PRIMARY KEY,"
				+"nombre VARCHAR(60) NOT NULL,"
				+"descripcion VARCHAR(100) NOT NULL,"
				+"cantidad INT)";
		
		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "admin");
			stmt=conect.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla producto");
		} catch (SQLException e) {
			System.out.println("Fallo de en la creación de tabla");
			e.printStackTrace();
		}
	}
}

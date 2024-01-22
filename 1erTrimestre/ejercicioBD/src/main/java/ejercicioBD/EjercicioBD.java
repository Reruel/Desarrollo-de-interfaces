package ejercicioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjercicioBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		Statement stmt = null;
		String sql="CREATE DATABASE empresa";
		
		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/phoneland", "root", "admin");
			stmt=conect.createStatement();
			stmt.execute(sql);
			
			if (conect != null) {
				System.out.println("Conexión a base de datos correcta");
				conect.close();
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println("Fallo de conexión");
		}
	}
}

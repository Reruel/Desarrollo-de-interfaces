package ejercicioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class EjercicioBD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		Statement stmt = null;
		String sql = "SELECT * FROM clientes";
		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "admin");
			stmt = conect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nif = rs.getString("nif");
				String nombre = rs.getString("nombre");
				String edad = rs.getString("edad");
				System.out.println("id: " + id + ", nif: " + nif + " , nombre: " + nombre + " , edad: " + edad);

			}
			conect.close();
			stmt.close();
			rs.close();

		} catch (SQLException e) {
			System.out.println("K paza");
			e.printStackTrace();
		}
	}
}
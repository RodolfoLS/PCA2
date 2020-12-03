package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	static Connection conn;
	ResultSet rs;
	
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USER ="postgres";
	private final static String PASS = "160196";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
		Class.forName("org.postgresql.Driver");
		conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("Conectado com sucesso!");
	}catch (SQLException e) {
		System.out.println("Erro - Conexão"+e.getMessage());
	}catch(ClassNotFoundException e) {
		System.out.println("Erro - Driver"+e.getMessage());
	}return conn;
	}


	public static void main(String[] args) {
		Dao.getConnection();
	}
}

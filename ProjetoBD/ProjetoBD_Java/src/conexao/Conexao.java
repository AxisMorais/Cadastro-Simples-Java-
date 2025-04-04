package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

private static final String url = "jdbc:mysql://localhost:3306/bd_teste";
private static final String user="root";
private static final String password ="150589";

private static Connection conn;

public static Connection getConexao() {
    try {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Adicionado corretamente
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conectado ao banco de dados!");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver JDBC não encontrado!");
                e.printStackTrace();
            }
        }
        return conn;
    } catch (SQLException e) {
        System.out.println("Erro ao conectar ao banco de dados!");
        e.printStackTrace();
        return null;
    }
}
	


}

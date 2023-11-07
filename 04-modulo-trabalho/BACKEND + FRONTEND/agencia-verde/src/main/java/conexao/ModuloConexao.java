package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModuloConexao {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/verdedb";
    private static final String USER = "dba";
    private static final String PASSWORD = "@123456@";

    private static Connection conexao;

    public static Connection conector() {
        try {
            if (conexao == null || conexao.isClosed()) {
                Class.forName(DRIVER); // Register the driver
                conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

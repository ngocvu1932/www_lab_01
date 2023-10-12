package vn.edu.iuh.fit.www_lab_week_01.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    private static Connection connection;

    private static void createConnection() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/mydb?createDatabaseIfNotExist= true";
            connection = DriverManager.getConnection(url, "root", "sapassword");

        } catch ( Exception e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection() {
        if (connection == null)
            createConnection();
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

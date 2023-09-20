package vn.edu.iuh.fit.week1.repositories;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class connectDB {
    private  Connection connection;

    public connectDB(){
        try{
            Class.forName("\"org.mariadb.jdbc.Driver\"");
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mydb","root","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeConnection() throws SQLException {connection.close();}
}

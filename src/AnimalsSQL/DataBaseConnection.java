package AnimalsSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private final Connection connection;
    private String getIp() {return "localhost";}
    private String getUid() {
        return "root";
    }
    private String getPass() {
        return "root";
    }
    private String getBase() {
        return "animals";
    }
    public Connection getConnection() {
        return connection;
    }
    public DataBaseConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://"+getIp()+"/"+getBase(),getUid(),getPass());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
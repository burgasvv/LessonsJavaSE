package BullsCowsSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final Connection connection;
    public DBConnection() {
        String connect = "jdbc:mysql://"+getIp()+"/"+getBase();
        try {
            connection = DriverManager.getConnection(connect,getUid(),getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public String getIp() {
        return "localhost";
    }
    public String getBase() {
        return "bullscows";
    }
    public String getUid() {
        return "root";
    }
    public String getPassword() {
        return "root";
    }
}
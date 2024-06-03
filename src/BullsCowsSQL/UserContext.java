package BullsCowsSQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserContext {
    private final DBConnection connection;
    public UserContext() {
        connection = new DBConnection();
    }
    public void insert(User user){
        try {
            String query = "INSERT INTO hiscores(name, score) VALUES (?,?)";
            PreparedStatement statement = connection.getConnection().prepareStatement(query);
            statement.setString(1,user.getName());
            statement.setInt(2,user.getScore());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(int id){
        try {
            String query = "DELETE FROM hiscores WHERE id=?";
            PreparedStatement statement = connection.getConnection().prepareStatement(query);
            statement.setInt(1,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<User>select(String[]p){
        ArrayList<User>users = new ArrayList<>();
        try {
            PreparedStatement statement =
                    connection.getConnection().
                            prepareStatement("SELECT * FROM hiscores WHERE 1" + " and " + p[0] + p[1] + p[2]);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
                users.add(new User(resultSet.getInt(1),
                        resultSet.getNString(2), resultSet.getInt(3)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
    public ArrayList<User>sort(){
        ArrayList<User>users = new ArrayList<>();
        try {
            PreparedStatement statement =
                    connection.getConnection().
                            prepareStatement("SELECT name, score FROM hiscores ORDER BY score");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
                users.add(new User(resultSet.getNString(1), resultSet.getInt(2)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
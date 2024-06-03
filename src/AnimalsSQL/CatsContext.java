package AnimalsSQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CatsContext {
    DataBaseConnection connection;
    public CatsContext() {
        connection = new DataBaseConnection();
    }
    public void insert(Cat cat){
        try {
            String query = "INSERT INTO cats (name, age, breed) VALUES (?,?,?)";
            PreparedStatement statement = connection.getConnection().prepareStatement(query);
            statement.setString(1, cat.getName());
            statement.setInt(2, cat.getAge());
            statement.setString(3, cat.getBreed());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(int id){
        try {
            String query = "DELETE FROM cats WHERE id = ?";
            PreparedStatement statement = connection.getConnection().prepareStatement(query);
            statement.setInt(1, id);
            statement.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Cat> select(String[][] params) {
        ArrayList<Cat>cats = new ArrayList<>();
        try {
            StringBuilder query = new StringBuilder("SELECT * FROM cats WHERE 1");
            for (String[] param : params){
                query.append(" and ").append(param[0]).append(param[1]).append(param[2]);
            }
            PreparedStatement statement = connection.getConnection().prepareStatement(query.toString());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                cats.add(new Cat(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cats;
    }
}
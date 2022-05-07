package ua.com.alevel.car;

import java.sql.*;

public class JdbcMain {

    public static void main(String[] args) throws SQLException {
        JdbcMain jdbcMain = new JdbcMain();
        jdbcMain.connect();
    }

    public void connect() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "root", "undi");
        Statement statement = connection.createStatement();
//        statement.executeUpdate("insert into cars(id, name, model, price) values (3,'audi','a8',800.0)");
        ResultSet resultSet = statement.executeQuery("select * from cars");
        Car car = new Car();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String model = resultSet.getString("model");
                Double price = resultSet.getDouble("price");
                car.setId(id);
                car.setName(name);
                car.setModel(model);
                car.setPrice(price);
                System.out.println(car);
        }
    }
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into cars(id, name, model, price) values(?,?,?,?)");
//        preparedStatement.setInt(1,1);
//        preparedStatement.setString(2,"bmw");
//        preparedStatement.setString(3, "x5");
//        preparedStatement.setDouble(4,400.0);
//        preparedStatement.execute();
}


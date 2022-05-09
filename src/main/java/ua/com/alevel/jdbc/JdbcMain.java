package ua.com.alevel.jdbc;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.sql.*;

public class JdbcMain {

    public static void main(String[] args) throws SQLException, ConfigurationException {
        JdbcMain jdbcMain = new JdbcMain();
        jdbcMain.connect();
    }

    String url;
    String user;
    String password;

    public void config() throws ConfigurationException {
        PropertiesConfiguration configuration = new PropertiesConfiguration();
        configuration.load("src/main/resources/application.yml");
        url = configuration.getString("url");
        user = configuration.getString("user");
        password = configuration.getString("password");
    }

    public void connect() throws SQLException, ConfigurationException {
        config();
        Connection connection = DriverManager.getConnection(url, user, password);
//        Statement statement = connection.createStatement();
//        statement.executeUpdate("insert into cars(id, name, model, price) values (3,'audi','a8',800.0)");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into cars(id, name, model, price) values(?,?,?,?)");
        preparedStatement.setInt(1,4);
        preparedStatement.setString(2,"alfa-romeo");
        preparedStatement.setString(3, "x");
        preparedStatement.setDouble(4,430.0);
        preparedStatement.execute();
    }

//    public void getAll() throws SQLException {
//        ResultSet resultSet = statement.executeQuery("select * from cars");
//        Car car = new Car();
//        while (resultSet.next()) {
//            String id = resultSet.getString("id");
//            String name = resultSet.getString("name");
//            String model = resultSet.getString("model");
//            Double price = resultSet.getDouble("price");
//            car.setId(id);
//            car.setName(name);
//            car.setModel(model);
//            car.setPrice(price);
//            System.out.println(car);
//        }
//    }
    
    public static Map<String, String> getResources(ClassLoader classLoader) {
        try(InputStream inputStream = classLoader.getResourceAsStream("application.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
            Map<String, String> map = new HashMap<>();
            for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
                String key = String.valueOf(objectObjectEntry.getKey());
                String value = String.valueOf(objectObjectEntry.getValue());
                map.put(key, value);
            }
            return map;
        } catch (Exception e) {
            System.out.println("Exception = " + e.getMessage());
            throw new RuntimeException("file not found");
        }
    }
}


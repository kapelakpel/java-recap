package pl.kapelinski.mateusz.java.recap.app.bank.repository;

import pl.kapelinski.mateusz.java.recap.app.bank.ui.model.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AccountRepository {

    private static final Logger LOGGER = Logger.getLogger(AccountRepository.class.getName());
    public static final String DATABASE_URL = "jdbc:h2:~/test;DB_CLOSE_ON_EXIT=FALSE;DB_CLOSE_DELAY=-1;AUTO_SERVER=TRUE;FILE_LOCK=SOCKET;";

    public void create() {
    }

    public void read() {
    }

    public void update() {
    }

    public void delete() {
    }

    public void list() {
        LOGGER.info("list()");
        //kroki do wykonania przy komunikacji JDBC
        //1.DriverManager
        //2.Connection
        //3.Statement/PreparedStatement
        //4.ResultSet
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, "sa", "");
            LOGGER.info("connection: " + connection);
            Statement statement = connection.createStatement();
            LOGGER.info("statement: " + statement);
            statement.executeQuery("SELECT * FROM TEST ORDER BY ID;");
            //SELECT * FROM TEST ORDER BY ID;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public List<Account> listWithResource() {
        LOGGER.info("list()");
        List<Account> accounts = new ArrayList<>();
        //kroki do wykonania przy komunikacji JDBC
        //1.DriverManager
        //2.Connection
        //3.Statement/PreparedStatement
        //4.ResultSet
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, "sa", "");
             Statement statement = connection.createStatement()) {
            LOGGER.info("connection: " + connection);
            LOGGER.info("statement: " + statement);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM TEST ORDER BY ID;");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                LOGGER.info("id: " + id);
                String name = resultSet.getString("NAME");
                LOGGER.info("name: " + name);
                Account account = new Account();
                account.setState(id);
                account.setNumber(name);
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
//        finally {
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


    }
}
// TODO: 27.05.2022
// dokonczyc commity na poprzdnim branchu - zmiana struktory projektu - DONE
// wrzucic zmiany na github dla biezacego brancha
// na main stworzyc nowego brancha ktory bedzie zawieral metody crude we wszystkich warstwach
package by.it_academy.jd2.core.dto.vui.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {


        private static Dao dao;


        private Dao() throws ClassNotFoundException {
            Class.forName("org.postgresql.Driver");
        }


        public static Connection getConnectionBase() throws SQLException, ClassNotFoundException {

            try {
                Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/chat",
                        "postgres",
                        "Vo2643938va");
                return conn;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                return null;
            }
        }

        public static Dao getInstance() throws ClassNotFoundException {

            if (dao == null) {
                dao = new Dao();
            }
            return dao;

            }
          }


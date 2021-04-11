package by.it_academy.jd2.core;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pstgrest2 {


    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");


        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/edu", "postgres", "Vo2643938va");

            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM edu.employees");){
                ResultSetMetaData meta = rs.getMetaData();

                int iColumnCount = meta.getColumnCount();

                while (rs.next()){
                    for(int i =1; i<= iColumnCount; i++){

                    }
                }
            };


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }


    private static List<String> getTablesMetaData(DatabaseMetaData dbMetaData) throws SQLException {

        List<String> tables = new ArrayList<>();

        try (ResultSet rs = dbMetaData.getTables(null, null, null, new String[0])) {

            while (rs.next()) {
                tables.add(rs.getString("TABLE_NAME"));
            }
        }

        return tables;
    }

    private static Map<String, List<String>> getColumnsMetadata(DatabaseMetaData dbMetaData, List<String> tables) throws SQLException {
        Map<String, List<String>> structures = new HashMap<>();
        for (String actualTable : tables) {
            List<String> columns = new ArrayList<>();
            structures.put(actualTable, columns);
            try (ResultSet rs = dbMetaData.getColumns(null, null, actualTable, null)) {
                while (rs.next()) {
                    columns.add(rs.getString("COLUMN_NAME") + " " + rs.getString("TYPE_NAME") + " " + rs.getString("COLUMNS_SIZE"));
                }
            }
        }
        return structures;
    }
}

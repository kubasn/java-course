package org.example;

import java.sql.*;

public class JDBC_insert_example {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        Statement statement = null;
        String sql = "INSERT INTO companies(name,address) VALUES" + "('Company 4','Gdów')";

        try{
             connection =
                    DriverManager
                            .getConnection("jdbc:mysql://127.0.0.1:3306/test","root","");
if(connection == null){
    System.out.println("Brak połączenia");
} else {
    System.out.println("Jest połączenie");
}
        statement = connection.createStatement();
        statement.executeUpdate(sql);



        } catch(SQLException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                statement.close();
            } catch (Exception e){
                e.printStackTrace();
            }
            try{
                connection.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}

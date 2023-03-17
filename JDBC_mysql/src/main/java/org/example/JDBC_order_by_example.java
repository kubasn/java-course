package org.example;

import java.sql.*;

public class JDBC_order_by_example {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        Statement statement = null;
        String sql = "SELECT id, name,address from companies WHERE id>1 ORDER BY id DESC;";

        ResultSet resultSet = null;

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
        resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            System.out.println("id:" + id + " name: " + name + " address: " + address);
        }


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

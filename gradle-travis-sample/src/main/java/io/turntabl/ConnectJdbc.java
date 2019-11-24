package io.turntabl;


import java.sql.*;
import java.util.Scanner;

public class ConnectJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("org.postgresql.Driver");
//        String url = "jdbc:postgresql:north";
//        try(Connection database = DriverManager.getConnection(url, "postgres", "my111")) {
//
//            Statement statement = database.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from customers");
//            System.out.println("*********************************************************************************************");
//            System.out.printf("%25s %35s %25s %35s ", "Customer Id", "Company Name", "Contact Name", "contact_title");
//            System.out.println("\n*******************************************************************************");
//            while (resultSet.next()){
//               // System.out.println("Customers are: " + resultSet.getString("contact_name"));
//                System.out.format("%25s %35s %25s %35s",
//                        resultSet.getString("customer_id"),
//                        resultSet.getString("company_name"),
//                        resultSet.getString("contact_name"),
//                        resultSet.getString("contact_title")
//
//                );
//                System.out.println();
//            }
//        }catch (SQLException except){
//            System.out.println("Connection failed :" + except);
//
//        }
//
//    }
//
//    public static void similarNames() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql:north";
        try (Connection database = DriverManager.getConnection(url, "postgres", "my111")) {
            System.out.println("Enter the name you want to search for: ");
            Scanner name = new Scanner(System.in);
            String theName = name.nextLine();
            PreparedStatement requestedQuery = database.prepareStatement("Select * from customers where contact_name like ?");
            requestedQuery.clearParameters();
            requestedQuery.setString(1, theName + '%');
            ResultSet result = requestedQuery.executeQuery();

            while (result.next()){
                System.out.println(result.getString("contact_name"));
                System.out.println();
            }
        }catch (SQLException sqlEx){
            System.err.println("Connection error: " + sqlEx);
        }


    }

}

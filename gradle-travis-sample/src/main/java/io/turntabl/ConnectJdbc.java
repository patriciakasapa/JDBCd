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
//        Class.forName("org.postgresql.Driver");
//        String url = "jdbc:postgresql:north";
//        try (Connection database = DriverManager.getConnection(url, "postgres", "my111")) {
//            System.out.println("Enter the name you want to search for: ");
//            Scanner name = new Scanner(System.in);
//            String theName = name.nextLine();
//            PreparedStatement requestedQuery = database.prepareStatement("Select * from customers where contact_name like ?");
//            requestedQuery.clearParameters();
//            requestedQuery.setString(1, theName + '%');
//            ResultSet result = requestedQuery.executeQuery();
//
//            while (result.next()){
//                System.out.println(result.getString("contact_name"));
//                System.out.println();
//            }
//        }catch (SQLException sqlEx){
//            System.err.println("Connection error: " + sqlEx);
//        }
//    }
//    public static void usingPPforSearching() throws ClassNotFoundException, SQLException {
//        Class.forName("org.postgresql.Driver");
//        String url = "jdbc:postgresql:north";
//        try (Connection database = DriverManager.getConnection(url, "postgres", "my111")) {
//            PreparedStatement queryforJdbc2 = database.prepareStatement("Select category_name, product_name, employees.first_name from category " +
//                    "inner join products on categories.category_id = products.category_id " +
//                    "inner join order_details on products.product_id = order_details.product_id" +
//                    " inner join orders on order_details.order_id = orders.order_id " +
//                    "inner join employees on orders.employee_id = employees.employee_id");
//            queryforJdbc2.clearParameters();
//            queryforJdbc2.setString(1, "category_name");
//            queryforJdbc2.setString(2, "product_name");
//            queryforJdbc2.setString(3, "employees.first_name");
//
//            ResultSet res = queryforJdbc2.executeQuery();
//            while (res.next()) {
//
//                System.out.println(res.getString("category_name"));
//                System.out.println("****************************************************************************************************************************");
//                System.out.println(res.getString("product_name"));
//                System.out.println("****************************************************************************************************************************");
//                System.out.println(res.getString("employees.first_name"));
//            }
//
//        } catch (SQLException se) {
//            System.err.println("Connection Error: " + se);
//        }


        //public static void similarProductNames () throws SQLException, ClassNotFoundException {
//            Class.forName("org.postgresql.Driver");
//            String url = "jdbc:postgresql:north";
//            try (Connection database = DriverManager.getConnection(url, "postgres", "my111")) {
//                System.out.println("Enter the name of product you want to search for: ");
//                Scanner pname = new Scanner(System.in);
//                String theName = pname.nextLine();
//                PreparedStatement requestedQuery = database.prepareStatement("Select * from products where product_name like ?");
//                requestedQuery.clearParameters();
//                requestedQuery.setString(1, theName + '%');
//                ResultSet result = requestedQuery.executeQuery();
//
//                while (result.next()) {
//                    System.out.println(result.getString("product_name"));
//                    System.out.println();
//                }
//            } catch (SQLException sqlEx) {
//                System.err.println("Connection error: " + sqlEx);
//
//            }
//        }
//
//    public static void similarCategoryNames() throws SQLException, ClassNotFoundException {
//        Class.forName("org.postgresql.Driver");
//        String url = "jdbc:postgresql:north";
//        try (Connection database = DriverManager.getConnection(url, "postgres", "my111")) {
//            System.out.println("Enter the Category name you want to search for: ");
//            Scanner cname = new Scanner(System.in);
//            String theName = cname.nextLine();
//            PreparedStatement requestedQuery = database.prepareStatement("Select * from categories where category_name like ?");
//            requestedQuery.clearParameters();
//            requestedQuery.setString(1, theName + '%');
//            ResultSet result = requestedQuery.executeQuery();
//
//            while (result.next()) {
//                System.out.println(result.getString("category_name"));
//                System.out.println();
//            }
//        } catch (SQLException sqlEx) {
//            System.err.println("Connection error: " + sqlEx);
//        }
//
//        public static void similarEmployeeNames() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql:north";
        try (Connection database = DriverManager.getConnection(url, "postgres", "my111")) {
            System.out.println("Enter the Employee name you want to search for: ");
            Scanner ename = new Scanner(System.in);
            String theName = ename.nextLine();
            PreparedStatement requestedQuery = database.prepareStatement("Select * from employees where first_name like ?");
            requestedQuery.clearParameters();
            requestedQuery.setString(1, theName + '%');
            ResultSet result = requestedQuery.executeQuery();

            while (result.next()) {
                System.out.println(result.getString("first_name"));
                System.out.println();
            }
        } catch (SQLException sqlEx) {
            System.err.println("Connection error: " + sqlEx);
        }
    }
}


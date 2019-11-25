package io.turntabl;

import java.sql.SQLException;

public class Main {
    public static void main (String[] args) throws SQLException, ClassNotFoundException {
        CustomerDAOImpl customer = new CustomerDAOImpl();
        customer.addCustomer();
    }
}

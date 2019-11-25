package io.turntabl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public List<CustomerTO> addCustomer() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql:north";
        Connection database = DriverManager.getConnection(url, "postgres", "my111");
        CustomerTO customer = new CustomerTO();
        PreparedStatement addps = database.prepareStatement("insert into customers (customer_id, contact_name, address) values('wale', 'Aggrey', 'Taifa')");
//                "  , count(products.product_name) as ct, products.unit_price from products " +
//                "inner join order_details on products.product_id = order_details.product_id " +
//                "group by products.product_name, products.unit_price " +
//                "order by ct desc limit 5");
        List<CustomerTO> result = null;
        try {
            ResultSet rs = addps.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                result.add(customer);
            }

        } catch (SQLException s) {
            System.err.println("Something went wrong: " + s);
        }
        return result;
    }

    @Override
    public CustomerTO getCustomerName(String name) {
        return null;
    }

    @Override
    public void deleteCustomer(String name) {

    }

    @Override
    public void updateCustomer(CustomerTO customer) {

    }
}

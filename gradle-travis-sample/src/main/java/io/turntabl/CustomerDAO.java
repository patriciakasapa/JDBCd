package io.turntabl;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {

    public List<CustomerTO> addCustomer() throws ClassNotFoundException, SQLException;
    public CustomerTO getCustomerName(String name);
    public void deleteCustomer(String name);
    public void updateCustomer(CustomerTO customer);

}

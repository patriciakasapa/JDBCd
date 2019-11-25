package io.turntabl;

public class CustomerTO {
    public String customer_id;
    public String contact_name;
    public String address;

    public CustomerTO() {
        this.customer_id = customer_id;
        this.contact_name = contact_name;
        this.address = address;
    }
    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

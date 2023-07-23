import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    /*newCustomer(), has two parameters of type String (name of customer), double (initial transaction)
    and returns a boolean. Returns true if the customer was added successfully or false otherwise. */


    /* addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction)
    and returns a boolean. Returns true if the customers transaction was added successfully or
    false otherwise. */


    /*findCustomer(), has one parameter of type String (name of customer) and returns a Customer.
    Return the Customer if they exist, null otherwise. */



}

package Abstact;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

    @Override
    public void Save(Customer customer) {
        System.out.println("Saved to database! "+ customer.getFirstName());
    }
}

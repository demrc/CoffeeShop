package Abstact;

import Entities.Customer;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}

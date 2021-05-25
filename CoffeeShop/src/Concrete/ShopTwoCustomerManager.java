package Concrete;

import Abstact.BaseCustomerManager;
import Abstact.CustomerCheckService;
import Abstact.CustomerService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

//lets implement this app identity checker
public class ShopTwoCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;
    public ShopTwoCustomerManager(MernisServiceAdapter mernisServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void Save(Customer customer) {

        if(customerCheckService.CheckIfRealPerson(customer))
        {
        super.Save(customer);
        }
        else{
            System.out.println("Not a valid person!");
        }
    }

    private void CheckIfRealPerson(Customer customer) {
    }
}

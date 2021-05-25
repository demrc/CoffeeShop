package Adapters;

import java.time.LocalDate;

import Abstact.CustomerCheckService;
import Entities.Customer;
import MernisApp.MernisApp;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean serviceResult = false;
		try {
			serviceResult = client.TCKimlikNoDogrula(Long.parseLong(customer.nationalIdentity),
					customer.getFirstName() , 
					customer.getLastName(),
					customer.getDateOfBirth().getYear());
	}
	catch (Exception e) {
		System.out.println("Not a valid person");
	}
	return serviceResult;
	}
	
}

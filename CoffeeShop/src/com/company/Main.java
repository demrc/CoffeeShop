package com.company;

import Abstact.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.ShopOneCustomerManager;
import Concrete.ShopTwoCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    static void main(String[] args) {
        BaseCustomerManager baseCustomerManager = new ShopTwoCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.Save(new Customer(1,"aaaa","bbbb",
            LocalDate.of(1900,9,9),"00000000"));
        

    }
}

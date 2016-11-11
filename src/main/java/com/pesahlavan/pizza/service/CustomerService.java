package com.pesahlavan.pizza.service;
import com.pesahlavan.pizza.domain.Customer;

public interface CustomerService {
   Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
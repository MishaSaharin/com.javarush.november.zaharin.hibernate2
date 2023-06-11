package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}

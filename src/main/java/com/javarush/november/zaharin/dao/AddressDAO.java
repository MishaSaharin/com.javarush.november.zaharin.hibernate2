package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends GenericDAO<Address>{
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}

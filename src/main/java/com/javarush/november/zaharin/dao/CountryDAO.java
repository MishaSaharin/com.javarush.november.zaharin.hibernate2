package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Country;
import org.hibernate.SessionFactory;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}

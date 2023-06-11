package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}

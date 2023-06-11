package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDAO extends GenericDAO<Inventory> {
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}

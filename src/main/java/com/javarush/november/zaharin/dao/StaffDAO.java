package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}

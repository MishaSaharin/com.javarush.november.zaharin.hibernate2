package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDAO<Category>{
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}

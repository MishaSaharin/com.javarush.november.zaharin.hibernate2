package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Language;
import org.hibernate.SessionFactory;
public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}

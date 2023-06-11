package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}

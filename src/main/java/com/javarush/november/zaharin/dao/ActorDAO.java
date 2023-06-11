package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}

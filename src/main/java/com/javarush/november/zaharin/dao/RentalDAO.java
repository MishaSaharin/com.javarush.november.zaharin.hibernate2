package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class RentalDAO extends GenericDAO<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    public Rental getAnyUnreturnedRentalInventory() {
        Query<Rental> query = getCurrentSession().createQuery("from Rental where returnDate is null", Rental.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}

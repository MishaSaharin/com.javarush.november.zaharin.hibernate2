package com.javarush.november.zaharin.dao;

import com.javarush.november.zaharin.entity.Payment;
import org.hibernate.SessionFactory;
public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}

package org.example.dao;

import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDaoImpl implements UserDAO {
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }

    @Override
    public void save(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
        System.out.println("person saved Successfully, person Details = "+ user);


    }
}

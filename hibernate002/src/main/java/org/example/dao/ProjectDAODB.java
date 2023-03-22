package org.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class ProjectDAODB implements AbstractDAOInterface<Project> {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    private SessionFactory getSessionFactory(){
        ServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

    };

    @Override
    public void persist(Project entity) {

    }

    @Override
    public void update(Project entity) {

    }

    @Override
    public void findById(Integer id) {

    }

    @Override
    public void delete(Project entity) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Project> findAll() {
        return null;
    }
}

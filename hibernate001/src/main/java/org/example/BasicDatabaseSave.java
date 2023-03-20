package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;


public class BasicDatabaseSave {
    public static void main(String[] args) {
        System.out.println("hello");

       StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
               .configure("hibernate.cfg.xml")
               .build();

        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("Marek");
        employee.setSurname("Nowak");
        employee.setJobTitle("CEO");
        employee.setAge(30);
        employee.setAddress("Kraków");
        employee.setSalary(3500);

        session.save(employee);
        transaction.commit();

        System.out.println("Employee saved");
        sessionFactory.close();
        session.close();
    }
}

package org.example.OneToOne;

import org.example.OneToOne.Model.Parcel;
import org.example.OneToOne.Model.ParcelAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class ParcelExample {
    public static void main(String [] args){

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Parcel parcel = new Parcel("Kokotów",20);
        ParcelAddress parcelAddress = new ParcelAddress("Poland","Kokotów","Centrum","00-023");

        parcel.setParcelAddress(parcelAddress);

//        session.save(parcel);

        Query query = session.createQuery("FROM Parcel p");
        List<Parcel> parcels = query.list();
        parcels.stream().forEach(p-> System.out.println(p));

        transaction.commit();
        sessionFactory.close();
        session.close();


    }
}

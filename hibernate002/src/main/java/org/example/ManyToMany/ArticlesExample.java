package org.example.ManyToMany;

import org.example.ManyToMany.Model.Article;
import org.example.ManyToMany.Model.Tag;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;


public class ArticlesExample {

    public static void main(String[] args) {


        ServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Article article = new Article("Wyscigi","awdawd adwawdw ");
        article.addTag(new Tag("sport"));
        article.addTag(new Tag("racing"));
        article.addTag(new Tag("motosports"));

//        session.save(article);
//        transaction.commit();



        Query query = session.createQuery("FROM Article");
        List<Article> articleList = query.list();
        articleList.stream().forEach(a-> {
                    System.out.println(a + ":");
                    article.getTags().stream().forEach(t -> System.out.println(t));
                }
        );

        sessionFactory.close();
        session.close();


    }
}

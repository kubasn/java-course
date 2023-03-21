package org.example.OneToMany;

import org.example.OneToMany.Model.Answer;
import org.example.OneToMany.Model.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {

    public static void main(String [] args){
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Question question = new Question("2 + 2 equals?");
        Answer answer1 = new Answer("4",true);
        Answer answer2 = new Answer("5",false);
        Answer answer3 = new Answer("6",false);
        List<Answer> answerList = new ArrayList<>();
        answerList.add(answer1);
        answerList.add(answer2);
        answerList.add(answer3);
        question.setAnswers(answerList);

        session.save(question);


        Question q2 = new Question("6-4 equals?");
        Answer a1 = new Answer("2",true);
        Answer a2 = new Answer("7",false);
        Answer a3 = new Answer("1",false);
        List<Answer> answerList1 = new ArrayList<>();
        q2.setAnswers(answerList1);
        session.save(q2);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}

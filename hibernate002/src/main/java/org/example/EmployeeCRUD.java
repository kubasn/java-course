package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class EmployeeCRUD {
private SessionFactory sessionFactory;
    public EmployeeCRUD() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    }

    public Integer saveEmployee(Employee employee){
        Session session = null;
        Integer id = null;
        Transaction transaction = null;

        try{
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            id = (Integer) session.save(employee);
            transaction.commit();
        } catch(Exception e){
            e.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            session.close();
        }
return id;
    }

    public Employee getEmployee(Integer id) {
        Session session = null;
        Employee employee = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            String hql = "FROM Employee E WHERE E.id = " + id;
            Query query = session.createQuery(hql);
            List results = query.list();
            if(results.size()>0){ employee = (Employee) results.get(0); }
        } catch (Exception e){
            e.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            session.close();
        }
        return employee;
    }

    public List getEmployees() {
        Session session = null;
        List<Employee> employees = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            String hql = "FROM Employee";
            Query query = session.createQuery(hql);
            employees = query.list();

        } catch (Exception e){
            e.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            session.close();
        }
        return employees;
    }

    public void  updateEmployee(Integer id,String name) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Employee employee = (Employee) session.get(Employee.class, id);
            employee.setName(name);
            session.update(employee);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            session.close();
        }
    }

    public void  deleteEmployee(Integer id) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(id);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            if(transaction != null) transaction.rollback();
        } finally {
            session.close();
        }
    }



public void run(){
//            Employee employee = new Employee(0,"Adam","Kowalski","programmer","Kraków",35,3000);
//            Integer newId= saveEmployee(employee);
//    System.out.println("Zapisano rekord: " + newId);
//    Employee savedEmployee = getEmployee(3);
//    System.out.println(savedEmployee);

    updateEmployee(3,"Waldek");

    List<Employee> employees = getEmployees();
    System.out.println(employees);
    }


    public static void main(String [] args){

        EmployeeCRUD employeeCRUD = new EmployeeCRUD();
        employeeCRUD.run();
    }



}

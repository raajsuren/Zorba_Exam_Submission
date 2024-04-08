package org.example.execution;

import org.example.xml_based.entity.Student;
import org.example.xml_based.entity.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class XMLBasedOneToManyMappingExecu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Read the hibernate configure file

        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");

        //create session Factory
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tx= null;

        //Quesiton number 1 (Many to one)
        Subject subject= new Subject();
        subject.setSubName("Physics");
        subject.setSubName("Chemistry");
        subject.setSubName("Mathmatics");
        subject.setSubName("Computer");


        // Question number 2
        Student student= new Student();
        student.setStudName("Rabina Lamichhane");
        student.setStudRollNumber(15);




    try {
    tx= session.beginTransaction();


    }catch (Exception e){
        System.err.println(e.getMessage());
        tx.rollback();

    }
    finally {
        if (session !=null);
        session.close();

    }

    }
}

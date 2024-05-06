package org.example.execution;

import org.example.entity.BusInfo;
import org.example.entity.TicketInfo;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class BusTicketBookingSystem {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = cfg.buildSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();
        Transaction tx = null;

        try
        {
            System.out.println("Hom many business ticket would you like");
            int numberOfTickets = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < numberOfTickets; i++) {
                System.out.println("Enter number of tickets you would like to book");
                int tickets = Integer.parseInt(sc.nextLine());
                BusInfo busInfo = new BusInfo();
                TicketInfo ticketInfo = new TicketInfo();
                session.save(busInfo);
            }
            System.out.println("Enter number of tickets you would like to book");





            tx = session.beginTransaction();
            tx.commit();

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            session.close();
        }


    }
}

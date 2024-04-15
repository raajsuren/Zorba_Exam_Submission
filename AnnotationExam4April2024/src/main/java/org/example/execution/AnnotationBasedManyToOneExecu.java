package org.example.execution;

import org.example.entity.Customer;
import org.example.entity.Product;
import org.example.entity.Product_Type;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnnotationBasedManyToOneExecu {
    public static void main(String[] args) {

        //Read Hibernate configuration
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");

        //Need to add all entity class into addAnnotationClass
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(Product_Type.class);

        //Create Session Factory
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction tx= null;

        Customer customer= new Customer();
        List<Customer> customerList= new ArrayList<>();

        //Taking data input for customer information
        Scanner scanner= new Scanner(System.in);

        System.out.println("Provide Customer Id(i.e C01)");
        String CustomerId= scanner.nextLine();
        customer.setCustEmail(CustomerId);

        System.out.println("Provide Customer Name");
        String customerName= scanner.next();
        customer.setCustName(customerName);





        try {


        }catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();

        }finally {
            if (session !=null)
                session.close();

        }

    }
}

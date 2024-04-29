package org.example.question1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateRentOfFlate {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        RentOfOneBHKFlat rentOfOneBHKFlat = applicationContext.getBean(RentOfOneBHKFlat.class);


        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        RentOfTwoBHKFlat rentOfTwoBHKFlat = applicationContext.getBean(RentOfTwoBHKFlat.class);


        ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("applicationContext2.xml");
        RentOfThreeBHKFlat rentOfThreeBHKFlat= applicationContext2.getBean(RentOfThreeBHKFlat.class);

    }

}

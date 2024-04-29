package org.example.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateSelfOwnedFlat {
    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean.xml");

       /* SelfOwnedOneBHKFlat so1=(SelfOwnedOneBHKFlat)applicationContext.getBean("so1");
        // Q2B
        so1.setBreadth(50);
        so1.setHeight(50);
        so1.setLength(50);
        so1.setFinalPriceOfFlat("Total price is: " + (float breadth * float height * float length);

    }
    public double calculateOfFinalPriceOfFlat() {
        float* 30000
        */
    }
    //Q2C
    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean.xml");
    SelfOwnedTwoBHKFlat so2= applicationContext.getBean(SelfOwnedTwoBHKFlat.class);



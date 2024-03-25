package org.example.Exam24March;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args)  {

        try
        {
            Scanner scanner= new Scanner(System.in);

            FileReader fileReader = new FileReader("C:\\Users\\raajs\\Zorba_Exam_Submission\\JDBCExam\\src\\main\\resources\\Railway.properties");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Create property object
            Properties properties = new Properties();
            properties.load(bufferedReader);

            String url = properties.getProperty("url");
            System.out.println("url received "+ url);

            String username= properties.getProperty("username");
            System.out.println("username received "+ username);

            String password = properties.getProperty("password");
            System.out.println(" password is received "+ password);

            // For connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection is successfully");

            //select Statement
            Statement statement = connection.createStatement();

            //Question 1.
            String creatQuery= "create table RailWay_Reservastion(Passerger_Nmae varchar (50), Passenger_Age int (20), Choosean_Seat varchar (20), Reservation_Type varchar(20), IsSeniorCitizen boolean, Amount_Paid double)";
             statement.execute(creatQuery);
            System.out.println("Create table Successfully");





        }
        catch (Exception e){
            System.err.println(e.getMessage());

        }


    }
}

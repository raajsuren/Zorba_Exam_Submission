package org.example.Exam24March;
import javax.sound.sampled.ReverbType;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

//            //Question 1.
//            String creatQuery= "create table RailWay_Reservastion(Passerger_Nmae varchar (50), Passenger_Age int (20), Choosean_Seat varchar (20), Reservation_Type varchar(20), IsSeniorCitizen boolean, Amount_Paid double)";
//             statement.execute(creatQuery);
//            System.out.println("Create table Successfully");

            // insert data into railway_reservation table
            System.out.println("Please provide Passenger_Name");
            String Passenger_Name = scanner.next();

            System.out.println("Please Provide Passenger_Age");
            int Passenger_Age = scanner.nextInt();

            System.out.println("Please Choose a Seat");
            String Passenger_Seat = scanner.next();

            System.out.println("Choose Reseravation Type(AC/ Non AC)");
            String Type_Of_Reservation= scanner.next();

            boolean IsSeniorCitizen = Passenger_Age>60;

            double Amount_Paid= calculateAmount(Type_Of_Reservation);

            // Insert from scanner
            String query = "insert into RailWay_Reservastion values (?,?,?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(query);

            preparedStatement.setString(1, Passenger_Name);
            preparedStatement.setInt(2, Passenger_Age);
            preparedStatement.setString(3, Passenger_Seat);
            preparedStatement.setString(4, Type_Of_Reservation);
            if (IsSeniorCitizen){
                preparedStatement.setInt(5, 1);
            }
            else {
                preparedStatement.setInt(5, 0);
            }
            preparedStatement.setDouble(6,Amount_Paid);

            int rowUpdate=preparedStatement.executeUpdate();
            System.out.println(rowUpdate+"row update");
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

        }
    public static double calculateAmount(String type_Of_Reservation){
        if (type_Of_Reservation.equalsIgnoreCase("AC")){
            return 100.0;

        }
        else {
            return 60.0;
        }
    }
}

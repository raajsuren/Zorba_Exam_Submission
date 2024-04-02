package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExamMarch31 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String url = "jdbc:mysql://127.0.0.1:3306/jdbcexam31march";
        String usernmae= "root";
        String password = "Mehersa2021@";

        try
        {
            // Load and register the driver for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating connection with database
            Connection Connection = DriverManager.getConnection(url, usernmae, password);
            System.out.println("Connection is successfully");

            Statement statement= Connection.createStatement();

            //Q 1,2,3 Create tables
            /*
            String createQuery= "create table student(stud_id int(10) primary key, stud_name varchar (55), stud_age int(10), stud_dob datetime)";
            statement.execute(createQuery);
            String createQuery1= "create table department(dept_id int (10) primary key, dept_name varchar (20), dept_location varchar(30),stud_id int (10)," +
                    "foreign key (stud_id) references student(stud_id))";
            statement.execute(createQuery1);
            String createQuery2= "create table stud_sub_score(sub_id int(10) primary key, sub_name varchar(20), sub_score decimal(12,3), " +
                    "stud_id int(10), foreign key(stud_id) references student(stud_id))";
            statement.execute(createQuery2);

           System.out.println("Tables are created successfully....");

            */
            /*
            // Q 4. take scanner input for Student table--------------
            System.out.println("Please Provide Student Id ");
            int studId= scanner.nextInt();

            System.out.println("Provide Student Name");
            String studName=scanner.next();

            System.out.println("Student Age");
            int studAge= scanner.nextInt();

            System.out.println("Studnet Date Of Birth");
            String studDob= scanner.next();
            System.out.println("Student inserting values are succesfully");
            */
            /*
            // take scanner input for Department table---------------------
            System.out.println("Please Provide Department Id");
            int deptId= scanner.nextInt();

            System.out.println("Please provide Department Name");
            String deptName= scanner.next();

            System.out.println("Department Loacation");
            String deptLocation= scanner.next();

            System.out.println("Please Provide Student Id");
            int studId= scanner.nextInt();
            System.out.println("Department input value inserted");
            */



            // take scanner input for Stud_Sub_Score table--------------
            System.out.println("Please provide Id");
            int subId= scanner.nextInt();

            System.out.println("Please Provide Sub Name");
            String subName= scanner.next();

            System.out.println("Please Provide Sub Score");
            double subScore= scanner.nextDouble();

            System.out.println("Please Provide Student Id");
            int studId= scanner.nextInt();

            System.out.println("stud_sub_Score data are inserted");


            /*
            //Q For data insert for Student table
            PreparedStatement preparedStatement=Connection.prepareStatement("insert into student values (?,?,?,?)");
            preparedStatement.setInt(1, studId);
            preparedStatement.setString(2,studName);
            preparedStatement.setInt(3, studAge);
            preparedStatement.setString(4,studDob);

            int rowUpdated = preparedStatement.executeUpdate();
            System.out.println("Insert the department values ....... " + rowUpdated);
            */
            /*
            // Data insert for Department
            PreparedStatement preparedStatement=Connection.prepareStatement("insert into Department values (?,?,?,?)");
            preparedStatement.setInt(1, deptId);
            preparedStatement.setString(2,deptName);
            preparedStatement.setString(3, deptLocation);
            preparedStatement.setInt(4,studId);
            int rowUpdated = preparedStatement.executeUpdate();
            System.out.println("Insert the department values ....... " + rowUpdated);
            */

            PreparedStatement preparedStatement=Connection.prepareStatement("insert into stud_sub_score values (?,?,?,?)");
            preparedStatement.setInt(1, subId);
            preparedStatement.setString(2,subName);
            preparedStatement.setDouble(3, subScore);
            preparedStatement.setInt(4,studId);

            /*
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2,"History");
            preparedStatement.setDouble(3, 65.54);
            preparedStatement.setInt(4,1);

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2,"Geology");
            preparedStatement.setDouble(3, 45.98);
            preparedStatement.setInt(4,1);
            */
            int rowUpdate=preparedStatement.executeUpdate();
            System.out.println("valued inserted successfully");

//
//            // altering table
//            String alterQuery = "alter table student add column stud_markas decimal(12,3))";
//            statement.execute(alterQuery);
//            System.out.println("New add Column is added");


        }
        catch (Exception e){
            System.err.println(e.getMessage());

        }
    }
}

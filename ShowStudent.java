package com.company;

import java.util.Scanner;

public class ShowStudent {

    public static void main(String[] args) {


        // making the program never end by creating a loop
        while (true) {
            Student student = new Student();
            // inputting scanner function
            Scanner sc = new Scanner(System.in);
            // asking the end user to input ID number
            System.out.print(" Enter your ID number >>> ");
            // idNumber will be updated after end-user input
            student.setIdNumber(sc.nextInt()) ;
            // asking end user to input credit hours
            System.out.print(" Enter the credit hours of the class  >>> ");
            // hours will be updated
            student.setHours(sc.nextInt());
            //asking end user to input course name
            System.out.print(" Enter the course name of the class  >>> ");
            // course name will be updated after end user input
            student.setName(sc.next());
            // printing out final line statements
            System.out.println(" The student ID number is  " + student.getidNumber() );
            System.out.println(" The credit hour earned is " + student.getHours() );
            System.out.println(" The course name is " + student.getName());
        }


    }


}

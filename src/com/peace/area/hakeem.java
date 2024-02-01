package com.peace.area;
import java.util.Scanner;

public class hakeem {

    public static void main(String[] args) {



        calculategpa();
    }

  public static double calculategpa(){
      int num;
      int totalunitload;
      double totalpoint;
      int unitload;
      char peace;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of courses: ");
      num = input.nextInt();
      totalunitload = 0;
      totalpoint = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("\n Enter details of the courses choosen" + i + ":");
            String courses = input.next();
            input.nextLine();
            System.out.println("Enter the unitload for " + courses + " :");
            unitload = input.nextInt();

            System.out.println("Enter grade for the " + courses + " (A, B, C, D, E, F):");
            peace = input.next().toUpperCase().charAt(0);

            double gradepoint = calculategradepoint(peace);
            double course = gradepoint * unitload;
            totalunitload = totalunitload + unitload;
            totalpoint += course;
        }
        double cgpa = totalpoint / totalunitload;
        System.out.println("The total cgpa: " + cgpa);


        //program to check the class
        if (cgpa >= 4.5 && cgpa <= 5.0) {
            System.out.println("congratulation you are a first class graduate:");
        } else if (cgpa >= 3.5 && cgpa <= 4.49) {
            System.out.println("congratulation you are a second class upper graduate:");
        } else if (cgpa >= 2.5 && cgpa <= 3.39) {
            System.out.println("congratulation you are a second class lower graduate:");
        } else if (cgpa >= 1.5 && cgpa <= 2.49) {
            System.out.println("poor performance and its a pass mark :");
        } else {
            System.out.println("failed: ");
        }
        return  cgpa;
    }

    private static double calculategradepoint(char grade) {
        switch (grade) {
            case 'A':
                return 5.0;
            case 'B':
                return 4.0;
            case 'C':
                return 3.0;
            case 'D':
                return 2.0;
            case 'E':
                return 1.0;
            case 'F':
                return 0.0;
            default:
                System.out.println("YOU FAILED");
                return 0.0;
        }


    }
}



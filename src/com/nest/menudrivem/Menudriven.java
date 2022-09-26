package com.nest.menudrivem;

import java.util.Scanner;

public class Menudriven {
    public static void main(String args[])
    {
        int c;
        while (true)
        {
            System.out.println("select an option");
            System.out.println("1. Add student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. view all Students");
            System.out.println("5. exit");
            Scanner s=new Scanner(System.in);
            c=s.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("Add student selected");
                    break;
                case 2:
                    System.out.println("Search student selected");
                    break;
                case 3:
                    System.out.println("Delete student selected");
                    break;
                case 4:
                    System.out.println("view student selected");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }


        }
    }
}

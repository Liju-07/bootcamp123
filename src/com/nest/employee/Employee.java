package com.nest.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee
{
    public static void main(String[] args) {
        String name;
        ArrayList<String> s=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int c;
        while(true)
        {
            System.out.println("1.enter the employee details");
            System.out.println("2.view");
            System.out.println("3.exit");
           c=sc.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("enter the name");
                    name=sc.next();
                    s.add(name);

                    break;
                case 2:if(s.size()==0)
                {
                    System.out.println("no data");
                }
                else {
                    System.out.println(s);
                }

                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}

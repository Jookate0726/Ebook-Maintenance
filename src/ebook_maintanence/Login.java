package ebook_maintanence;

import java.util.Scanner;

public class Login extends access{

    public void student_login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t\t\t HELLO STUDENT  :  ");
        System.out.print("\n\t\t\t\t\t Enter your name  :  ");
        scanner.nextLine();
        System.out.print("\t\t\t\t\t Enter your rollno  :  ");
        scanner.nextLine();
        System.out.println("\n\t\t\t SUCCESSFULLY LOGGED IN...!!!\n");
        for (int i=0; i<200; i++)
            System.out.print("=");
        System.out.print("\n\n");
        get_student_access();
    }

    public void admin_login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t\t\t HELLO ADMIN  :  ");
        System.out.print("\n\t\t\t\t\t Enter your name  :  ");
        scanner.nextLine();
        System.out.print("\t\t\t\t\t Enter your password  :  ");
        scanner.nextLine();
        System.out.println("\n\t\t\t SUCCESSFULLY LOGGED IN...!!!\n");
        for (int i=0; i<200; i++)
            System.out.print("=");
        System.out.print("\n\n");
        get_admin_access();
    }
}

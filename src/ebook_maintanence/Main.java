package ebook_maintanence;

import java.util.Scanner;

public class Main extends Login{
    public static void main(String[] args){
        Main main = new Main();
        int x =1;

        while(x == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\n\n");
            for (int i = 0; i < 200; i++)
                System.out.print("=");
            System.out.print("\n");
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  E-BOOK MAINTANENCE\n");
            for (int i = 0; i < 200; i++)
                System.out.print("=");
            System.out.print("\n\n");

            System.out.println("\n\t\t\t LOGIN SYSTEM  :  ");
            System.out.print("\n\t\t\t\t\t ENTER 1 IF ADMIN and ENTER 0 IF STUDENT :  ");
            int login = scanner.nextInt();

            if (login == 1) {
                main.admin_login();
            } else {
                main.student_login();
            }
            System.out.print("\n\n\t\t\t Do You want to continue  y/n  ");
            String ans = scanner.next();
            if (ans.equals("n")) {
                x = 0;
                for (int i = 0; i < 200; i++)
                    System.out.print("=");
            }
        }

    }
}

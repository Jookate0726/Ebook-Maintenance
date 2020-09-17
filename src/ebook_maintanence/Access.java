package ebook_maintanence;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Access {

    public void get_student_access() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t\t\t BOOKS THAT YOU CAN ACCESS  :  ");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("book_names.txt"));
            System.out.println();
            String contentLine = bufferedReader.readLine();
            while (contentLine != null) {
                System.out.println("\t\t\t\t\t" +contentLine);
                contentLine = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("\n\t\t\t WHICH BOOK YOU WANTED TO ACCESS  ?  ");
        scanner.next();
        System.out.println("\n\t\t\t Book is accessed successfully...!!!  ");

    }

    public void get_admin_access() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t\t\t ENTER 1 TO ADD BOOK  ,  0 TO ACCESS BOOK  : ");
        int pass = scanner.nextInt();

        if (pass == 1) {
            System.out.print("\n\t\t\t\t\t ENTER THE NAME OF THE BOOK  :  ");
            String name = scanner.next();
            try (FileWriter fileWriter = new FileWriter("book_names.txt", true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("\nbooks - " + name);
                System.out.println("\n\t\t\t Book Successfully Added...!!!");
            } catch (IOException i) {
                i.printStackTrace();
            }
        }
        else {
            System.out.println("\n\t\t\t\t\t BOOKS THAT YOU CAN ACCESS  :  ");
            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader("book_names.txt"));
                String contentLine = bufferedReader.readLine();
                while (contentLine != null) {
                    System.out.println("\t\t\t\t\t" +contentLine);
                    contentLine = bufferedReader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("\n\t\t\t WHICH BOOK YOU WANTED TO ACCESS  ?  ");
            scanner.next();
            System.out.println("\n\t\t\t Book is accessed successfully...!!!  ");
        }
    }
}



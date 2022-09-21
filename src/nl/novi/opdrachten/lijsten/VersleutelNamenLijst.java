package nl.novi.opdrachten.lijsten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VersleutelNamenLijst {

    /**
     * Bijgevoegd is verzetsleden.txt
     * Maak een programma dat verzetsleden.txt uitleest.
     * Versleutel de namen op dezelfde manier als in GeheimeCode.java
     * En sla de versleutelde namen op in secret.txt
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\evand\\Novi\\BackEnd\\Lessen\\SD-BE-JP-oefenopdrachten\\src\\nl\\novi\\opdrachten\\lijsten\\verzetsleden.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());






    }


} // class


//// Java Program to illustrate
//// reading from Text File
//// using Scanner Class
//import java.io.File;
//        import java.util.Scanner;
//public class ReadFromFileUsingScanner
//{
//    public static void main(String[] args) throws Exception
//    {
//        // pass the path to the file as a parameter
//        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
//        Scanner sc = new Scanner(file);
//
//        while (sc.hasNextLine())
//            System.out.println(sc.nextLine());
//    }
//}
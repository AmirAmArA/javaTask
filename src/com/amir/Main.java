package com.amir;

import com.backend.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Account testAcc = new Account("Amir","Password");
        System.out.print("Please Insert your Company ID ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.print("Please Insert your Company Password ");
         scanner = new Scanner(System.in);
        String password = scanner.nextLine();



if(testAcc.logIn(userName,password))        {
            System.out.print("to send an email press 1 else press 0");
            Scanner scannerInt= new Scanner(System.in);
            int selection = scannerInt.nextInt();
            if(selection==1){
                System.out.print("please provide the email of the customer");
                Scanner scannerEmail = new Scanner(System.in);
                String customerEmail = scannerEmail.nextLine();
                System.out.print("through which mail vendor would you like to send the email? (gmail/yahoo/walla)");
                Scanner scannerVendor = new Scanner(System.in);
                String vendorSelection = scannerVendor.nextLine();
                System.out.print("please write your email that you wish to send");
                Scanner scannerBody = new Scanner(System.in);
                String emailBody = scannerBody.nextLine();

                System.out.println("the email will be sent through your | " + testAcc.username + "@" + vendorSelection + ".com | to | "+ customerEmail +" |");
                System.out.println("the mail body will be \n" + emailBody );
                System.out.println("to confirm please insert 1" );
                scannerInt= new Scanner(System.in);
                selection = scannerInt.nextInt();

                if(selection==1){
                   System.out.println(testAcc.sendMail(testAcc.username+vendorSelection,customerEmail,emailBody ));
                }
            }

        }



    }
}

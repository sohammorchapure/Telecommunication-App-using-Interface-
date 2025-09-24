package com.soham;
import java.util.*;

//My Telecommunication App using Interface Class.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




//      System.out.print("Enter your mobile number: ");
//      long number = sc.nextLong();
//      DeskPhone myPhone = new DeskPhone(number);
//      myPhone.powerOn();
//      myPhone.callPhone(number);
//      myPhone.answer();


            System.out.print("Enter your mobile number: ");
            long number = sc.nextLong();
            MobilePhone myPhone = new MobilePhone(number);
            myPhone.powerOn();
            myPhone.callPhone(number);
            myPhone.answer();

        }

    }

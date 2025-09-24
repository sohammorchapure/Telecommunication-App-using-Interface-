package com.soham;

public class DeskPhone implements Telephone{

    private long myNumber;
    private boolean isRinging;

    public DeskPhone(long myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone is powered.");
    }

    @Override
    public void dial(long phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on deskphone.");
    }

    @Override
    public void answer() {
         if (isRinging){
             System.out.println("Answering the deskphone.");
             isRinging = false;
         } else {
             System.out.println("Phone is not ringing.");
         }
    }

    @Override
    public boolean callPhone(long phoneNumber) {
        if (phoneNumber >= 999999999 && phoneNumber <= 10000000000L){
            if (phoneNumber == myNumber){
                isRinging = true;
                System.out.println("Phone is ringing.");
            } else {
                isRinging = false;
            }
        } else {
            System.out.println("Enter a correct number.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

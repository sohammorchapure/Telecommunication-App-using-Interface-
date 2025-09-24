package com.soham;

public class MobilePhone implements Telephone{
    private long myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(long myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone is powered on.");
    }

    @Override
    public void dial(long phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on deskphone.");
    }


    @Override
    public void answer() {
        if (isRinging && isPowerOn){
            System.out.println("Answering the phone.");
            isRinging = false;
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

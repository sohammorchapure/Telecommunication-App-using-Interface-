package com.soham;

public interface Telephone {
    void powerOn();
    void dial(long phoneNumber);
    void answer();
    boolean callPhone(long phoneNumber);
    boolean isRinging();


}

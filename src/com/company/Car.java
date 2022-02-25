package com.company;

public class Car implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("CAR IS CLOSING");

    }
    void drive(){
        System.out.println("The car is going");
    }
}

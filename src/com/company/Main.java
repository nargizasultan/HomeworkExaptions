package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	Car car =new Car();
        try(car) {
            
        }
        try {
            car.drive();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

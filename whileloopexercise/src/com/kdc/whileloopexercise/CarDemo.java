package com.kdc.whileloopexercise;

public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car(5);

        int passenger = 1;

        System.out.println("Car has " + car.getMaxSeats() + " number of seats.");

        while (passenger <= car.getMaxSeats()) {

            car.setMaxSeats(car.getMaxSeats() - 1);
            System.out.println("A person just stepped into the car, " + car.getMaxSeats() + " seats still available.");

        }

        System.out.println("Car is full! ");
    }
}

package com.template;

public class Elevator {

    int passengers;
    int floorQuantity;
    int passengerCapacity;

    public Elevator(int passengers, int floorQuantity, int passengerCapacity){
        this.passengers = passengers;
        this.floorQuantity = floorQuantity;
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCount() {
        return this.passengers;
    }

    public int addPassenger(){
        if (this.passengers == passengerCapacity){
            return this.passengers;
        }
        return this.passengers += 1;
    }

    public int removePassenger(){
        if (this.passengers - 1 > 0){
            return this.passengers -= 1;
        }
        return this.passengers;
    }

    public int moveToFloor(int n){
        if (n>= 0 && n<= floorQuantity){
            return this.floorQuantity = n;
        }
        return this.floorQuantity;
    }

    public int getCurrentFloor(){
        return this.floorQuantity;
    }



    /*Funciones a implementar:
    moveToFloor(),
    addPassenger()
    getPassengerCount(),
    getCurrentFloor(),
    removePassenger()

    Paramteros:
    (passengers, floorQuantity , passengerCapacity)

     */

    // Implement this class by observing the tests in this repo. From those you will be able
    // to pick what the constructors params are, what the methods are and what they should do.


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 * @author Anders
 */
public class ReservationDetail {
    private int typeOfVehicle;
    private int amountOfPassengers;

    public ReservationDetail(int typeOfVehicle, int amountOfPassengers) {
        this.typeOfVehicle      = typeOfVehicle;
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(int typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }
    
    
}

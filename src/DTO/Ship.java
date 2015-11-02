/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 * @author Anders
 */
public class Ship {
    private final int shipId;
    private final int shipSize;
    private final int passengerLimit;
    private final int vehicleLimit;

    public Ship(int shipId, int shipSize, int passengerLimit, int vehicleLimit) {
        this.shipId = shipId;
        this.shipSize = shipSize;
        this.passengerLimit = passengerLimit;
        this.vehicleLimit = vehicleLimit;
    }

    public int getShipId() {
        return shipId;
    }

    public int getShipSize() {
        return shipSize;
    }

    public int getPassengerLimit() {
        return passengerLimit;
    }

    public int getVehicleLimit() {
        return vehicleLimit;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

import java.util.Date;

/**
 * @author Anders
 */
public class Route {
    private int routeId;
    private int shipId;
    private int destinationId;
    private Date date;
    private double price;
    private String transitTime;
    private int currentPassengers;
    private int currentVehicles;    

    public Route(int routeId, int shipId, int destinationId, Date date, double price, String transitTime, int currentPassengers, int currentVehicles) {
        this.routeId           = routeId;
        this.shipId            = shipId;
        this.destinationId     = destinationId;
        this.date              = date;
        this.price             = price;
        this.transitTime       = transitTime;
        this.currentPassengers = currentPassengers;
        this.currentVehicles   = currentVehicles;
    }

    public int getRouteId() {
        return routeId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public Date getDate() {
        return date;
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(String transitTime) {
        this.transitTime = transitTime;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    public int getCurrentVehicles() {
        return currentVehicles;
    }

    public void setCurrentVehicles(int currentVehicles) {
        this.currentVehicles = currentVehicles;
    }
    
    
}

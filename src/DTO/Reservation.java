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
public class Reservation {
    private int reservationId;
    private int departureId;
    private Date reservationDate;
    private ReservationDetail details;

    public Reservation(int reservatinId, int departureId, Date reservationDate, int typeOfVehicle, int amountOfPassengers) {
        this.reservationId   = reservatinId;
        this.departureId     = departureId;
        this.reservationDate = reservationDate;
        this.details         = new ReservationDetail(typeOfVehicle, amountOfPassengers);
    }

    public int getReservatinId() {
        return reservationId;
    }

    public int getDepartureId() {
        return departureId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public ReservationDetail getDetails() {
        return details;
    }
    
    
}

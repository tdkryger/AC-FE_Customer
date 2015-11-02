/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

import java.util.Date;
import java.util.List;

/**
 * @author Anders
 */
public class Departure {
    private int departureId;
    private int routeId;
    private Date date;
    private List<Reservation> reservations;

    public Departure(int departureId, int routeId, Date date, List<Reservation> reservations) {
        this.departureId  = departureId;
        this.routeId      = routeId;
        this.date         = date;
        this.reservations = reservations;
    }

    public int getDepartureId() {
        return departureId;
    }

    public int getRouteId() {
        return routeId;
    }

    public Date getDate() {
        return date;
    }

    public List<Reservation> getReservations() {
        return reservations;
    } 
    
}

package contract;

import DTO.Customer;
import DTO.Departure;
import DTO.Reservation;
import DTO.Route;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Anders
 */
public interface DataRepository {
    public List<Reservation> getReservations(int customerId);
    public Reservation getReservation(int reservationId);
    public boolean makeReservation(Reservation reservation);
    public boolean changeReservation(Reservation reservation);
    public List<Route> getAllRoutes();
    public Route getRoute(int routeId);
    public List<Departure> getSchedule();
    public Departure getDeparture(int departureId);
    public Customer getCustomer(int customerId);
}
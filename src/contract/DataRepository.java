package contract;

import DTO.Customer;
import DTO.Departure;
import DTO.Reservation;
import DTO.Route;
import ETO.CouldNotChangeReservationError;
import ETO.CouldNotCreateReservationError;
import ETO.CouldNotFindCustomerError;
import ETO.CouldNotFindDepartureError;
import ETO.CouldNotFindRouteError;
import ETO.NoDeparturesFoundError;
import ETO.NoReservationFoundError;
import ETO.NoReservationsFoundError;
import ETO.NoRoutesFoundError;
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
    public List<Reservation> getReservations(int customerId) throws NoReservationsFoundError;
    public Reservation getReservation(int reservationId) throws NoReservationFoundError;
    public void makeReservation(Reservation reservation) throws CouldNotCreateReservationError;
    public void changeReservation(Reservation reservation) throws CouldNotChangeReservationError;
    
    public List<Route> getAllRoutes() throws NoRoutesFoundError;
    public Route getRoute(int routeId) throws CouldNotFindRouteError;
    
    public List<Departure> getSchedule() throws NoDeparturesFoundError;
    public Departure getDeparture(int departureId) throws CouldNotFindDepartureError;
    
    public Customer getCustomer(int customerId) throws CouldNotFindCustomerError;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 * @author Anders
 */
public class Destination {
    private int     destinationId;
    private String  destinationName;
    private boolean destinationHasNatives;

    public Destination(int destinationId, String destinationName, boolean destinationHasNatives) {
        this.destinationId          = destinationId;
        this.destinationName        = destinationName;
        this.destinationHasNatives  = destinationHasNatives;
    }

    public int getDestinationId() {
        return destinationId;
    }
    
    public String getDestinationName() {
        return destinationName;
    }

    public boolean isDestinationHasNatives() {
        return destinationHasNatives;
    }
     
    
}

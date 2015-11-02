/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 * @author Anders
 */
public class Customer {
    private final int customerId;
    private String firstName;
    private String lastName;
    private final CustomerDetail details;
    
    public Customer(int customerId, String firstName, String lastName, boolean isNative, String phoneNumber, String email, String address, String zipcode) {
        this.customerId = customerId;
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.details    = new CustomerDetail(customerId, isNative, phoneNumber, email, address, zipcode);
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CustomerDetail getDetails() {
        return details;
    }
}

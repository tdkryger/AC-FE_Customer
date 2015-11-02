/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author Anders
 */
public class CustomerDetail {
    private final int customerId;
    private boolean isNative;
    private String phoneNumber;
    private String email;
    private String address;
    private String zipcode;

    public CustomerDetail(int customerId, boolean isNative, String phoneNumber, String email, String address, String zipcode) {
        this.customerId  = customerId;
        this.isNative    = isNative;
        this.phoneNumber = phoneNumber;
        this.email       = email;
        this.address     = address;
        this.zipcode     = zipcode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean isIsNative() {
        return isNative;
    }

    public void setIsNative(boolean isNative) {
        this.isNative = isNative;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    
}

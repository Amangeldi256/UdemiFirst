package org.company.UdemiUrok.OOP.Fan;

public class Customer {
    private String name; 
    private Address homeAddress;
    private Address workAddress;

    
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
        
    }

    public Address getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
    public Address getWorkAddress() {
        return workAddress;
    }
    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }
    @Override
    public String toString() {
        return String.format("name - [%s] home Address [%s] work Address - [%s]",  
         name, homeAddress, workAddress);
    }

    



}

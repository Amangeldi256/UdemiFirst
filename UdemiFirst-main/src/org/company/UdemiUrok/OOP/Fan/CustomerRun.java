package org.company.UdemiUrok.OOP.Fan;

public class CustomerRun {
    public static void main(String[] args) {
        Address homeAddress = new Address("line1", "Baku", "5487");
        Customer customer = new Customer("CustommerOne", homeAddress);
        System.out.println(customer);

        Address workAddress = new Address("Line1", "Tegeran", "98745");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }

}
